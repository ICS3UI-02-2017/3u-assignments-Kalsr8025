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
    public static double circleArea (double r){
        double area = Math.PI *Math.pow(r, 2);
        Math.floor(area);
        return area;
    }
    
    //Method for question 2
    public static void examGrade (int mark){
        if (mark < 50 ){
             System.out.println(" F ");
        }
        if (mark >49 && mark <60){
            System.out.println(" D ");   
    }
        if (mark >61 && mark <70){
            System.out.println(" C ");
        }
        if (mark >71 && mark <80){
            System.out.println(" B ");
        }
        if (mark > 81){
            System.out.println(" A ");
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // question 1 
        System.out.println("Type the radius of circle below:");
        double rofcircle = in.nextDouble();
        double area = circleArea (rofcircle);
        System.out.println("The area of the circle is " + area);
        
        //space 
        System.out.println(" ");
        
        //question 2
        System.out.println("Enter the mark below: ");
        int mark = in.nextInt();
        examGrade (mark);
    }
}
