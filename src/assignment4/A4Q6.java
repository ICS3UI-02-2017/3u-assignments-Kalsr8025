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
        double limit = rspeed - dspeed;

        //warning
        if (limit <= 0) {
            System.out.println("You are driving at great speed");
        }
        if (limit > 0 && limit < 21) {
            System.out.println("You are driving more than limit");
            System.out.println("SLOW DOWN or you will be charged with $100 fine");
        }
        if (limit > 20 && limit < 31) {
            System.out.println("You are driving faster than limit");
            System.out.println("SLOW DOWN or you will be charged with $270 fine");
        }
        if (limit > 30) {
            System.out.println("You are driving too fast");
            System.out.println("SLOW DOWN or you will be charged with $500 fine");
        }

    }
}
