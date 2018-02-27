/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;

/**
 *
 * @author kalsr8025
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create the city 
        City kalsi = new City();

        //create the robot
        RobotSE robo = new RobotSE(kalsi, 1, 1, Direction.EAST, 20);

        kalsi.showThingCounts(true);
        //creating the loop
        for (int seedstoplant = 0; seedstoplant < 4; seedstoplant++) {
            for (int plantseeds = 0; plantseeds < 5; plantseeds++) {
                robo.putThing();
                robo.move();

                while (robo.getAvenue() == 6) {
                    robo.turnAround();
                    robo.move(6);
                }
                while (robo.getAvenue() == 0) {
                    robo.turnLeft();
                    robo.move();
                }
            }
        }
    }
}
