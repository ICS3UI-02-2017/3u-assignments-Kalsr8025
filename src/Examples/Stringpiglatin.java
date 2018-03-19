/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;

import java.util.Scanner;

/**
 *
 * @author Kalsr8025
 */
public class Stringpiglatin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a string 
        //String word = "Hello World";
        //string is an object. list of charcters
        // |H|E|L|L|O| |W|O|R|L|D|
        //  0 1 2 3 4 5 6 7 8 9 10
        //lowercase or UPPERCASE\
        //word = word.toLowerCase();
        //word = word.toUpperCase();
        //Ask how big it is 
        //int length = word.length();
        //if (word.contains(word)) 
        // word.endswith ("..");
        // word.contains ("..");
        //char eCharcter = word.charAt(4);
        // if (word.charAt(4) == '0') 
        //sub string 
        //String end = word.substring(6);
        //String begin = word.substring(0, 5);
        // new word 
        //String reverse = end + "_" + begin;


        //Start of code 
        Scanner input = new Scanner(System.in);

        //While loop 
        while (true) {
            //get the word to translate 
            System.out.println("Enter a word to translate");
            String origWord = input.nextLine();

            //sanitize the input 
            origWord = origWord.toLowerCase();

            //do we start with a vowel?
            if (origWord.startsWith("a")
                    || origWord.startsWith("o")
                    || origWord.startsWith("e")
                    || origWord.startsWith("i")
                    || origWord.startsWith("u")) {
                //translate a word 
                String transWord = origWord + "ay";
                System.out.println(origWord + " in Pig Latin is " + transWord);
            } else {
                //walk down the word looking for vowel
                int length = origWord.length();
                //use a for loop to go through 
                for (int i = 1; i < length; i++) {
                    //look at chararcter at 
                    if (origWord.charAt(i) == 'a'
                            || origWord.charAt(i) == 'e'
                            || origWord.charAt(i) == 'i'
                            || origWord.charAt(i) == 'o'
                            || origWord.charAt(i) == 'u') {
                        //i is the poition of the vowel 
                        //break word at vowel 
                        String start = origWord.substring(0,i);
                        String end = origWord.substring(i);
                        //transalted word 
                        String reverse = end + start + "ay";
                        //tell the user 
                        System.out.println(origWord + " in Pig Latin is " + reverse);
                        
                        //done looking so stop the "for" loop 
                        break;
                    }

                    {
                    }
                }
            }

        }
    }
}
