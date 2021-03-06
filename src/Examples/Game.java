package Examples;

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
public class Game extends JComponent implements ActionListener {

    // Height and Width of our game
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    //Title of the window
    String title = "My Game";
    // sets the framerate and delay for our game
    // this calculates the number of milliseconds per frame
    // you just need to select an approproate framerate
    int desiredFPS = 60;
    int desiredTime = Math.round((1000 / desiredFPS));
    // timer used to run the game loop
    // this is what keeps our time running smoothly :)
    Timer gameTimer;
    // YOUR GAME VARIABLES WOULD GO HERE
    // (x,y,width,height)
    Rectangle paddle1 = new Rectangle(50, 250, 25, 100);
    Rectangle paddle2 = new Rectangle(725, 250, 25, 100);
    //ball
    Rectangle ball = new Rectangle(395, 295, 10, 10);
    //ball bouncing
    int ballAngle = 45;
    int ballSpeed = 5;
    //moving paddles 
    boolean paddle1Up = false;
    boolean paddle1Down = false;
    boolean paddle2Up = false;
    boolean paddle2Down = false;
    int paddleSpeed = 5;
    //player scores 
    int score1 = 0;
    int score2 = 0;
    //create custom font 
    Font biggerfont = new Font("arial", Font.BOLD, 36);

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
        //draw the background 
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, WIDTH, HEIGHT);

        //draw the players// paddles 
        g.setColor(Color.WHITE);
        g.fillRect(paddle1.x, paddle1.y, paddle1.width, paddle1.height);
        g.fillRect(paddle2.x, paddle2.y, paddle2.width, paddle2.height);
        g.fillRect(ball.x, ball.y, ball.width, ball.height);

        //draw scores 
        g.setFont(biggerfont);
        //int cant be written so must write it like this
        g.drawString("" + score1, WIDTH / 2 - 50, 50);
        g.drawString("" + score2, WIDTH / 2 + 50, 50);

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
        moveBall();
        movePaddles();
        checkForCollision();
        checkForGoal();
    }

    private void moveBall() {
        //convert to use in trig
        double newAngle = Math.toRadians(ballAngle);
        //determine on how much to move ball x and ball y using trig
        double moveX = ballSpeed * Math.cos(newAngle);
        double moveY = ballSpeed * Math.sin(newAngle);

        //move the ball
        ball.x = ball.x + (int) moveX;
        ball.y = ball.y + (int) moveY;

    }

    private void movePaddles() {
        //player 1 controls 
        if (paddle1Up) {
            paddle1.y -= paddleSpeed;
        } else if (paddle1Down) {
            paddle1.y += paddleSpeed;
        }
        //player 2 controls
        if (paddle2Up) {
            paddle2.y -= paddleSpeed;
        } else if (paddle2Down) {
            paddle2.y += paddleSpeed;
        }

    }

    private void checkForCollision() {
        //collision with bottom /top
        if (ball.y < 0) {
            ballAngle *= -1;
        }
        if (ball.y + ball.height > HEIGHT) {
            ballAngle *= -1;
        }

        //collision with paddles 
        //not go over 360 by adding %360
        if (ball.intersects(paddle1)) {
            ballAngle = (180 + ballAngle * -1) % 180;
        }
        if (ball.intersects(paddle2)) {
            ballAngle = (180 + ballAngle * -1) % 180;
        }
    }

    private void checkForGoal() {
        //ball off left hand side
        if (ball.x < 0) {
            //add player 2 scores 
            score2++;
            ball.x = WIDTH / 2 - ball.width / 2;
            ball.y = HEIGHT / 2 - ball.height / 2;
        }
        //ball off right hand side 
        if (ball.x + ball.width > WIDTH) {
            //add player 2 scores 
            score1++;
            ball.x = WIDTH / 2 - ball.width / 2;
            ball.y = HEIGHT / 2 - ball.height / 2;
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

            if (keyCode == KeyEvent.VK_W) {
                paddle1Up = true;
            } else if (keyCode == KeyEvent.VK_S) {
                paddle1Down = true;
            }
            // paddle 2 controls
            if (keyCode == KeyEvent.VK_UP) {
                paddle2Up = true;
            } else if (keyCode == KeyEvent.VK_DOWN) {
                paddle2Down = true;
            }

        }

        // if a key has been released
        @Override
        public void keyReleased(KeyEvent e) {
            int keyCode = e.getKeyCode();
            // paddle 1 controls
            if (keyCode == KeyEvent.VK_W) {
                paddle1Up = false;
            } else if (keyCode == KeyEvent.VK_S) {
                paddle1Down = false;
            }
            // paddle 2 controls
            if (keyCode == KeyEvent.VK_UP) {
                paddle2Up = false;
            } else if (keyCode == KeyEvent.VK_DOWN) {
                paddle2Down = false;
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
        Game game = new Game();
    }
}
