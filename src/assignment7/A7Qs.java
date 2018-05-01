/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment7;

import java.util.Scanner;

/**
 *
 *
 *
 * @author kalsr8025
 *
 */
public class A7Qs {

    //Method for question 1
    public static double circleArea(double r) {
        double area = Math.PI * Math.pow(r, 2);
        return area;
    }

    //Method for question 2
    public static void examGrade(int mark) {
        if (mark < 50) {
            System.out.println(" F ");
        }
        if (mark > 49 && mark < 60) {
            System.out.println(" D ");
        }
        if (mark > 61 && mark < 70) {
            System.out.println(" C ");
        }
        if (mark > 71 && mark < 80) {
            System.out.println(" B ");
        }
        if (mark > 81) {
            System.out.println(" A ");
        }
    }

    //Method for question 3
    public static void factor(int num) {
        int[] numarry = new int[num];
        for (int x = 0; x < numarry.length; x++) {
            numarry[x] = (x + 1);
        }

        for (int i = 0; i < numarry.length; i++) {
            if ((num % numarry[i]) == 0) {
                System.out.println("Factors are " + numarry[i]);
            }
        }
    }

    //Method for question 4
    public static double compoundInterest(double p, double r, double n) {
        double b = p * (Math.pow((1 + r), n));
        System.out.println("New Balance is $" + b);
        return b;
    }

    //Method for Question 5
    public static void chaotic(int x, int n, int a) {
        for (int i = 0; i < x; i++) {
            int random = (int) (Math.random() * (n - a + 1)) + a;
            for (int y = 0; y < random; y++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    //Method for Question 6
    public static double lastDigit(double num) {
        double finalnum = num % 10;
        if (finalnum < 0) {
            finalnum = finalnum * -1;
        }
        return finalnum;
    }

    //Method for Question 7
    public static double firstDigit(double num2) {
        for (int i = 0; i < num2; i++) {
            if (num2 < -10){
                num2 = num2 %10;
            }
            else if (num2 > 10){
                num2 = num2 %10;
            }
             if (num2 < 0) {
            num2 = num2 * -1;
        }    
        }
        return num2;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // question 1 
        System.out.println("Type the radius of circle below:");
        double rofcircle = in.nextDouble();
        double area = circleArea(rofcircle);
        System.out.printf("The area of the circle is %.2f \n", area);

        //space 
        System.out.println("________________________________________________________________");

        //question 2
        System.out.println("Enter the mark below: ");
        int mark = in.nextInt();
        examGrade(mark);

        //space
        System.out.println("________________________________________________________________");

        //question 3
        System.out.println("factor of :");
        int num = in.nextInt();
        factor(num);

        //space 
        System.out.println("________________________________________________________________");

        //Question 4
        System.out.println("Enter the Initial principal:");
        double initial = in.nextDouble();
        System.out.println("Enter the Interest rate:");
        double rate = in.nextDouble();
        System.out.println("Enter the number of years:");
        double year = in.nextDouble();
        double b = compoundInterest(initial, rate, year);

        //Space 
        System.out.println("________________________________________________________________");

        //Question 5
        System.out.println("how many lines of asterisks do you want? ");
        int lines = in.nextInt();
        System.out.println("Highest number of * : ");
        int n = in.nextInt();
        System.out.println("Lowest number of * : ");
        int a = in.nextInt();
        chaotic(lines, n, a);

        //Space 
        System.out.println("________________________________________________________________");

        //Question 6
        System.out.println("Enter the numbers: ");
        double number = in.nextDouble();
        double answer = lastDigit(number);
        System.out.printf("The last digit is %.0f \n", answer);

        //Space 
        System.out.println("________________________________________________________________");

        //Question 7
        System.out.println("Enter the numbers: ");
        double number2 = in.nextDouble();
        double answerlast = firstDigit(number2);
        System.out.printf("The last digit is %.0f \n", answerlast);
    }
}
