/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A7;

import java.util.Scanner;

/**
 * A Function Type Method That Returns the Area of a Circle Given the Radius
 *
 * @author isakm3897
 */
public class A7Q1 {

    //function-type method
    public static double circleArea(double radius, double PI) {
        //Solve for the area
        double area = Math.pow(radius, 2) * PI;
        //give back the answer
        return area;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a scanner for input
        Scanner input = new Scanner(System.in);

        //Ask the user for the radius of the circle
        System.out.println("Please enter the radius of a circle in cm.");
        double radius = input.nextDouble();

        //Output the area of the circle 
        double answer = circleArea(radius, Math.PI);
        System.out.println(answer);

    }

}
