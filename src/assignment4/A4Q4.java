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
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //use a scanner to read info
        Scanner input = new Scanner(System.in);

        // greet the user with warm welcome 
        System.out.println("Welcome to the Business Calculator for PROM");
        System.out.println("");
        System.out.println("You need to answer few question in order to get the total cost...");
        System.out.println("");
        
        //get the details 
        System.out.println("What is cost of tasty food at prom?");
        int food = input.nextInt();
                
        System.out.println("How much does the DJ cost?");
        int dj = input.nextInt();
        
        System.out.println("Complete the sentence.." + "\tThe rent of hall is ");
        int hall = input.nextInt();
        
        System.out.println("How much does it cost to get some husky decorations at prom?");
        int decor = input.nextInt();

        System.out.println("We need some teacher as security..How much we need to pay them? ");
        int security = input.nextInt();
        
        System.out.println("Extra money to cover miscellaneous costs???");
        int cost = input.nextInt();
        
        int total = food + dj + hall + decor + security + cost;
        
        //tell the total price 
        System.out.println("");
        System.out.println("The total cost for best prom is " + total);
        
        //break even
        int even = total / 35;
        Math.ceil(even);
        
        System.out.println("You must sell " + even + " tickets to cover the cost.");
    }
}
