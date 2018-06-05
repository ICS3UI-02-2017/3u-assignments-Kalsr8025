package Games;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import javax.swing.Timer;

/**
 *
 * @author kalsr8025
 */
public class MazeRunners extends JComponent implements ActionListener {

    // Height and Width of our game
    static final int WIDTH = 900;
    static final int HEIGHT = 900;
    //Title of the window
    String title = "MAZE RUNNER";
    // sets the framerate and delay for our game
    // this calculates the number of milliseconds per frame
    // you just need to select an approproate framerate
    int desiredFPS = 60;
    int desiredTime = Math.round((1000 / desiredFPS));
    // timer used to run the game loop
    // this is what keeps our time running smoothly :)
    Timer gameTimer;
    // YOUR GAME VARIABLES WOULD GO HERE
    //maze walls 
    //The outer path 
    Rectangle path = new Rectangle(50, 50, 800, 700);
    //inner barriers 
    Rectangle[] walls = new Rectangle[15];
    //score for the coins collected 
    Font scorefont = new Font("arial", Font.BOLD, 60);
    int p1score = 0;
    int p2score = 0;
    //player moves 
    //player 1
    boolean player1UP = false;
    boolean player1DOWN = false;
    boolean player1RIGHT = false;
    boolean player1LEFT = false;
    //Player 2
    boolean player2UP = false;
    boolean player2DOWN = false;
    boolean player2RIGHT = false;
    boolean player2LEFT = false;
    //players 
    Rectangle player1 = new Rectangle(55, 55, 30, 30);
    Rectangle player2 = new Rectangle(795, 55, 30, 30);
    //coins 
    Rectangle[] coins = new Rectangle[20];
    //clearing the screen once the game has ended 
    Rectangle clear = new Rectangle(0, 0, WIDTH, HEIGHT);
    //winning text
    Font wonfont = new Font("arial", Font.BOLD, 70);
    //set the colour value to change
    int randNumR1 = (int) (Math.random() * (255 - 0 + 1)) + 0;
    int randNumG1 = (int) (Math.random() * (255 - 0 + 1)) + 0;
    int randNumB1 = (int) (Math.random() * (255 - 0 + 1)) + 0;

    Color wallcolour = new Color(100, 100, 100);

    // GAME VARIABLES END HERE    
    // Constructor to create the Frame and place the panel in
    // You will learn more about this in Grade 12 :)
    public MazeRunners() {
        // creates a windows to show my game
        JFrame frame = new JFrame(title);
        preSetup();
        // sets the size of my game
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        // adds the game to the window
        frame.add(this);

        // sets some options and size of the window automatically
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        // shows the window to the user
        frame.setVisible(true);

        // add listeners for keyboard and mouse
        frame.addKeyListener(new Keyboard());
        Mouse m = new Mouse();
        this.addMouseMotionListener(m);
        this.addMouseWheelListener(m);
        this.addMouseListener(m);

        gameTimer = new Timer(desiredTime, this);
        gameTimer.setRepeats(true);
        gameTimer.start();
    }

    // drawing of the game happens in here
    // we use the Graphics object, g, to perform the drawing
    // NOTE: This is already double buffered!(helps with framerate/speed)
    @Override
    public void paintComponent(Graphics g) {
        // always clear the screen first!
        g.clearRect(0, 0, WIDTH, HEIGHT);

        // GAME DRAWING GOES HERE
        //change the background 
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, WIDTH, HEIGHT);

        //Score screen at the bottom 
        g.setColor(Color.BLACK);
        g.fillRect(0, 800, 900, 200);

        // pathway 
        g.setColor(Color.GRAY);
        g.fillRect(path.x, path.y, path.width, path.height);

        //for statement to fill and outline the walls 
        for (int i = 0; i < walls.length; i++) {
            g.setColor(wallcolour);
            g.fillRect(walls[i].x, walls[i].y, walls[i].width, walls[i].height);
            g.setColor(Color.BLACK);
            g.drawRect(walls[i].x, walls[i].y, walls[i].width, walls[i].height);
        }

        //Players 
        //player 1
        g.setColor(Color.RED);
        g.fillOval(player1.x, player1.y, player1.width, player1.height);
        g.setColor(Color.BLACK);
        g.drawOval(player1.x, player1.y, player1.width, player1.height);

        //player 2
        g.setColor(Color.MAGENTA);
        g.fillOval(player2.x, player2.y, player2.width, player2.height);
        g.setColor(Color.BLACK);
        g.drawOval(player2.x, player2.y, player2.width, player2.height);

        //text on the bottom 
        //player 1 bottom
        g.setColor(Color.RED);
        g.fillOval(100, 830, 50, 50);
        //player 2 bottom 
        g.setColor(Color.MAGENTA);
        g.fillOval(600, 830, 50, 50);

        //Placing Coins in the pathway 
        g.setColor(Color.YELLOW);
        //COINS 
        //coins at the bottom 
        g.fillOval(175, 840, 30, 30);
        g.fillOval(675, 840, 30, 30);

