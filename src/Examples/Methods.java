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
public class Methods {
    //MUST BE INSIDE THIS ^

    //The HelloWorld method to say hello
    public static void helloWorld() {
        System.out.println("Hello World !!!");
    }

    public static void sayHello(String name) {
        System.out.println("Hello " + name);
    }

    //quad formula cal.. +
    public static double posQuadFormla(double a, double b, double c) {
        double discrim = b * b - 4 * a * c;
        double root = (-b + Math.sqrt(discrim)) / (2 * a);
        //send back the root
        return root;
    }
    //quad formula cal.. -

    public static double[] quadFormla(double a, double b, double c) {
        //create the array to store both roots 
        double[] roots = new double[2];
        double discrim = b * b - 4 * a * c;
        roots[0] = (-b + Math.sqrt(discrim)) / (2 * a);
        roots[1] = (-b - Math.sqrt(discrim)) / (2 * a);
        //send back the root
        return roots;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//INFO              ^   ^        ^
        //return type  name     Arguments 
        //void is NO
        //unviod is YES (Send back something
        //double does thing and send it back
        //String [] is extra things you need for it to run
        //Public double areaCircle (double radius) 
        //Public double area Rect (double length, double width) 


        //Start of code 
        Scanner in = new Scanner(System.in);

        //Call the helloWorld method
        helloWorld();

        //Ask for name
        System.out.println("What is your name?");
        String user = in.nextLine();
        sayHello(user);

        //PosQuad Formula 
        double pRoot = posQuadFormla(1, -5, -50);
        System.out.println("The Positive root is " + pRoot);

        //Quad Formula 
        double[] roots = quadFormla(1, -5, -50);
        System.out.println("The roots are " + roots[0] + " & " + roots[1]);


    }
}
