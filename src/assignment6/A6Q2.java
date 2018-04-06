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
public class A6Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Write a program to read in a series of heights of people and 
        //output all those that are above average in height for the group. 
        //You will first have to ask how many people you are going to be 
        //reading in to create your array. Once you have this, you can begin 
        //reading in the heights

        //add a scanner 
        Scanner input = new Scanner(System.in);

        // ask for how many students are in the class
        System.out.println("How many people are there? ");

        //make the int for the number of students 
        int people = input.nextInt();

        //ask for the marks of each students
        System.out.println("Please enter each person's height (one by one in cm) ");

        //make the number of array to get the average of all 
        int[] heights = new int[people];

        //Inout add into Arrays 
        for (int a = 0; a < heights.length; a++) {
            heights[a] = input.nextInt();
        }
        //add all the heights and average calculations 
        int average = 0;
        for (int b = 0; b < heights.length; b++) {
            average = average + heights[b];
        }
        average /= heights.length;


        //Above average people
        int aboveaverage = average;
        for (int c = 0; c < heights.length; c++) {
            if (heights[c] > aboveaverage) {
                aboveaverage += 1;
                System.out.println("Above average height is " + aboveaverage);
            }
        }

    }
}
