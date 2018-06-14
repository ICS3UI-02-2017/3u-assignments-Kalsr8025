package Games;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.JComponent;
import javax.swing.JFrame;
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
 * @author Kalsr8025
 */
public class Airhockey_testing extends JComponent implements ActionListener {

    // Height and Width of our game
    static final int WIDTH = 1000;
    static final int HEIGHT = 600;
    //Title of the window
    String title = "Air Hockey";
    // sets the framerate and delay for our game
    // this calculates the number of milliseconds per frame
    // you just need to select an approproate framerate
    int desiredFPS = 60;
    int desiredTime = Math.round((1000 / desiredFPS));
    // timer used to run the game loop
    // this is what keeps our time running smoothly :)
    Timer gameTimer;
    // YOUR GAME VARIABLES WOULD GO HERE  
    Rectangle puck = new Rectangle(468, 268, 60, 60);
    Rectangle pucktop = new Rectangle(473, 273, 50, 50);
    //top and bottom of player one 
    Rectangle player1 = new Rectangle(20, 267, 80, 80);
    Rectangle player1top = new Rectangle(40, 287, 40, 40);
    //top and bottom of player two
    Rectangle player2 = new Rectangle(900, 267, 80, 80);
    Rectangle player2top = new Rectangle(920, 287, 40, 40);
    //Puck movement 
    //ball bouncing
    int ballAngle = 45;
    int ballSpeed = 5;
    //booleans 
    //player 1 
    boolean moveup1 = false;
    boolean movedown1 = false;
    boolean moveright1 = false;
    boolean moveleft1 = false;
    //player 2
    boolean moveup2 = false;
    boolean movedown2 = false;
    boolean moveright2 = false;
    boolean moveleft2 = false;
    //scores 
    int score1 = 0;
    int score2 = 0;
    //create custom font 
    Font scorefont = new Font("arial", Font.BOLD, 36);

    // GAME VARIABLES END HERE    
    // Constructor to create the Frame and place the panel in
    // You will learn more about this in Grade 12 :)
    public Airhockey_testing() {
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
        //border for game 
        g.setColor(Color.RED);
        //rectangle 
        g.fillRect(0, 0, 1000, 600);
        //white 
        g.setColor(Color.WHITE);
        //rectangle 
        g.fillRect(10, 10, 980, 580);

        //goals 
        //set color to be black 
        g.setColor(Color.RED);
        //make 4 walls for goals 
        //right walls 
        g.fillRect(975, 350, 20, 10);
        g.fillRect(975, 250, 20, 10);
        //left walls 
        g.fillRect(0, 350, 20, 10);
        g.fillRect(0, 250, 20, 10);

        //air hockey design 
        //change color 
        g.setColor(Color.RED);
        //circle in the middle 
        g.fillOval(400, 200, 200, 200);
        //lines 
        g.fillRect(490, 0, 20, 600);
        //change to white 
        g.setColor(Color.WHITE);
        //circle 
        g.fillOval(425, 225, 150, 150);

        //puck
        g.setColor(Color.BLACK);
        g.fillOval(puck.x, puck.y, puck.height, 60);
        g.setColor(Color.DARK_GRAY);
        g.fillOval(473, 273, 50, 50);

        //player one 
        g.setColor(Color.BLACK);
        //circle 
        g.fillOval(20, 267, 80, 80);
        //top part 
        g.setColor(Color.CYAN);
        //top circle 
        g.fillOval(40, 287, 40, 40);

        //player two 
        g.setColor(Color.BLACK);
        //circle 
        g.fillOval(900, 267, 80, 80);
        //top part 
        g.setColor(Color.PINK);
        //top circle 
        g.fillOval(920, 287, 40, 40);


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
            //get the keycode 
            int keycode = e.getKeyCode();

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
        Airhockey_testing game = new Airhockey_testing();
    }
}
