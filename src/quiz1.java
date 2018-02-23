/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author kalsr8025
 */
public class quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create the city 
        City kalsi = new City();

        //create the robot 
        RobotSE robo = new RobotSE(kalsi, 4, 0, Direction.EAST);

        //create the mountain walls 
        new Wall(kalsi, 4, 2, Direction.WEST);
        new Wall(kalsi, 4, 2, Direction.NORTH);
        new Wall(kalsi, 3, 3, Direction.WEST);
        new Wall(kalsi, 3, 3, Direction.NORTH);

        new Wall(kalsi, 2, 4, Direction.WEST);
        new Wall(kalsi, 2, 4, Direction.NORTH);
        new Wall(kalsi, 2, 5, Direction.EAST);
        new Wall(kalsi, 2, 5, Direction.NORTH);

        new Wall(kalsi, 3, 6, Direction.EAST);
        new Wall(kalsi, 3, 6, Direction.NORTH);
        new Wall(kalsi, 4, 7, Direction.EAST);
        new Wall(kalsi, 4, 7, Direction.NORTH);

        //place things 
        new Thing(kalsi, 4, 1);
        new Thing(kalsi, 3, 2);
        new Thing(kalsi, 2, 3);
        new Thing(kalsi, 1, 4);

        //robo to move up and pick things 
            robo.move();
            robo.pickThing();
            robo.turnLeft();
            robo.move();
            robo.turnRight();
            robo.move();
            robo.pickThing();
            robo.turnLeft();
            robo.move();
            robo.turnRight();
            robo.move();
            robo.pickThing();
            robo.turnLeft();
            robo.move();
            robo.turnRight();
            robo.move();
            robo.pickThing();
            
            //robot to move down and drop things 
            robo.move();
            robo.putThing();
            robo.move();
            robo.turnRight();
            robo.move();
            robo.turnLeft();
            robo.putThing();
            robo.move();
            robo.turnRight();
            robo.move();
            robo.turnLeft();
            robo.putThing();
            robo.move();
            robo.turnRight();
            robo.move();
            robo.turnLeft();
            robo.putThing();
            robo.move();
    }
}
