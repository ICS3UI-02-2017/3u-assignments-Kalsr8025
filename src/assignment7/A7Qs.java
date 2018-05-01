/*

 * To change this template, choose Tools | Templates

 * and open the template in the editor.

 */

package assignment7;


import java.util.Scanner;


/**

 *

 * @author kalsr8025

 */

public class A7Qs {


    //Method for question 1

    public static double circleArea(double r) {

        double area = Math.PI * Math.pow(r, 2);

        Math.floor(area);

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

                System.out.println(numarry[i]);


            }

        }

    }


    //Method for question 4

    public static double compoundInterest(double p, double r, double n) {

        double b = p * (Math.pow((1 + r), n));

        System.out.println("New Balance is " + b);

        return b;

    }


    //Method for Question 5

    public static void pattern(int x) {

        for (int i = 0; i < x; i++) {

            int random = (int) (Math.random() * (1));

            for (int y = 0; y < random; y++) {

                System.out.print("*");

            }

            System.out.print(" ");

        }

    }


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        // question 1 

        System.out.println("Type the radius of circle below:");

        double rofcircle = in.nextDouble();

        double area = circleArea(rofcircle);

        System.out.println("The area of the circle is " + area);


        //space 

        System.out.println(" ");


        //question 2

        System.out.println("Enter the mark below: ");

        int mark = in.nextInt();

        examGrade(mark);


        //space

        System.out.println(" ");


        //question 3

        System.out.println("factor of :");

        int num = in.nextInt();

        factor(num);


        //space 

        System.out.println(" ");


        //Question 4

        System.out.println("Enter the Initial principal:");

        double initial = in.nextDouble();

        System.out.println("Enter the Interest rate:");

        double rate = in.nextDouble();

        System.out.println("Enter the number of years:");

        double year = in.nextDouble();

        double b = compoundInterest(initial, rate, year);


        //Space 

        System.out.println(" ");


        //Question 5

        System.out.print("how many lines of asterisks do you want? ");

        int lines = in.nextInt();

        pattern(lines);


    }

}
