/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;

/**
 * Learning how to use the Robots  
 * @author kalsr8025
 */
public class Robot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a City for the Robot 
        City kw = new City();
        
        //put a robot in kw//
        RobotSE robo = new RobotSE(kw,2,3,Direction.EAST);
        
            //create a wall//
        new Wall (kw, 8,10, Direction.WEST);
        
        //move the robot forward one space//
        robo.move(3);
        
        //move the robot n number of space// 
        robo.move(4);
        
        //turn the robot to left//
        robo.turnRight();
        
        //move forward n number of space//
        robo.move(5);
        
       
    }
}
