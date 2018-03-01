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
public class A4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //add a scanner to scan the name 
        Scanner input = new Scanner (System.in);
        
        //Ask for name 
        System.out.println("Type your name to see magic");
        
        //make strign to store user's name
        String name = input.nextLine();
        
        //greet the user 
        System.out.println("Hey " + name + "\n\tWhat's up?");
        
    }
}
