package Examples;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
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
public class Game extends JComponent implements ActionListener {

    // Height and Width of our game
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    //Title of the window
    String title = "My Game";
    // sets the framerate and delay for our game
    // this calculates the number of milliseconds per frame
    // you just need to select an approproate framerate
    int desiredFPS = 60; //fast high and slow low 
    int desiredTime = Math.round((1000 / desiredFPS));
    // timer used to run the game loop
    // this is what keeps our time running smoothly :)
    Timer gameTimer;

    // YOUR GAME VARIABLES WOULD GO HERE
    //hex colour
    Color purple = new Color(66, 29, 122);
    
    
    
    // GAME VARIABLES END HERE    
    // Constructor to create the Frame and place the panel in
    // You will learn more about this in Grade 12 :)
    public Game() {
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

        //This is the game loop 
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

        //set the colour 
        g.setColor(Color.MAGENTA);

        // GAME DRAWING GOES HERE
        //draw a filled rectangle 
        // (x,y,width,height)
        g.fillRect(WIDTH / 6, HEIGHT / 6, WIDTH / 6, HEIGHT / 6);
        //Outlines it 
        g.setColor(Color.BLACK);
        g.drawRect(WIDTH / 6, HEIGHT / 6, WIDTH / 6, HEIGHT / 6);

        //Colour for oval 
        g.setColor(Color.yellow);
        //draw anything that is an oval 
        g.fillOval(WIDTH / 6, HEIGHT / 6, WIDTH / 6, HEIGHT / 6);
        //Outline
        g.setColor(Color.BLACK);
        g.drawOval(WIDTH / 6, HEIGHT / 6, WIDTH / 6, HEIGHT / 6);

        //rounds the corner of rectangle 
        //(x,y,width,height,wradius,hradius)
        g.fillRoundRect(300, 75, 150, 50, 20, 20);

        //draw a polygon 
        int[] traingleX = {500, 600, 450};
        int[] traingleY = {400, 500, 500};
        //(array of x, array y, number of points
        g.fillPolygon(traingleX, traingleY, 3);

        //Arc
        g.setColor(Color.yellow);
        //(x,y,width,height,start angle, amount of rotation
        g.fillArc(100, 400, 100, 100, 45, 270);
        g.setColor(Color.BLACK);
        g.drawArc(100, 400, 100, 100, 45, 270);

        g.setColor(Color.DARK_GRAY);
        //(x,y,x,y)
        g.drawLine(100, 100, 100, 100);
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
        Game game = new Game();
    }
}
