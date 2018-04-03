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

        // Transaltor code 
        while (true) {
            System.out.println("");
            System.out.println("Enter a word to translate");

            //string fo the user's word 
            String original = input.nextLine();

            //sanitize the word 
            original = original.toLowerCase();

            //make a string with orignal for translated 
            String translated = " " + original;

            //know the length of the word
            // int length = translated.length();

            //make a program so it check each letter to be a vowel or not; add a ub once 
            //and not place with twice vowel 
            for (int place = 0; place < translated.length(); place++) {
                char vowel = translated.charAt(place);
                if (vowel == 'a'
                        || vowel == 'e'
                        || vowel == 'o'
                        || vowel == 'i'
                        || vowel == 'u') {

                    if (!(translated.charAt(place - 1) == 'a'
                            || translated.charAt(place - 1) == 'e'
                            || translated.charAt(place - 1) == 'o'
                            || translated.charAt(place - 1) == 'i'
                            || translated.charAt(place - 1) == 'u')) {

                        //Make two sub-strings 
                        String one = translated.substring(0, place);
                        String two = translated.substring(place);

                        //make the transalted word 
                        translated = one + "ub" + two;

                        //move places to check for more vowel 
                        place = place + 2;

                    }
                }
            }//Output to user 
            System.out.println("");
            System.out.println(original + " in UbbiDubbi translates to " + translated);
        }
    }
}
