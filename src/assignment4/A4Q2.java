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
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Add the scanne rto program 
        Scanner input = new Scanner(System.in);

        //Ask the for the measurment 
        System.out.println("Hello Welcome to your personal Inches to Centimeter Converter");
        System.out.println("");
        System.out.println("Enter the number you want to convert in inches");

        //math to slove 
        double inches = input.nextDouble();
        Math.round(inches);
        double cm = 2.54 * inches;

        //tell the centimeter
        System.out.println(cm + " centimeter" + " is the same as  "  + inches);
    }
}
