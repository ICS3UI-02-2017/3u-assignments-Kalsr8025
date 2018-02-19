/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;

/**
 *
 * @author kalsr8025
 */
public class A2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create the city 
        City kalsi = new City ();
        
        //create the robot
        RobotSE robo= new RobotSE (kalsi,0,0,Direction.EAST);
       
        //Create walls in kalsi
        new Wall (kalsi,1,1, Direction.EAST);
        new Wall (kalsi,1,1, Direction.NORTH);
        new Wall (kalsi,1,1, Direction.SOUTH);
        new Wall (kalsi,1,1, Direction.WEST);
        new Wall (kalsi,1,4, Direction.EAST);
        new Wall (kalsi,1,4, Direction.NORTH);
        new Wall (kalsi,1,4, Direction.SOUTH);
        new Wall (kalsi,1,4, Direction.WEST);
        new Wall (kalsi,4,1, Direction.EAST);
        new Wall (kalsi,4,1, Direction.NORTH);
        new Wall (kalsi,4,1, Direction.SOUTH);
        new Wall (kalsi,4,1, Direction.WEST);
        new Wall (kalsi,4,4, Direction.EAST);
        new Wall (kalsi,4,4, Direction.NORTH);
        new Wall (kalsi,4,4, Direction.SOUTH);
        new Wall (kalsi,4,4, Direction.WEST);
        
        new Wall (kalsi,2,3, Direction.EAST);
        new Wall (kalsi,3,3, Direction.EAST);
        new Wall (kalsi,2,3, Direction.NORTH);
        new Wall (kalsi,2,2, Direction.NORTH);
        new Wall (kalsi,3,2, Direction.SOUTH);
        new Wall (kalsi,3,3, Direction.SOUTH);
        new Wall (kalsi,2,2, Direction.WEST);
        new Wall (kalsi,3,2, Direction.WEST);
        
        //loop around the castle
        while (robo.frontIsClear()){
            robo.move(2);
            robo.turnRight();
            robo.move();
            robo.turnLeft();
            robo.move();
            robo.turnLeft();
            robo.move();
            robo.turnRight();
            robo.move(2);
            robo.turnRight();
        }
    }
}