        //in maze coins
        for (int i = 0; i < coins.length; i++) {
            g.fillOval(coins[i].x, coins[i].y, coins[i].width, coins[i].height);
        }

        //scores 
        //draw scores 
        g.setColor(Color.YELLOW);
        g.setFont(scorefont);
        g.drawString("" + p1score, 225, 875);
        g.drawString("" + p2score, 720, 875);

        //END SCREEN 
        if (p1score + p2score == 20) {
            g.setColor(Color.BLACK);
            g.fillRect(clear.x, clear.y, clear.width, clear.height);
            //print the end
            g.setColor(Color.WHITE);
            g.setFont(wonfont);
            g.drawString("THE END", 350, 150);
            //print the players scores 
            g.setFont(scorefont);
            g.drawString("PLAYER 1", 100, 250);
            g.drawString("" + p1score, 600, 250);
            g.drawString("PLAYER 2", 100, 350);
            g.drawString("" + p2score, 600, 350);

            if (p1score > p2score) {
                g.setColor(Color.RED);
                g.setFont(wonfont);
                g.drawString("YOU WON PLAYER 1", 100, 700);
            }
            if (p2score > p1score) {
                g.setColor(Color.MAGENTA);
                g.setFont(wonfont);
                g.drawString("YOU WON PLAYER 2", 100, 700);
            }
            if (p1score == p2score) {
                g.setColor(Color.WHITE);
                g.setFont(wonfont);
                g.drawString("TIE", 100, 700);
            }
        }
        //https://processing.org/examples/hue.html
        //wall colour change test
//        int whichBar = mouseX / barWidth;
//        if (whichBar != lastBar) {
//           int barX = whichBar * barWidth;
//         g.fillRect(mouseY, height, height);
//            g.fillRect(barX, barX, barX, barX);rect(barX, 0, barWidth, height);
//            lastBar = whichBar;


