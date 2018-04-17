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
      
        //add a scanner 
        Scanner input = new Scanner(System.in);

        // ask for how many students are in the class
        System.out.println("Enter the number of students in the class");

        //make the int for the number of students 
        int students = input.nextInt();

        //ask for the marks of each students
        System.out.println("Please enter each student's mark");

        //make the number of array 
        double[] marks = new double[students];

        for (int i = 0; i < marks.length; i++) {
            marks[i] = input.nextInt();
        }
        double sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum = sum + marks[i];
        }
        sum /= marks.length;

        //new way of print format 
        System.out.printf("The average is %.2f \n", sum + "%");
    }
}
