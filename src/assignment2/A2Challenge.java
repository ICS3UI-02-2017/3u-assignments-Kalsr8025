/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;

/**
 *
 * @author kalsr8025
 */
public class A2Challenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a city 
        City kalsi = new City();

        //set walls for road 
        new Wall(kalsi, 0, 0, Direction.WEST);
        new Wall(kalsi, 0, 1, Direction.EAST);
        new Wall(kalsi, 1, 0, Direction.WEST);
        new Wall(kalsi, 1, 1, Direction.EAST);
        new Wall(kalsi, 2, 0, Direction.WEST);
        new Wall(kalsi, 2, 1, Direction.EAST);
        new Wall(kalsi, 3, 0, Direction.WEST);
        new Wall(kalsi, 3, 1, Direction.EAST);
        new Wall(kalsi, 4, 0, Direction.WEST);
        new Wall(kalsi, 4, 1, Direction.EAST);
        new Wall(kalsi, 5, 0, Direction.WEST);
        new Wall(kalsi, 5, 1, Direction.EAST);
        new Wall(kalsi, 6, 0, Direction.WEST);
        new Wall(kalsi, 6, 1, Direction.EAST);
        new Wall(kalsi, 7, 0, Direction.WEST);
        new Wall(kalsi, 7, 1, Direction.EAST);
        new Wall(kalsi, 8, 0, Direction.WEST);
        new Wall(kalsi, 8, 1, Direction.EAST);
        new Wall(kalsi, 9, 0, Direction.WEST);
        new Wall(kalsi, 9, 1, Direction.EAST);


        //Sidewalk walls 
        new Wall(kalsi, 0, 2, Direction.EAST);
        new Wall(kalsi, 3, 2, Direction.EAST);
        new Wall(kalsi, 5, 2, Direction.EAST);
        new Wall(kalsi, 6, 2, Direction.EAST);
        new Wall(kalsi, 9, 2, Direction.EAST);
        new Wall(kalsi, 9, 2, Direction.SOUTH);

        //Driveway walls 
        new Wall(kalsi, 1, 6, Direction.EAST);
        new Wall(kalsi, 2, 6, Direction.EAST);
        new Wall(kalsi, 1, 3, Direction.NORTH);
        new Wall(kalsi, 2, 3, Direction.SOUTH);
        new Wall(kalsi, 1, 4, Direction.NORTH);
        new Wall(kalsi, 2, 4, Direction.SOUTH);
        new Wall(kalsi, 1, 5, Direction.NORTH);
        new Wall(kalsi, 2, 5, Direction.SOUTH);
        new Wall(kalsi, 1, 6, Direction.NORTH);
        new Wall(kalsi, 2, 6, Direction.SOUTH);

        new Wall(kalsi, 4, 5, Direction.EAST);
        new Wall(kalsi, 4, 3, Direction.NORTH);
        new Wall(kalsi, 4, 3, Direction.SOUTH);
        new Wall(kalsi, 4, 4, Direction.NORTH);
        new Wall(kalsi, 4, 4, Direction.SOUTH);
        new Wall(kalsi, 4, 5, Direction.NORTH);
        new Wall(kalsi, 4, 5, Direction.SOUTH);

        new Wall(kalsi, 7, 6, Direction.EAST);
        new Wall(kalsi, 8, 6, Direction.EAST);
        new Wall(kalsi, 7, 3, Direction.NORTH);
        new Wall(kalsi, 8, 3, Direction.SOUTH);
        new Wall(kalsi, 7, 4, Direction.NORTH);
        new Wall(kalsi, 8, 4, Direction.SOUTH);
        new Wall(kalsi, 7, 5, Direction.NORTH);
        new Wall(kalsi, 8, 5, Direction.SOUTH);
        new Wall(kalsi, 7, 6, Direction.NORTH);
        new Wall(kalsi, 8, 6, Direction.SOUTH);

        //place things/ snow in the city 
        new Thing(kalsi, 0, 0);
        new Thing(kalsi, 1, 1);
        new Thing(kalsi, 2, 0);
        new Thing(kalsi, 0, 1);
        new Thing(kalsi, 5, 0);
        new Thing(kalsi, 3, 0);
        new Thing(kalsi, 6, 1);
        new Thing(kalsi, 6, 1);
        new Thing(kalsi, 9, 0);
        new Thing(kalsi, 8, 1);

        new Thing(kalsi, 2, 2);
        new Thing(kalsi, 3, 2);
        new Thing(kalsi, 5, 2);
        new Thing(kalsi, 7, 2);
        new Thing(kalsi, 1, 2);

        new Thing(kalsi, 1, 4);
        new Thing(kalsi, 1, 5);
        new Thing(kalsi, 1, 6);
        new Thing(kalsi, 2, 3);
        new Thing(kalsi, 2, 5);

        new Thing(kalsi, 4, 3);
        new Thing(kalsi, 4, 4);
        new Thing(kalsi, 4, 5);

        new Thing(kalsi, 7, 3);
        new Thing(kalsi, 7, 5);
        new Thing(kalsi, 7, 6);
        new Thing(kalsi, 8, 4);
        new Thing(kalsi, 8, 6);
        new Thing(kalsi, 8, 3);

        new Thing(kalsi, 0, 4);
        new Thing(kalsi, 0, 6);
        new Thing(kalsi, 5, 6);
        new Thing(kalsi, 5, 3);
        new Thing(kalsi, 9, 4);
        new Thing(kalsi, 6, 4);
        new Thing(kalsi, 9, 5);

        //create robot in kalsi 
        RobotSE robo = new RobotSE(kalsi, 0, 2, Direction.SOUTH);
        RobotSE dot = new RobotSE(kalsi, 0, 2, Direction.SOUTH);

        //change the colour of robots
        robo.setColor(Color.BLUE);
        dot.setColor(Color.MAGENTA);
        
        //dot move and pick thing up 
        while (dot.frontIsClear()){
               dot.move(1);
               if (dot.canPickThing())
                   dot.pickThing();
                   dot.turnLeft();
               
        }
    }
}
