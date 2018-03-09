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
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //use a scanner to read info
        Scanner input = new Scanner(System.in);

        //player int
        int player = 1;

        //greet 
        System.out.println("Welcome the digital snake and ladder game!!");
        System.out.println("If you have a dice ready then lets play...");
        System.out.println("");



        //start the game 
        while (player <= 100) {

            //ask questions
            System.out.println("Enter the number you got on dice....");
            String roll = input.nextLine();
            int dice = Integer.parseInt(roll);
            if (dice >= 1 && dice <= 6) {
                player += dice;
                System.out.println("YOU ARE AT " + player);
            }
            //finishing command 
            if (player > 100) {
                player -= dice;
                System.out.println("Try AGAIN");
            }

            //quit this game command 
            while (dice == 0) {
                System.out.println("You have quitted the game");
            }
            //ladder 
            if (player == 9) {
                player = player + 25;
                System.out.println("Ladder helped you get to 34");
            }
            if (player == 40) {
                player = player + 24;
                System.out.println("Ladder helped you get to 64");
            }
            if (player == 67) {
                player = player + 19;
                System.out.println("Ladder helped you get to 86");
            }
            while (player == 100) {
                System.out.println("YOU WIN \n Good Job");
            }

            //snake in the way 
            if (player == 54) {
                player = player - 35;
                System.out.println("You stepped on Cobra which took you to 19");
            }
            if (player == 90) {
                player = player - 42;
                System.out.println("You stepped on Cobra which took you to 48");
            }
            if (player == 99) {
                player = player - 22;
                System.out.println("You stepped on Cobra which took you to 77");
            }


        }

    }
}
