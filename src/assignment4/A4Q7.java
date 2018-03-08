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
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //use a scanner to read info
        Scanner input = new Scanner(System.in);
        
        //player int
        int player = 1;
        
        //greet 
        System.out.println("Welcome the digital snake and ladder game!!");
        System.out.println("If you have a dice ready then lets play...");
        System.out.println("");
        
        //ask questions
        System.out.println("Enter the number you got on dice....");
        int dice = input.nextInt();
        
        //start the game 
        if (dice <= 6){
            player += dice;
        }
        


        
        
    }
}
