/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment6;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author kalsr8025
 */
public class A6Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Write a program that will read in a series of 10 marks. 
        //Once read in, the program will sort the array from 
        //lowest to highest mark. 

        //add a scanner 
        Scanner input = new Scanner(System.in);

        // ask for how many students are in the class
        System.out.println("Enter the marks  :");

        //make the int for the number of students 
        int[] numbers = new int[10];

        //Inout add into Arrays 
        for (int a = 0; a < numbers.length; a++) {
            numbers[a] = input.nextInt();
        }


        System.out.println(Arrays.toString(numbers));

    }
}

