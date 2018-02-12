/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;

/**
 *
 * @author Kalsr8025
 */
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a city for robot//
        City kalsi = new City ();
        
        //place the robot in the city//
        RobotSE robo = new RobotSE (kalsi,1,2,Direction.SOUTH);
        
        //Change the colour of robo//
        robo.setColor(Color.MAGENTA);
        
        //Make walls in kalsi//
        new Wall (kalsi,1,1,Direction.NORTH);
        new Wall (kalsi,1,2,Direction.NORTH);
        new Wall (kalsi,1,2,Direction.EAST);
        new Wall (kalsi,1,2,Direction.SOUTH);
        new Wall (kalsi,1,1,Direction.WEST);
        new Wall (kalsi,2,1,Direction.WEST);
        new Wall (kalsi,2,1,Direction.SOUTH);
        
        //place the newspaper on door//
        new Thing (kalsi,2,2);
        
        //turn right //
        robo.turnRight();
        
        //move forward//
        robo.move();
        
        //turn left//
        robo.turnLeft();
        
        //move forward//
        robo.move();
        
        //turn left//
        robo.turnLeft();
        
        //move forward//
        robo.move();
        
        //pick the thing up//
        robo.pickThing();
        
        //turn around//
        robo.turnAround();
        
        //move forward//
        robo.move();
        
        //turn right//
        robo.turnRight();
        
        //move forward//
        robo.move();
        
        //turn right//
        robo.turnRight();
        
        //move foward//
        robo.move();
        
        //robo stands in its orginal position//
        robo.turnRight();
                
    }
}
