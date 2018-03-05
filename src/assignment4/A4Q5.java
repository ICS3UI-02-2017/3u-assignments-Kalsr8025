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
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //place a scanner 
        Scanner input = new Scanner(System.in);
        
        //ask for the name of the user 
        System.out.println("Enter your name");
        String name = input.nextLine();
        System.out.println("");
        
        // ask the marks of each test
        System.out.println("What was the first test out of?");
        double test1 = input.nextInt();
        System.out.println("What did you got on the first test?");
        double test1mark = input.nextInt();
        
        System.out.println("");
        
        System.out.println("What was the second test out of?");
        int test2 = input.nextInt();
        System.out.println("What did you got on the second test?");
        int test2mark = input.nextInt();
        
        System.out.println("");
        
        System.out.println("What was the third test out of?");
        int test3 = input.nextInt();
        System.out.println("What did you got on the third test?");
        int test3mark = input.nextInt();
        
        System.out.println("");
        
        System.out.println("What was the fourth test out of?");
        int test4 = input.nextInt();
        System.out.println("What did you got on the fourth test?");
        int test4mark = input.nextInt();
        
        System.out.println("");
        
        System.out.println("What was the fifth test out of?");
        int test5 = input.nextInt();
        System.out.println("What did you got on the fifth test?");
        int test5mark = input.nextInt();
        
        System.out.println("");
        
        //Calcutions 
        double mark1 = test1mark / test1 * 100;
        System.out.println("Test 1: you got " + mark1 + " %");
        
        
    }
}
