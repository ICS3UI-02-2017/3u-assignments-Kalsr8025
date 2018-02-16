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

/**
 *
 * @author kalsr8025
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create the city 
        City kalsi= new City ();
        
        //create a robot
        RobotSE robo = new RobotSE (kalsi,3,0,Direction.EAST);
        
        //place the ground walls
        new Wall (kalsi,3,1,Direction.SOUTH);
        new Wall (kalsi,3,2,Direction.SOUTH);
        new Wall (kalsi,3,3,Direction.SOUTH);
        new Wall (kalsi,3,4,Direction.SOUTH);
        new Wall (kalsi,3,5,Direction.SOUTH);
        new Wall (kalsi,3,6,Direction.SOUTH);
        new Wall (kalsi,3,7,Direction.SOUTH);
        new Wall (kalsi,3,8,Direction.SOUTH);
        
        //place hurdes
        new Wall (kalsi,3,1,Direction.EAST);
        new Wall (kalsi,3,3,Direction.EAST);
        new Wall (kalsi,3,5,Direction.EAST);
        new Wall (kalsi,3,7,Direction.EAST);
        
        //The thing at the finishing line
        new Thing (kalsi,3,8);
       
        //move while front is clear
        while (robo.frontIsClear()){
                robo.move(1);
            
        //move while front is not clear
        while (!robo.frontIsClear())
                robo.turnLeft();
                robo.move();
                robo.turnRight();
                robo.move();
                robo.turnRight();
                robo.move();
                robo.turnLeft();
                
        //pick a thing         
        if (robo.canPickThing())
            robo.pickThing();
    
        } 
        
  }
}
