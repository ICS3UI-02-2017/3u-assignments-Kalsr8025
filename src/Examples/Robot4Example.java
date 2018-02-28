/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;

import java.util.Scanner;

/**
 *
 * @author kalsr8025
 */
public class Robot4Example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //print a line of text
        System.out.println("Hello World");
        System.out.println("Another Line");
        
        //sout and press tab {system out}
        //empty means blank line
        System.out.println("");
        
        //printing on the same line 
        System.out.print("I like");
        System.out.print("cake");
        
        //blank like 
        
        //special characters printing 
        //Quotation marks (\")
        System.out.print("\"I'm inside a quotation marks");
        
        //slash \\
        System.out.println("A Slash \\");
        
        //a tab \t //a space \s
        System.out.println("pop\tpizza\tfries");
        
        //a new line \n 
        System.out.println("One line\nSecond line");
        
        //variable 
        int number = 10;
        System.out.println (number);
        System.out.println("number = " + number );
        System.out.println("number =" + number + ".YAY!");
        
        //use a scanner to read info
        Scanner input = new Scanner(System.in);
        
        //tell the user what to do?
        System.out.println("Please enter your name");
        
        //make a String to store a name 
        String name = input.nextLine();
        
        //say hello 
        System.out.println("hello" + name);
        
        //ask what year they were born
        System.out.println("What year were you born in?");
        
        //make a variable to store teh year info
        int birthyear = input.nextInt();
        int age = 2018 - birthyear;
        //your an idot loop 
        while(age < 0){
            System.out.println("Try again...");
            age = 2018 - birthyear ;
        }
        
        //tell the user 
        System.out.println("you are" + age + "year old!");
        
        if (age < 0){
            System.out.println("I dont think so");
        }else if (age >15){
            System.out.println("You are about to be adult soon");
        }
    }
}
