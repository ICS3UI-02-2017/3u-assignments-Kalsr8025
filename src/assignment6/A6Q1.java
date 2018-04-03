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
public class A6Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Read in a list of students’ marks in a computer science class,
        //and calculate the class mean (average), to (2 decimal places).

        //add a scanner 
        Scanner input = new Scanner(System.in);

        // ask for how many students are in the class
        System.out.println("Enter the number of students in the class");

        //make the int for the number of students 
        int students = input.nextInt();

        //ask for the marks of each students
        System.out.println("Please enter each student's mark in a row");

        //make the number of array 
        int[] marks = new int[students];

    }
}
