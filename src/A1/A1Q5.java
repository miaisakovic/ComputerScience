/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A1;

import java.util.Scanner;

/**
 *
 * @author isakm3897
 */
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a scanner for input 
       Scanner input = new Scanner (System.in);
       
        System.out.println("Please enter in the x coordinate of the first point");
         double xOne = input.nextDouble();
        System.out.println("Please enter in the y coordinate of the first point");
         double yOne = input.nextDouble();
        System.out.println("Please enter in the x coordinate of the second point");
         double xTwo = input.nextDouble();
        System.out.println("Please enter in the y coordinate of the second point");
         double yTwo = input.nextDouble();
         
         double slopeOne = yTwo - yOne;
         double slopeTwo = xTwo - xOne;
         double slope = slopeOne / slopeTwo;
               
         
         System.out.println("The slope of your line would be " + slope);
    }
    
}
