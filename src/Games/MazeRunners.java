package Games;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Color;
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
        g.setColor(Color.YELLOW);
        g.fillRect(0, 800, 900, 100);

        //wall path 
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
