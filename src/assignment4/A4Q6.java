/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

import java.util.Scanner;

/**
 *
 * @author Kalsr8025
 */
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //place a scanner 
        Scanner input = new Scanner(System.in);
        
        //Ask the driver their speed
        System.out.println("Enter the speed limit");
        double dspeed = input.nextDouble();
       
        System.out.println("Recorded speed?");
        double rspeed = input.nextDouble();
        
        //Math  
        double limit = dspeed - rspeed;
        System.out.println(limit);
                
    }
}