        // GAME DRAWING ENDS HERE
    }

    // This method is used to do any pre-setup you might need to do
    // This is run before the game loop begins!
    public void preSetup() {
        // Any of your pre setup before the loop starts should go here
        //setting up the walls by using arrays 
        walls[0] = new Rectangle(100, 100, 100, 100);
        walls[1] = new Rectangle(700, 100, 100, 100);
        walls[2] = new Rectangle(700, 600, 100, 100);
        walls[3] = new Rectangle(100, 600, 100, 100);
        // inside 
        walls[4] = new Rectangle(100, 250, 700, 50);
        walls[5] = new Rectangle(500, 100, 50, 150);
        walls[6] = new Rectangle(300, 100, 150, 100);
        walls[7] = new Rectangle(150, 350, 500, 50);
        walls[8] = new Rectangle(100, 450, 200, 100);
        walls[9] = new Rectangle(400, 450, 50, 250);
        walls[10] = new Rectangle(300, 500, 50, 150);
        walls[11] = new Rectangle(550, 450, 250, 70);
        walls[12] = new Rectangle(500, 600, 150, 50);
        walls[13] = new Rectangle(750, 350, 50, 50);
        walls[14] = new Rectangle(650, 100, 50, 50);

        //setting up coins 
        coins[0] = new Rectangle(200, 65, 15, 15);
        coins[1] = new Rectangle(200, 215, 15, 15);
        coins[2] = new Rectangle(500, 65, 15, 15);
        coins[3] = new Rectangle(600, 200, 15, 15);
        coins[4] = new Rectangle(450, 215, 15, 15);
        coins[5] = new Rectangle(800, 215, 15, 15);
        coins[6] = new Rectangle(250, 315, 15, 15);
        coins[7] = new Rectangle(600, 315, 15, 15);
        coins[8] = new Rectangle(815, 350, 15, 15);
        coins[9] = new Rectangle(65, 415, 15, 15);
        coins[10] = new Rectangle(500, 415, 15, 15);
        coins[11] = new Rectangle(325, 475, 15, 15);
        coins[12] = new Rectangle(475, 550, 15, 15);
        coins[13] = new Rectangle(650, 550, 15, 15);
        coins[14] = new Rectangle(275, 600, 15, 15);
        coins[15] = new Rectangle(200, 715, 15, 15);
        coins[16] = new Rectangle(400, 725, 15, 15);
        coins[17] = new Rectangle(550, 675, 15, 15);
        coins[18] = new Rectangle(700, 715, 15, 15);
        coins[19] = new Rectangle(815, 515, 15, 15);

    }

    // The main game loop
    // In here is where all the logic for my game will go
    public void gameLoop() {
        checkForCollision();
        player1Move();
        player2Move();
        changethewallcolor();
        collectingcoins();


    }

    private void checkForCollision() {
        //big square borders 
        //player 1
        if (player1.x < path.x) {
            player1.x = 55;
        }
        if (player1.y < path.y) {
            player1.y = 55;
        }
        if ((player1.y + 30) > 750) {
            player1.y = 710;
        }
        if ((player1.x + 30) > 850) {
            player1.x = 810;
        }
        //player 2 
        if (player2.x < path.x) {
            player2.x = 55;
        }
        if (player2.y < path.y) {
            player2.y = 55;
        }
        if ((player2.y + 30) > 750) {
            player2.y = 710;
        }
        if ((player2.x + 30) > 850) {
            player2.x = 810;
        }

        //collision with other walls 
        //player 1
        for (int x = 0; x < walls.length; x++) {
            if (player1.intersects(walls[x])) {
                player1.x = 55;
                player1.y = 55;
            }
        }

        //player 2
        for (int y = 0; y < walls.length; y++) {
            if (player2.intersects(walls[y])) {
                player2.x = 795;
                player2.y = 55;
            }
        }

    }

    private void player1Move() {
        //player 1 move Y 
        if (player1UP) {
            player1.y -= 5;
        } else if (player1DOWN) {
            player1.y += 5;
        }
        //player 1 X
        if (player1RIGHT) {
            player1.x -= 5;
        } else if (player1LEFT) {
            player1.x += 5;
        }
    }

    private void player2Move() {
        //player 2 move Y 
        if (player2UP) {
            player2.y -= 5;
        } else if (player2DOWN) {
            player2.y += 5;
        }
        //player 2 X
        if (player2RIGHT) {
            player2.x += 5;
        } else if (player2LEFT) {
            player2.x -= 5;
        }
    }

    private void changethewallcolor() {
        for (int c = 0; c < coins.length; c++) {
            if (player1.intersects(coins[c])) {
                wallcolour = new Color(randNumR1, randNumG1, randNumB1);
            }
            if (player2.intersects(coins[c])) {
                wallcolour = new Color(randNumR1, randNumG1, randNumB1);
            }
        }
    }

    private void collectingcoins() {
        for (int c = 0; c < coins.length; c++) {
            if (player1.intersects(coins[c])) {
                p1score += 1;
                coins[c].x = 180;
                coins[c].y = 845;
            }
            if (player2.intersects(coins[c])) {
                p2score += 1;
                coins[c].x = 680;
                coins[c].y = 845;
            }
        }
    }

    // Used to implement any of the Mouse Actions
    private class Mouse extends MouseAdapter {

        // if a mouse button has been pressed down
        @Override
        public void mousePressed(MouseEvent e) {
        }

        // if a mouse button has been released
        @Override
        public void mouseReleased(MouseEvent e) {
        }

        // if the scroll wheel has been moved
        @Override
        public void mouseWheelMoved(MouseWheelEvent e) {
        }

        // if the mouse has moved positions
        @Override
        public void mouseMoved(MouseEvent e) {
        }
    }

    // Used to implements any of the Keyboard Actions
    private class Keyboard extends KeyAdapter {

        // if a key has been pressed down
        @Override
        public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();

            //player 1 up and down 
            if (keyCode == KeyEvent.VK_W) {
                player1UP = true;
            } else if (keyCode == KeyEvent.VK_S) {
                player1DOWN = true;
            }
            //player 2 up and down 
            if (keyCode == KeyEvent.VK_UP) {
                player2UP = true;
            } else if (keyCode == KeyEvent.VK_DOWN) {
                player2DOWN = true;
            }
            //player 1 right and left  
            if (keyCode == KeyEvent.VK_A) {
                player1RIGHT = true;
            } else if (keyCode == KeyEvent.VK_D) {
                player1LEFT = true;
            }
            //player 2 right and left  
            if (keyCode == KeyEvent.VK_RIGHT) {
                player2RIGHT = true;
            } else if (keyCode == KeyEvent.VK_LEFT) {
                player2LEFT = true;
            }
        }

        // if a key has been released
        @Override
        public void keyReleased(KeyEvent e) {
            int keyCode = e.getKeyCode();

            //stop the command once relased  
            //player 1 up and down 
            if (keyCode == KeyEvent.VK_W) {
                player1UP = false;
            } else if (keyCode == KeyEvent.VK_S) {
                player1DOWN = false;
            }
            //player 2 up and down 
            if (keyCode == KeyEvent.VK_UP) {
                player2UP = false;
            } else if (keyCode == KeyEvent.VK_DOWN) {
                player2DOWN = false;
            }
            //player 1 right and left  
            if (keyCode == KeyEvent.VK_A) {
                player1RIGHT = false;
            } else if (keyCode == KeyEvent.VK_D) {
                player1LEFT = false;
            }
            //player 2 right and left  
            if (keyCode == KeyEvent.VK_RIGHT) {
                player2RIGHT = false;
            } else if (keyCode == KeyEvent.VK_LEFT) {
                player2LEFT = false;
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        gameLoop();
        repaint();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creates an instance of my game
        MazeRunners game = new MazeRunners();
    }
}
