/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author Kalsr8025
 */
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a city for robot//
      City kalsi = new City ();
      
      //place robot k and robot m in kalsi//
      RobotSE robotm = new RobotSE (kalsi,0,1,Direction.WEST);
      RobotSE robotk = new RobotSE (kalsi,3,3,Direction.EAST);
      
      //Placing walls in kalsi//
      new Wall (kalsi,2,3,Direction.WEST);
      new Wall (kalsi,2,3,Direction.NORTH); 
      new Wall (kalsi,2,3,Direction.EAST);
      new Wall (kalsi,3,3,Direction.EAST);
      new Wall (kalsi,3,3,Direction.SOUTH);
      
      //Labeling robot k and robot m =//
      robotk.setLabel("K");
      robotm.setLabel("M");
      
      //Placing newspaper in kalsi//
      new Thing (kalsi,0,0);
      new Thing (kalsi,1,0);
      new Thing (kalsi,1,1);
      new Thing (kalsi,1,2);
      new Thing (kalsi,2,2);
      
      //Robot k moves to pick things//
      robotk.turnAround();
      robotk.move();
      robotk.turnRight();
      robotk.move();
      robotk.pickThing();
      robotk.move();
      robotk.pickThing();
      robotk.turnLeft();
      
      //Robot m moves to pick things//
      robotm.move();
      robotm.pickThing();
      robotm.turnLeft();
      robotm.move();
      robotm.pickThing();
      robotm.turnLeft();
      robotm.move();
      robotm.pickThing();
    }
}
