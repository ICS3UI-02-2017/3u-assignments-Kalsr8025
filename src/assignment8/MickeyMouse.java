package assignment8;

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
public class MickeyMouse extends JComponent implements ActionListener {

    // Height and Width of our game
    static final int WIDTH = 750;
    static final int HEIGHT = 750;
    //Title of the window
    String title = "Mickey Mouse";
    // sets the framerate and delay for our game
    // this calculates the number of milliseconds per frame
    // you just need to select an approproate framerate
    int desiredFPS = 5;
    int desiredTime = Math.round((1000 / desiredFPS));
    // timer used to run the game loop
    // this is what keeps our time running smoothly :)
    Timer gameTimer;
    // YOUR GAME VARIABLES WOULD GO HERE
    Color faceskin = new Color(239, 195, 129);
    //int for the moving of nose
    int nosemove = 300;
    int nosedotmove = 385;
    //int of movement of eyes 
    int eyemove1x = 280;
    int eyedotmove1x = 300;
    int eyemove2x = 425;
    int eyedotmove2x = 445;
    int eyemove1y = 370;
    int eyemove2y = 380;

    // GAME VARIABLES END HERE    
    // Constructor to create the Frame and place the panel in
    // You will learn more about this in Grade 12 :)
    public MickeyMouse() {
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
        //Make the face of Minnie Mouse 
        g.setColor(Color.BLACK);
        g.fillOval(125, 200, 500, 450);
        //ears 
        g.fillOval(45, 30, 275, 275);
        g.fillOval(400, 30, 275, 275);
        //face skin 
        g.setColor(faceskin);
        g.fillOval(125, 450, 500, 200);
        g.setColor(Color.BLACK);
        g.drawOval(125, 450, 500, 200);
        g.setColor(faceskin);
        g.fillOval(200, 250, 200, 300);
        g.fillOval(350, 250, 200, 300);
        g.fillOval(275, 550, 200, 150);
        g.setColor(Color.BLACK);
        g.drawArc(275, 550, 200, 150, 180, 180);
        //eyes
        g.setColor(Color.WHITE);
        g.fillOval(250, 310, 100, 160);
        g.fillOval(400, 310, 100, 160);
        g.setColor(Color.BLACK);
        g.drawOval(250, 310, 100, 160);
        g.drawOval(400, 310, 100, 160);
        //pupils 
        g.setColor(Color.BLACK);
        g.fillOval(eyemove1x, eyemove1y, 40, 75);
        g.fillOval(eyemove2x, eyemove1y, 40, 75);
        g.setColor(Color.WHITE);
        g.fillOval(eyedotmove1x, eyemove2y, 10, 10);
        g.fillOval(eyedotmove2x, eyemove2y, 10, 10);
        //nose 
        g.setColor(Color.BLACK);
        g.fillOval(nosemove, 480, 150, 90);
        g.setColor(Color.WHITE);
        g.fillOval(nosedotmove, 495, 30, 30);
        //mouth
        g.setColor(Color.BLACK);
        g.fillArc(300, 525, 150, 150, 180, 180);
        g.setColor(Color.PINK);
        g.fillArc(325, 560, 100, 100, 180, 180);
        g.setColor(Color.RED);
        g.fillOval(345, 630, 60, 30);

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
        //make the nose and make the nose dot move 
        if (nosemove == 300) {
            nosemove += 10;
            nosedotmove += 10;
        } else if (nosemove == 310) {
            nosemove -= 20;
            nosedotmove -= 20;
        } else if (nosemove == 290) {
            nosemove += 10;
            nosedotmove += 10;
        }

        //make the eyes move 
        if (eyemove1x == 280) {
            eyemove1x += 10;
            eyedotmove1x += 10;
            eyemove2x += 10;
            eyedotmove2x += 10;
            eyemove1y -= 10;
            eyemove2y -= 10;
        } else if (eyemove1x == 290) {
            eyemove1x -= 10;
            eyedotmove1x -= 10;
            eyemove2x -= 10;
            eyedotmove2x -= 10;
            eyemove1y += 10;
            eyemove2y += 10;
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
        MickeyMouse game = new MickeyMouse();
    }
}
