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
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create the city 
        City kalsi = new City ();
        
        //create the robot
        RobotSE robo = new RobotSE (kalsi,0,2,Direction.WEST);
        
        //place walls 
        new Wall (kalsi,1,1,Direction.NORTH);
        new Wall (kalsi,1,1,Direction.WEST);
        new Wall (kalsi,2,1,Direction.WEST);
        new Wall (kalsi,2,1,Direction.SOUTH);
        
        new Wall (kalsi,1,2,Direction.EAST);
        new Wall (kalsi,1,2,Direction.NORTH);
        new Wall (kalsi,2,2,Direction.EAST);
        new Wall (kalsi,2,2,Direction.SOUTH);
        
        //create the loop for robo to move around the square twice 
    }
}
