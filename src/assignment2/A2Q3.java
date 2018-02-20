/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;

/**
 *
 * @author kalsr8025
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create the city for robot 
        City kalsi = new City();

        //create a robot 
        RobotSE robo = new RobotSE(kalsi, 2, 7, Direction.SOUTH);

        //robo face notrh 
        if (robo.isFacingEast()) {
            robo.turnLeft();
        }
        if (robo.isFacingNorth()) {
            //
        }
        if (robo.isFacingSouth()) {
            robo.turnAround();
        }
        if (robo.isFacingWest()) {
            robo.turnRight();
        }

        //if the street is greater than 0
        while (robo.getStreet() >= 0) {
            
            //robo moves forward 
            robo.move();
            
            //robo turn left at street = 0
            if (robo.getStreet() == 0) {
                robo.turnLeft();
                
                //move to get to the avenue 0
                while (robo.getAvenue() >= 0) {
                    robo.move();
                    while (robo.getAvenue() == 0) {
                    }
                }
            }
        }
    }
}
