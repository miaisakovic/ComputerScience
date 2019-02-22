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
public class A1Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a scanner for input 
       Scanner input = new Scanner (System.in);
       
        System.out.println("Please enter the a value of the parabola.");
         double a = input.nextDouble();
        System.out.println("Please enter the b value of the parabola.");
         double b = input.nextDouble();
        System.out.println("Please enter the c value of the parabola.");
         double c = input.nextDouble();
        
         double positiveValue = (-b + Math.sqrt(Math.pow(b,2) - 4*a*c))/2*a;
         double negativeValue = (-b - Math.sqrt (Math.pow(b,2) - 4*a*c))/2*a;
      
         System.out.println("The positive root is " + positiveValue);
        System.out.println("The negative root is " + negativeValue);
    }
    
}
