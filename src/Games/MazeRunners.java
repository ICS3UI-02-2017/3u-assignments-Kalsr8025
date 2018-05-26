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
    Rectangle path1 = new Rectangle(50, 50, 50, 650);
    Rectangle path2 = new Rectangle(100, 50, 750, 50);
    Rectangle path3 = new Rectangle(800, 50, 50, 650);
    Rectangle path4 = new Rectangle(50, 700, 800, 50);
    //inner paths 
    Rectangle path5 = new Rectangle(100, 150, 700, 50);
    //horizontal lines 
    Rectangle path7 = new Rectangle(100, 250, 700, 50);
    Rectangle path8 = new Rectangle(100, 325, 700, 50);
    Rectangle path9 = new Rectangle(100, 450, 700, 50);
    Rectangle path10 = new Rectangle(100, 550, 700, 50);
    //vertical Lines 
    Rectangle path6 = new Rectangle(200, 100, 50, 100);
    Rectangle path11 = new Rectangle(400, 200, 50, 100);
    Rectangle path12 = new Rectangle(500, 360, 50, 100);
    Rectangle path13 = new Rectangle(300, 450, 50, 100);
    Rectangle path14 = new Rectangle(700, 450, 50, 100);
    Rectangle path15 = new Rectangle(456, 600, 50, 100);
    //new paths 
    Rectangle path16 = new Rectangle(580, 200, 50, 100);
    Rectangle path17 = new Rectangle(150, 360, 50, 100);
    Rectangle path18 = new Rectangle(190, 600, 50, 100);
    Rectangle path19 = new Rectangle(225, 250, 50, 100);
    Rectangle path20 = new Rectangle(650, 600, 50, 100);
    //text on the players 
    Font biggerfont = new Font("arial", Font.BOLD, 20);
    int p1 = 1;
    int p2 = 2;
    //score for the coins collected 
    Font scorefont = new Font("arial", Font.BOLD, 60);
    int p1score = 0;
    int p2score = 0;

    // GAME VARIABLES END HERE    
    // Constructor to create the Frame and place the panel in
    // You will learn more about this in Grade 12 :)
    public MazeRunners() {
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
        g.setColor(Color.GREEN);
        g.fillRect(0, 0, WIDTH, HEIGHT);

        //Score screen at the bottom 
        g.setColor(Color.BLUE);
        g.fillRect(0, 800, 900, 200);

        // pathway 
        g.setColor(Color.GRAY);
        g.fillRect(path1.x, path1.y, path1.width, path1.height);
        g.fillRect(path2.x, path2.y, path2.width, path2.height);
        g.fillRect(path3.x, path3.y, path3.width, path3.height);
        g.fillRect(path4.x, path4.y, path4.width, path4.height);
        g.fillRect(path5.x, path5.y, path5.width, path5.height);
        g.fillRect(path6.x, path6.y, path6.width, path6.height);
        g.fillRect(path7.x, path7.y, path7.width, path7.height);
        g.fillRect(path8.x, path8.y, path8.width, path8.height);
        g.fillRect(path9.x, path9.y, path9.width, path9.height);
        g.fillRect(path10.x, path10.y, path10.width, path10.height);
        g.fillRect(path11.x, path11.y, path11.width, path11.height);
        g.fillRect(path12.x, path12.y, path12.width, path12.height);
        g.fillRect(path13.x, path13.y, path13.width, path13.height);
        g.fillRect(path14.x, path14.y, path14.width, path14.height);
        g.fillRect(path15.x, path15.y, path15.width, path15.height);
        g.fillRect(path16.x, path16.y, path16.width, path16.height);
        g.fillRect(path17.x, path17.y, path17.width, path17.height);
        g.fillRect(path18.x, path18.y, path18.width, path18.height);
        g.fillRect(path19.x, path19.y, path19.width, path19.height);
        g.fillRect(path20.x, path20.y, path20.width, path20.height);


        //Players 
        //player 1
        g.setColor(Color.RED);
        g.fillOval(55, 55, 50, 50);

        //player 2
        g.setColor(Color.MAGENTA);
        g.fillOval(795, 55, 50, 50);

        //font the players 
        //player 1 font 
        g.setColor(Color.BLACK);
        g.setFont(biggerfont);
        g.drawString("" + p1, 73, 87);
        g.drawString("" + p2, 815, 87);

        //text on the bottom 
        //player 1 bottom
        g.setColor(Color.RED);
        g.fillOval(55, 825, 50, 50);
        //player 2 bottom 
        g.setColor(Color.MAGENTA);
        g.fillOval(550, 825, 50, 50);
        //text on players at the bottom 
        g.setColor(Color.BLACK);
        g.setFont(biggerfont);
        g.drawString("" + p1, 70, 860);
        g.drawString("" + p2, 570, 860);


        //Placing Coins in the pathway 
        g.setColor(Color.YELLOW);

        //scores 
        //draw scores 
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
    }

    private void checkForCollision() {
    }

    private void player1Move() {
    }

    private void player2Move() {
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
        }

        // if a key has been released
        @Override
        public void keyReleased(KeyEvent e) {
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
