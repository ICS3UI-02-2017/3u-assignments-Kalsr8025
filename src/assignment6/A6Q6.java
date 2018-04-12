/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment6;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author kalsr8025
 */
public class A6Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a program that will ask a user for the size of a class. 
        //It will then read in all of the marks for the class into an array. 
        //Once this is done, the program should compute the lowest mark, the
        //highest mark, and the average mark for the class that has been entered.
        //These 3 things should be output to the user in a nice way. 
        //add a scanner 
        Scanner input = new Scanner(System.in);

        // ask for how many students are in the class
        System.out.println("How many marks are there?");

        //make a int for the number user input
        int spots = input.nextInt();

        //tell user to input marks
        System.out.println("Enter the marks: ");

        //make the int for the number of students 
        int[] numbers = new int[spots];

        //Input add into Arrays 
        for (int a = 0; a < numbers.length; a++) {
            numbers[a] = input.nextInt();
        }
        for (int x = 0; x < numbers.length; x++) {
            for (int y = x + 1; y < numbers.length; y++) {
                if (numbers[x] > numbers[y]) {
                    int swap = 0;
                    swap = numbers[x];
                    numbers[x] = numbers[y];
                    numbers[y] = swap;
                }
            }
        }

        System.out.println("The number from lowest to hightest " + Arrays.toString(numbers));

        //cal. for average 
        int average = 0;
        for (int b = 0; b < numbers.length; b++) {
            average = average + numbers[b];
        }
        average /= numbers.length;

        System.out.println("The average of the class is " + average);
        System.out.println("The lowest mark is " + numbers[0]);
        System.out.println("The hightest mark is " + numbers[numbers.length - 1]);
    }
}
