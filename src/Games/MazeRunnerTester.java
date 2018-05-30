package Games;

import static Games.MazeRunners.WIDTH;
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
public class MazeRunnerTester extends JComponent implements ActionListener {

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
    
    //testing
    Rectangle[] walls = new Rectangle[15]; 
    
    //squares on each corner  
    Rectangle wall1 = new Rectangle(100, 100, 100, 100);
    Rectangle wall2 = new Rectangle(700, 100, 100, 100);
    Rectangle wall3 = new Rectangle(700, 600, 100, 100);
    Rectangle wall4 = new Rectangle(100, 600, 100, 100);
    // inside 
    Rectangle wall5 = new Rectangle(100, 250, 700, 50);
    Rectangle wall6 = new Rectangle(500, 100, 50, 150);
    Rectangle wall7 = new Rectangle(300, 100, 150, 100);
    Rectangle wall8 = new Rectangle(150, 350, 500, 50);
    Rectangle wall9 = new Rectangle(100, 450, 200, 100);
    Rectangle wall10 = new Rectangle(400, 450, 50, 250);
    Rectangle wall11 = new Rectangle(300, 500, 50, 150);
    Rectangle wall12 = new Rectangle(550, 450, 250, 70);
    Rectangle wall13 = new Rectangle(500, 600, 150, 50);
    Rectangle wall14 = new Rectangle(750, 350, 50, 50);
    Rectangle wall15 = new Rectangle(650, 100, 50, 50);
    //text on the players 
    Font biggerfont = new Font("arial", Font.BOLD, 20);
    int p1 = 1;
    int p2 = 2;
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
    Rectangle coins = new Rectangle(55, 55, 30, 30);

    // GAME VARIABLES END HERE    
    // Constructor to create the Frame and place the panel in
    // You will learn more about this in Grade 12 :)
    public MazeRunnerTester() {
        // creates a windows to show my game
        JFrame frame = new JFrame(title);

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
        frame.addKeyListener(new MazeRunnerTester.Keyboard());
        MazeRunnerTester.Mouse m = new MazeRunnerTester.Mouse();
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
        g.setColor(Color.GREEN);
        g.fillRect(0, 0, WIDTH, HEIGHT);

        //Score screen at the bottom 
        g.setColor(Color.BLACK);
        g.fillRect(0, 800, 900, 200);

        //
        g.setColor(Color.WHITE);
        for (int i = 0; i < walls.length; i++) {
            //walls [1]= 
            
        }
        
        // pathway 
        g.setColor(Color.GRAY);
        g.fillRect(path.x, path.y, path.width, path.height);
        g.setColor(Color.GREEN);
        g.fillRect(wall1.x, wall1.y, wall1.width, wall1.height);
        g.fillRect(wall2.x, wall2.y, wall2.width, wall2.height);
        g.fillRect(wall3.x, wall3.y, wall3.width, wall3.height);
        g.fillRect(wall4.x, wall4.y, wall4.width, wall4.height);
        g.fillRect(wall5.x, wall5.y, wall5.width, wall5.height);
        g.fillRect(wall6.x, wall6.y, wall6.width, wall6.height);
        g.fillRect(wall7.x, wall7.y, wall7.width, wall7.height);
        g.fillRect(wall8.x, wall8.y, wall8.width, wall8.height);
        g.fillRect(wall9.x, wall9.y, wall9.width, wall9.height);
        g.fillRect(wall10.x, wall10.y, wall10.width, wall10.height);
        g.fillRect(wall11.x, wall11.y, wall11.width, wall11.height);
        g.fillRect(wall12.x, wall12.y, wall12.width, wall12.height);
        g.fillRect(wall13.x, wall13.y, wall13.width, wall13.height);
        g.fillRect(wall14.x, wall14.y, wall14.width, wall14.height);
        g.fillRect(wall15.x, wall15.y, wall15.width, wall15.height);

        //Players 
        //player 1
        g.setColor(Color.RED);
        g.fillRect(player1.x, player1.y, player1.width, player1.height);


        //player 2
        g.setColor(Color.MAGENTA);
        g.fillRect(player2.x, player2.y, player2.width, player2.height);

        //text on the bottom 
        //player 1 bottom
        g.setColor(Color.RED);
        g.fillRect(50, 830, 50, 50);
        //player 2 bottom 
        g.setColor(Color.MAGENTA);
        g.fillRect(550, 830, 50, 50);
        //text on players at the bottom 
        g.setColor(Color.BLACK);
        g.setFont(biggerfont);
        g.drawString("" + p1, 70, 860);
        g.drawString("" + p2, 570, 860);

        //Placing Coins in the pathway 
        g.setColor(Color.YELLOW);
        //COINS 
        
        
        //scores 
        //draw scores 
        g.setColor(Color.GREEN);
        g.setFont(scorefont);
        g.drawString("" + p1score, 225, 875);
        g.drawString("" + p2score, 720, 875);

        // GAME DRAWING ENDS HERE
    }

    // This method is used to do any pre-setup you might need to do
    // This is run before the game loop begins!
    public void preSetup() {
        // Any of your pre setup before the loop starts should go here
    }

