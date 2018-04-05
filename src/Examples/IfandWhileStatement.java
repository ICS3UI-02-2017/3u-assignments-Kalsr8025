/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author lamon
 */
public class IfandWhileStatement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a city
        City kw = new City();
        
        // create a robot
        RobotSE karel = new RobotSE(kw, 2, 1, Direction.EAST);
        
        // creat a wall infront
        new Wall(kw, 2, 5, Direction.EAST);
        
        // place a few things
        new Thing(kw, 2, 2);
        new Thing(kw, 2, 4);
        
        // move while the front is clear
        while(karel.frontIsClear()){
            // if front is clear, do this
            karel.move();
            
            // is there something to pick up?
            if(karel.canPickThing()){
                karel.pickThing();
            }
        }
        // when front is not clear
        karel.turnRight();
        
        // do you have 1 thing in your backpack
        if(karel.countThingsInBackpack() == 1){
            karel.move();
        }else if(karel.countThingsInBackpack() == 2){
            karel.move(2);
        }else{
            karel.turnAround();
        }
        
        
    }
    
}