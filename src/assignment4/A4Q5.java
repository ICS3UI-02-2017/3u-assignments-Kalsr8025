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
        double test2 = input.nextInt();
        System.out.println("What did you got on the second test?");
        double test2mark = input.nextInt();

        System.out.println("");

        System.out.println("What was the third test out of?");
        double test3 = input.nextInt();
        System.out.println("What did you got on the third test?");
        double test3mark = input.nextInt();

        System.out.println("");

        System.out.println("What was the fourth test out of?");
        double test4 = input.nextInt();
        System.out.println("What did you got on the fourth test?");
        double test4mark = input.nextInt();

        System.out.println("");

        System.out.println("What was the fifth test out of?");
        double test5 = input.nextInt();
        System.out.println("What did you got on the fifth test?");
        double test5mark = input.nextInt();

        System.out.println("");

        //Calcutions 
        double mark1 = test1mark / test1 * 100;
        System.out.println("Test 1: you got " + mark1 + " %");

        double mark2 = test2mark / test2 * 100;
        System.out.println("Test 2: you got " + mark2 + " %");

        double mark3 = test3mark / test3 * 100;
        System.out.println("Test 3: you got " + mark3 + " %");

        double mark4 = test4mark / test4 * 100;
        System.out.println("Test 5: you got " + mark4 + " %");

        double mark5 = test5mark / test5 * 100;
        System.out.println("Test 5: you got " + mark5 + "%");

        //average 
        double average = ((mark1 + mark2 + mark3 + mark4 + mark5) / 5);
        if ((average) <= 50) {
            System.out.println("You are failing right now");
        }
        System.out.println(name + ", your current average is " + average + "%");

    }
}
