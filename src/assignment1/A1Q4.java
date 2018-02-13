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
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create the city//
        City kalsi = new City ();
        
        //place the robot in kalsi//
        RobotSE robo1 = new RobotSE (kalsi,0,0,Direction.SOUTH);
        
        //place the robot 2 in kalsi//
        RobotSE robo2 = new RobotSE (kalsi,0,1,Direction.SOUTH);
        
        //place the wall//
        new Wall (kalsi,0,1,Direction.WEST);
        new Wall (kalsi,1,1,Direction.WEST);
        new Wall (kalsi,1,1,Direction.SOUTH);
        
        //Robo2 moves forward//
        robo2.move();
        
        //Robo2 turns left//
        robo2.turnLeft();
        
        //Robo2 moves forward//
        robo2.move();
        
        //Robo2 turns right//
        robo2.turnRight();
        
        //Robo1 moves forward 2)
        robo1.move(2);
        
        //Robo2 moves forward//
        robo2.move();
        
        //Robo1 turns left//
        robo1.turnLeft();
        
        //Robo2 turns right//
        robo2.turnRight();
        
        //Robo1 and Robo2 moves forwards//
        robo1.move(); robo2.move();
    }
}
