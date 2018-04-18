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
public class A6Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // add a scanner to know what the user have wrote.  
        Scanner input = new Scanner(System.in);

        // ask for how many numbers are there
        System.out.println("How many numbers are there?");

        //make a int for the number user input
        int num = input.nextInt();

        //Creating the array 
        int[] listofnum = new int[num];

        //add a extra line 
        System.out.println("");

        //adding the numbers to array 
        for (int p = 0; p < listofnum.length; p++) {
            listofnum[p] = (p + 2);
        }

        //creating boolean to equal to true 
        boolean[] numprime = new boolean[num];
        for (int a = 0; a < listofnum.length; a++) {
            numprime[a] = true;
        }

        //print out only is it true 
        for (int pn = 0; pn < listofnum.length; pn++) {
            if (numprime[pn] == true) {
                System.out.println("The prime number is " + listofnum[pn]);
            }

            //dont print out; if the number is not prime 
            for (int pn2 = 0; pn2 < listofnum.length; pn2++) {
                if (listofnum[pn2] % listofnum[pn] == 0) {
                    numprime[pn2] = false;

                }

            }

        }
    }
}
