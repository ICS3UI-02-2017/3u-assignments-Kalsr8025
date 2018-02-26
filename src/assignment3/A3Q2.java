/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;

/**
 *
 * @author kalsr8025
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create the city 
        City kalsi = new City();

        //ask city to count things
        kalsi.showThingCounts(true);
        {
        }
        //create the robot
        RobotSE robo = new RobotSE(kalsi, 1, 1, Direction.EAST);

        //place things in the city 
        new Thing(kalsi, 1, 1);
        new Thing(kalsi, 1, 1);
        new Thing(kalsi, 1, 1);
        new Thing(kalsi, 1, 1);
        new Thing(kalsi, 1, 1);
        new Thing(kalsi, 1, 1);
        new Thing(kalsi, 1, 1);
        new Thing(kalsi, 1, 1);
        new Thing(kalsi, 1, 1);
        new Thing(kalsi, 1, 1);

        for (int numberofthing = 0; numberofthing < 10; numberofthing++) {
            //pick thing 
            robo.pickThing();
            //move
            robo.move();
            //put thing 
            robo.putThing();
            //robo turn around and moves 
            robo.turnAround();
            robo.move();
            robo.turnAround();
        }
        //move to the end 
        robo.move();
        
    }
}

