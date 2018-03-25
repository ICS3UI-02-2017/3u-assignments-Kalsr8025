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
        System.out.println("Type the word to translate into UbbiDubbi ..");

        // Transaltor code 
        while (true) {
            System.out.println("");
            System.out.println("Enter a word to translate");
            //string fo the user's word 
            String original = input.nextLine();
            char[] chars = original.toCharArray();

            String translated = new String();

            //sanitize the word 
            original = original.toLowerCase();

            //know the length of the word
            int length = original.length();

            //make a program so it check each letter to be a vowel or not; add a ub once 
            //and not place with twice vowel 
            for (int place = 1; place < length; place++) {
                char vowel = original.charAt(place);

                if (vowel == 'a'
                        || vowel == 'e'
                        || vowel == 'i'
                        || vowel == 'o'
                        || vowel == 'u') {
                    //check if the last letter was not a vowel 
                    if (original.charAt(place - 1) != 'a'
                            || original.charAt(place - 1) != 'e'
                            || original.charAt(place - 1) != 'i'
                            || original.charAt(place - 1) != 'o'
                            || original.charAt(place - 1) != 'u') {

                    }
                    translated += "ub";
                }
                translated += vowel;

            }
        }
    }
}
