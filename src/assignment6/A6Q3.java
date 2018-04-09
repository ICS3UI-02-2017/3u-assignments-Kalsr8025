/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment6;

import java.util.Scanner;

/**
 *
 * @author kalsr8025
 */
public class A6Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Write a program to create and populate an array, A,
        //that contains only two integer elements. Moreover, the program will 
        //ensure the elements are placed in ascending order, once the array has
        //been populated.

        //add a scanner 
        Scanner input = new Scanner(System.in);

        // ask for how many students are in the class
        System.out.println("Enter the 2 numbers :");

        //make the int for the number of students 
        int[] numbers = new int[2];

        //Inout add into Arrays 
        for (int a = 0; a < numbers.length; a++) {
            numbers[a] = input.nextInt();
        }
        int swap = 0;
        for (int b = 0; b < 1; b++) {
            if (numbers[0] > numbers[1]) {
                swap = numbers[0];
                numbers[0] = numbers[1];
                numbers[1] = swap;
            }
            System.out.println("Number in order " + numbers[0] + "  " + numbers[1]);
        }

    }
}
