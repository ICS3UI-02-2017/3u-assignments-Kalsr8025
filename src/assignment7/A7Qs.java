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
        //If less than 50 then print F
        if (mark < 50) {
            System.out.println(" F ");
        }
        //If in between 49 and 60 then print F
        if (mark > 49 && mark < 60) {
            System.out.println(" D ");
        }
        //If in between 61 and 70 then print F
        if (mark > 61 && mark < 70) {
            System.out.println(" C ");
        }
        //If in between 71 and 80 then print F
        if (mark > 71 && mark < 80) {
            System.out.println(" B ");
        }
        //If less than 81 then print F
        if (mark > 81) {
            System.out.println(" A ");
        }
    }

    //Method for question 3
    public static void factor(int num) {
        int[] numarry = new int[num];
        //add numbers to array 
        for (int x = 0; x < numarry.length; x++) {
            numarry[x] = (x + 1);
        }
        //if reminder is 0 than print out 
        for (int i = 0; i < numarry.length; i++) {
            if ((num % numarry[i]) == 0) {
                System.out.println("Factors are " + numarry[i]);
            }
        }
    }

    //Method for question 4
    public static double compoundInterest(double p, double r, double n) {
        //formula for compound interest
        double b = p * (Math.pow((1 + r), n));
        //print out new balance 
        System.out.println("New Balance is $" + b);
        return b;
    }

    //Method for Question 5
    public static void chaotic(int x, int n, int a) {
        for (int i = 0; i < x; i++) {
            //Formula to random *
            int random = (int) (Math.random() * (n - a + 1)) + a;
            for (int y = 0; y < random; y++) {
                //print out the **
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    //Method for Question 6
    public static int lastDigit(int num) {
        //Find the last digit 
        int finalnum = num % 10;
        //Make it positive 
        if (finalnum < 0) {
            finalnum = finalnum * -1;
        }
        return finalnum;
    }

    //Method for Question 7
    public static int firstDigit(int num2) {
        //make it +
        if (num2 < 0) {
            num2 = num2 * -1;
        }
        //Math to find the First digit 
        for (int i = 0; i < num2; i++) {
            if (num2 > 10) {
                int reminder = num2 % 10;
                num2 = num2 - reminder;
                num2 /= 10;
            }
        }
        return num2;
    }

    //Method for Question 8 
    public static boolean allDigit(int numbers) {
        boolean evenodd = true;
        int reminder = numbers % 10;
        //make it positive 
        if (numbers < 0) {
            numbers *= -1;
        }
        //Math formula to find odd or even 
        for (int i = 0; i < numbers; i++) {
            if (numbers > 10) {
                numbers = numbers - reminder;
                numbers /= 10;
            }
            // if even print false 
            if (reminder % 2 == 0) {
                evenodd = false;
                break;
            }
            // if odd print true
            if (!(reminder % 2 == 0)) {
                evenodd = true;
            }
        }
        return evenodd;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // question 1 
        //Ask a Question 
        System.out.println("Type the radius of circle below:");
        //Get the answer 
        double rofcircle = in.nextDouble();
        //add circle of area into area double 
        double area = circleArea(rofcircle);
        //print out 
        System.out.printf("The area of the circle is %.2f \n", area);

        //space 
        System.out.println("________________________________________________________________");

        //question 2
        //Ask for mark
        System.out.println("Enter the mark below: ");
        //collect mark
        int mark = in.nextInt();
        //relate it to method 
        examGrade(mark);

        //space
        System.out.println("________________________________________________________________");

        //question 3
        //ask for number 
        System.out.println("factor of :");
        //collect number 
        int num = in.nextInt();
        //relate to method 
        factor(num);

        //space 
        System.out.println("________________________________________________________________");

        //Question 4
        //ask questions and make a double for it 
        System.out.println("Enter the Initial principal:");
        double initial = in.nextDouble();
        System.out.println("Enter the Interest rate:");
        double rate = in.nextDouble();
        System.out.println("Enter the number of years:");
        double year = in.nextDouble();
        //send the int to method 
        double b = compoundInterest(initial, rate, year);

        //Space 
        System.out.println("________________________________________________________________");

        //Question 5
        //ask questions
        System.out.println("how many lines of asterisks do you want? ");
        int lines = in.nextInt();
        System.out.println("Highest number of * : ");
        int n = in.nextInt();
        System.out.println("Lowest number of * : ");
        int a = in.nextInt();
        //send it back to method 
        chaotic(lines, n, a);

        //Space 
        System.out.println("________________________________________________________________");

        //Question 6
        //Ask for number 
        System.out.println("Enter the number: ");
        int number = in.nextInt();
        //get the answer from method 
        int answer = lastDigit(number);
        //pritn it out 
        System.out.println("The last digit is " + answer);

        //Space 
        System.out.println("________________________________________________________________");

        //Question 7
        //Ask question 
        System.out.println("Enter the number: ");
        int number2 = in.nextInt();
        //Get the answer from method 
        int answerlast = firstDigit(number2);
        //pritn it out 
        System.out.println("The last digit is " + answerlast);

        //Space 
        System.out.println("________________________________________________________________");

        //Question 8 
        //Ask for a odd number 
        System.out.println("Enter the odd number: ");
        int odd = in.nextInt();
        //print the answer got from the method 
        System.out.println(allDigit(odd));
    }
}
