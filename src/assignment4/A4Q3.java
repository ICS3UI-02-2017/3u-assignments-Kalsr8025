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
public class A4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Greet the user 
        System.out.println("Hello there!\ntype 4 numbers in seprate lines");

        //collect the numbers 
        Scanner input = new Scanner(System.in);

        //place the numbers in sigle lines 
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();
        Math.floor(num4);
        Math.floor(num3);
        Math.floor(num2);
        Math.floor(num1);

        System.out.println("Were these your numbers? \n"
                + num1 + ", " + num2 + ", " + num3 + ", " + num4);
    }
}
