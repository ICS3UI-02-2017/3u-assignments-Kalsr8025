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
        // create a city 
        City kalsi = new City();

        //Create the robot
        RobotSE robo = new RobotSE(kalsi, 5, 4, Direction.EAST);

        //make sure robo faces north 
        if (robo.getDirection() == Direction.NORTH) {
            //move and get to avnue 0 
            while (robo.getAvenue() >= 0) {
                robo.move(1);
                while (robo.getAvenue() == 0) {
                }
            }
        }
          //make sure robo faces north
        if (robo.getDirection() == Direction.EAST) {
            robo.turnLeft();
            //move and get to avnue 0 
            while (robo.getAvenue() >= 0) {
                robo.move(1);
                while (robo.getAvenue() == 0) {
                }
            }
        }
          //make sure robo faces north
        if (robo.getDirection() == Direction.SOUTH) {
            robo.turnAround();
            //move and get to avnue 0 
            while (robo.getAvenue() >= 0) {
                robo.move(1);
                while (robo.getAvenue() == 0) {
                }
            }
        }
          //make sure robo faces north
        if (robo.getDirection() == Direction.WEST) {
            robo.turnRight();
            //move and get to avnue 0 
            while (robo.getAvenue() >= 0) {
                robo.move(1);
                while (robo.getAvenue() == 0) {
                }
            }
        }
    }
}