    // The main game loop
    // In here is where all the logic for my game will go
    public void gameLoop() {
        checkForCollision();
        player1Move();
        player2Move();
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
        if (player1.intersects(wall1)) {
            player1.x = 55;
            player1.y = 55;
        }
        if (player1.intersects(wall2)) {
            player1.x = 55;
            player1.y = 55;
        }
        if (player1.intersects(wall3)) {
            player1.x = 55;
            player1.y = 55;
        }
        if (player1.intersects(wall4)) {
            player1.x = 55;
            player1.y = 55;
        }
        if (player1.intersects(wall5)) {
            player1.x = 55;
            player1.y = 55;
        }
        if (player1.intersects(wall6)) {
            player1.x = 55;
            player1.y = 55;
        }
        if (player1.intersects(wall7)) {
            player1.x = 55;
            player1.y = 55;
        }
        if (player1.intersects(wall8)) {
            player1.x = 55;
            player1.y = 55;
        }
        if (player1.intersects(wall9)) {
            player1.x = 55;
            player1.y = 55;
        }
        if (player1.intersects(wall10)) {
            player1.x = 55;
            player1.y = 55;
        }
        if (player1.intersects(wall11)) {
            player1.x = 55;
            player1.y = 55;
        }
        if (player1.intersects(wall12)) {
            player1.x = 55;
            player1.y = 55;
        }
        if (player1.intersects(wall13)) {
            player1.x = 55;
            player1.y = 55;
        }
        if (player1.intersects(wall14)) {
            player1.x = 55;
            player1.y = 55;
        }
        if (player1.intersects(wall15)) {
            player1.x = 55;
            player1.y = 55;
        }

        //player 2 
        if (player2.intersects(wall1)) {
            player2.x = 795;
            player2.y = 55;
        }
        if (player1.intersects(wall2)) {
            player1.x = 55;
            player1.y = 55;
        }
        if (player1.intersects(wall3)) {
            player1.x = 55;
            player1.y = 55;
        }
        if (player1.intersects(wall4)) {
            player1.x = 55;
            player1.y = 55;
        }
        if (player1.intersects(wall5)) {
            player1.x = 55;
            player1.y = 55;
        }
        if (player1.intersects(wall6)) {
            player1.x = 55;
            player1.y = 55;
        }
        if (player1.intersects(wall7)) {
            player1.x = 55;
            player1.y = 55;
        }
        if (player1.intersects(wall8)) {
            player1.x = 55;
            player1.y = 55;
        }
        if (player1.intersects(wall9)) {
            player1.x = 55;
            player1.y = 55;
        }
        if (player1.intersects(wall10)) {
            player1.x = 55;
            player1.y = 55;
        }
        if (player1.intersects(wall11)) {
            player1.x = 55;
            player1.y = 55;
        }
        if (player1.intersects(wall12)) {
            player1.x = 55;
            player1.y = 55;
        }
        if (player1.intersects(wall13)) {
            player1.x = 55;
            player1.y = 55;
        }
        if (player1.intersects(wall14)) {
            player1.x = 55;
            player1.y = 55;
        }
        if (player1.intersects(wall15)) {
            player1.x = 55;
            player1.y = 55;
        }
        //player 2
         if (player2.intersects(wall1)) {
            player2.x = 795;
            player2.y = 55;
        }
        if (player2.intersects(wall2)) {
            player2.x = 795;
            player2.y = 55;
        }
        if (player2.intersects(wall3)) {
            player2.x = 795;
            player2.y = 55;
        }
        if (player2.intersects(wall4)) {
            player2.x = 795;
            player2.y = 55;
        }
        if (player2.intersects(wall5)) {
            player2.x = 795;
            player2.y = 55;
        }if (player2.intersects(wall6)) {
            player2.x = 795;
            player2.y = 55;
        }
        if (player2.intersects(wall7)) {
            player2.x = 795;
            player2.y = 55;
        }
        if (player2.intersects(wall8)) {
            player2.x = 795;
            player2.y = 55;
        }
        if (player2.intersects(wall9)) {
            player2.x = 795;
            player2.y = 55;
        }
        if (player2.intersects(wall10)) {
            player2.x = 795;
            player2.y = 55;
        }
        if (player2.intersects(wall11)) {
            player2.x = 795;
            player2.y = 55;
        }
        if (player2.intersects(wall12)) {
            player2.x = 795;
            player2.y = 55;
        }
        if (player2.intersects(wall13)) {
            player2.x = 795;
            player2.y = 55;
        }
        if (player2.intersects(wall14)) {
            player2.x = 795;
            player2.y = 55;
        }
        if (player2.intersects(wall15)) {
            player2.x = 795;
            player2.y = 55;
        }
    }

    private void player1Move() {
        //player 1 move Y 
        if (player1UP) {
            player1.y -= 3;
        } else if (player1DOWN) {
            player1.y += 3;
        }
        //player 1 X
        if (player1RIGHT) {
            player1.x -= 3;
        } else if (player1LEFT) {
            player1.x += 3;
        }
    }

    private void player2Move() {
        //player 2 move Y 
        if (player2UP) {
            player2.y -= 3;
        } else if (player2DOWN) {
            player2.y += 3;
        }
        //player 2 X
        if (player2RIGHT) {
            player2.x += 3;
        } else if (player2LEFT) {
            player2.x -= 3;
        }
    }

    private void collectingcoins() {
      
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
        preSetup();
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
