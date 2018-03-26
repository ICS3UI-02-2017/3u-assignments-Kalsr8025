/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5;

import java.util.Scanner;

/**
 *
 * @author kalsr8025
 */
public class UbbiDubbiTranslator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // add a scanner 
        Scanner input = new Scanner(System.in);

        //1.The infix “ub” is added before each singular vowel in a given word
        //2.In the case of multiple vowels in a row, “ub” is added before the string of vowels.

        //Start of program 
        System.out.println("Hubellubo Thuberuber! Wubelcubomube tubo UbbbububiDubububbubi Trubansubaltubor");
        System.out.println("In Simple form...Hello There! Welcome to UbbiDubbi Transaltor");
        System.out.println("");
        System.out.println("Lets make some cool words using UbbiDubbi rules..");

        // Transaltor code 
        while (true) {
            System.out.println("");
            System.out.println("Enter a word to translate");
            //string fo the user's word 
            String original = input.nextLine();
            //sanitize the word 
            original = original.toLowerCase();

            //know the length of the 
            int length = original.length();

            //make a program so it check each letter to be a vowel or not; add a ub once 
            //and not place with twice vowel 

            //if (original.
            //|| original.startsWith("e")
            //|| original.startsWith("i")
            // || original.startsWith("o")
            // || original.startsWith("u")) {
            //}
        }
    }
}
