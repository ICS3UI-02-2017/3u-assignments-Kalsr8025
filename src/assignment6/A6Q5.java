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
public class A6Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

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
        System.out.println(Arrays.toString(numbers));

        //cal. for median 
        if ((spots % 2) == 0) {
            int x1 = spots / 2;
            int median = numbers[x1 - 1] + numbers[x1];
            median = median / 2;
            System.out.println("The median of this set is " + median + ".");
        } else if (!((spots % 2) == 0));
        int x2 = Math.round(spots / 2);
        int median2 = numbers[x2];
        System.out.println("The median of this set is " + median2 + ".");

    }
}
