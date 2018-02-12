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

/**
 *
 * @author Kalsr8025
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a city for robot//
        City kalsi = new City (); 
        
        //Place tthe robot in the city//
        RobotSE robo = new RobotSE (kalsi, 3,0, Direction.EAST);
        
        //add walls to kalsi//
        new Wall (kalsi,3,2,Direction.WEST);
        new Wall (kalsi,3,2,Direction.NORTH);
        new Wall (kalsi,2,3,Direction.WEST);
        new Wall (kalsi,1,3,Direction.WEST);
        new Wall (kalsi,1,3,Direction.NORTH);
        new Wall (kalsi,1,3,Direction.EAST);
        new Wall (kalsi,2,4,Direction.NORTH);
        new Wall (kalsi,2,4,Direction.EAST);
        new Wall (kalsi,3,4,Direction.EAST);
        
        //place a flag at the bottom of the moutain//
        new Thing (kalsi,3,1);
        
        //move forward robo//
        robo.move();
        
        //robo pick the flag//
        robo.pickThing();
        
        //robo turn left//
        robo.turnLeft();
        
        //move forward//
        robo.move();
        
        //robo turn right//
        robo.turnRight();
        
        //robo move forward//
        robo.move();
        
        //robo turn left//
        robo.turnLeft();
        
        //move forward//
        robo.move(2);
        
        //turn right//
        robo.turnRight();
        
        //move forward//
        robo.move();
        
        //put down the flag//
        robo.putThing();
        
        //move foward//
        robo.move();
        
        //turn right//
        robo.turnRight();
        
        //move forward//
        robo.move();
        
        //turn left//
        robo.turnLeft();
        
        //move forward//
        robo.move();
        
        //turn right//
        robo.turnRight();
        
        //move staright//
        robo.move(2);
        
        //turn left//
        robo.turnLeft(5);
    }
}
