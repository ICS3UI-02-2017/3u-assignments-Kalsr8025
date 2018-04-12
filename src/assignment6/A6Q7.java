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
        //Create a program that will determine all of the prime numbers between 
        //2 and 1000. You will use a process called "The Sieve of Eratosthenes"
        //A Sieve of Eratosthenes works in the following manner: Create 
        //a list of consecutive integers from 2 to n: (2, 3, 4, ..., n ).  This is the sieve
        //Initially, let p equal 2, the first prime number.  Starting from p
        //count up in increments of p and mark each of these numbers greater than 
        //p itself in the list.These will be multiples of p; 2p, 3p, 4p, etc.;
        //note that some of them may have already been marked
        //Find the first number greater than p in the list that is not marked. If there 
        //was no such number, stop. Otherwise, let p now equal this number(which is 
        //the next prime), and repeat from step 3. All the numbers not marked in the
        //list are prime. You can use a boolean array to mark as true (it is a prime) 
        //or false(it is not a prime). The index of the array will correspond to the number 
        //you are investigating as a prime (i.e., the spot 5 in the boolean array would 
        //determine if 5  {was prime or not).

        Scanner input = new Scanner(System.in);

        //make the int for the number of students 
        int[] numbers = new int[999];

        //place each numbers in the array 
        for (int x = 0; x < numbers.length; x++) {
            numbers[x] = (x+2);
            System.out.println(numbers[x]);
        }

    }
}
