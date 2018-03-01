/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;

/**
 *
 * @author kalsr8025
 */
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create the city 
        City kalsi = new City();

        //create the robot
        RobotSE robo = new RobotSE(kalsi, 3, 3, Direction.SOUTH);

        //create walls 
        new Wall(kalsi, 1, 1, Direction.WEST);
        new Wall(kalsi, 2, 1, Direction.WEST);
        new Wall(kalsi, 4, 1, Direction.WEST);
        new Wall(kalsi, 5, 1, Direction.WEST);
        new Wall(kalsi, 1, 4, Direction.WEST);
        new Wall(kalsi, 2, 4, Direction.WEST);
        new Wall(kalsi, 4, 4, Direction.WEST);
        new Wall(kalsi, 5, 4, Direction.WEST);

        new Wall(kalsi, 1, 1, Direction.NORTH);
        new Wall(kalsi, 1, 2, Direction.NORTH);
        new Wall(kalsi, 1, 4, Direction.NORTH);
        new Wall(kalsi, 1, 5, Direction.NORTH);
        new Wall(kalsi, 4, 1, Direction.NORTH);
        new Wall(kalsi, 4, 2, Direction.NORTH);
        new Wall(kalsi, 4, 4, Direction.NORTH);
        new Wall(kalsi, 4, 5, Direction.NORTH);

        new Wall(kalsi, 1, 2, Direction.EAST);
        new Wall(kalsi, 2, 2, Direction.EAST);
        new Wall(kalsi, 4, 2, Direction.EAST);
        new Wall(kalsi, 5, 2, Direction.EAST);
        new Wall(kalsi, 1, 5, Direction.EAST);
        new Wall(kalsi, 2, 5, Direction.EAST);
        new Wall(kalsi, 4, 5, Direction.EAST);
        new Wall(kalsi, 5, 5, Direction.EAST);

        new Wall(kalsi, 2, 1, Direction.SOUTH);
        new Wall(kalsi, 2, 2, Direction.SOUTH);
        new Wall(kalsi, 2, 4, Direction.SOUTH);
        new Wall(kalsi, 2, 5, Direction.SOUTH);
        new Wall(kalsi, 5, 1, Direction.SOUTH);
        new Wall(kalsi, 5, 2, Direction.SOUTH);
        new Wall(kalsi, 5, 4, Direction.SOUTH);
        new Wall(kalsi, 5, 5, Direction.SOUTH);
        
        //the robo moves  
        robo.move(3);
        robo.turnLeft();
        robo.move(3);
        robo.turnLeft();
        robo.move(3);
        robo.turnLeft();

        for (int robotomove = 0; robotomove < 3; robotomove++) {
            robo.move(6);
            robo.turnLeft();
            robo.move(3);
            robo.turnLeft();
            robo.move(3);
            robo.turnLeft();
        }
        //move to the start point 
        robo.move(3);

    }
}