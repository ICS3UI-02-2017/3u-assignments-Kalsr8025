/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;

/**
 * Learning For Loops
 *
 * @author Kalsr8025
 */
public class ForStatement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a city and robot
        City kw = new City();
        RobotSE karel = new RobotSE(kw, 1, 1, Direction.EAST);

        //counted while loop 
        int numberOfMoves = 5;
        //if there are still moves to do 
        while (numberOfMoves > 0) {
            karel.move();
            numberOfMoves = numberOfMoves - 1;
        }

        karel.turnAround();

        //counting the other way 
        numberOfMoves = 0;
        while (numberOfMoves < 5) {
            karel.move();
            numberOfMoves = numberOfMoves + 1;
        }
      
        karel.turnAround();
         //For Loop
        for(int count = 0; count < 5; count ++){
            karel.move();
            
        }
        
        //type for and press tab 
        for (int i = 0; i < 10; i++) {
        }
        
        int x =10;
        //adds 5 
        x = x +5;
        //adds 5
        x += 5;
        //subtracts 10 
        x -=10;
        
        //multiply and divide 
        x *= 4;
        x /= 4; //dividing you must add .00 for a deciml answer 
    }
}
