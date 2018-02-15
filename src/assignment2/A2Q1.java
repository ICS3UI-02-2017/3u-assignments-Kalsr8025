/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;

/**
 *
 * @author kalsr8025
 */
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a City 
        City kalsi= new City();
        
        //Create a Robot
        RobotSE robo= new RobotSE (kalsi,1,1,Direction.EAST);
        
        //Place Things in the city kalsi
        new Thing (kalsi,1,2);
        new Thing (kalsi,1,3);
        new Thing (kalsi,1,4);
        new Thing (kalsi,1,5);
        new Thing (kalsi,1,6);
        new Thing (kalsi,1,7);
        new Thing (kalsi,1,8);
        new Thing (kalsi,1,9);
        new Thing (kalsi,1,10);
        new Thing (kalsi,1,11);
       
        //move if the front is clear 
        while (robo.countThingsInBackpack()<=6){
            //move forward
            robo.move();
            //pick thing up
            robo.pickThing();
            
        }
        //robo stops at 12//
        while (robo.getAvenue()==12){
        }
           
    }
    }

