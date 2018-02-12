/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;

/**
 *
 * @author Kalsr8025
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a city for the robot//
        City kalsi = new City ();
        
        //put the robot in kalsi//
        RobotSE robo = new RobotSE(kalsi,0,1,Direction.WEST);
        
        //add walls in kalsi//
        new Wall (kalsi,1,1,Direction.WEST);
        new Wall (kalsi,2,1,Direction.WEST);
        new Wall (kalsi,2,1,Direction.SOUTH);
        new Wall (kalsi,2,2,Direction.SOUTH);
        new Wall (kalsi,2,2,Direction.EAST);
        new Wall (kalsi,1,2,Direction.EAST);
        new Wall (kalsi,1,2,Direction.NORTH);
        new Wall (kalsi,1,1,Direction.NORTH);
        
        //move robo forward//
        robo.move();
        
        //turn south robo//
        robo.turnLeft();
        
        //move forward 3 times forward robo//
        robo.move(3);
        
        //turn west robo//
        robo.turnLeft();
        
       //move forward 3 times//
       robo.move(3);
       
       //turn left robo//
       robo.turnLeft();
       
       //move forward 3 times//
       robo.move(3);
       
       //turn left//
       robo.turnLeft();
       
       //move foreward 2//
       robo.move(2);
    }
}
