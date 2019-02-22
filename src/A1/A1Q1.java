/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A1;

import java.util.Scanner;

/**
 *Calculates the Sum and Product of 2 Integers
 * @author isakm3897
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       // Create a scanner for input 
       Scanner input = new Scanner (System.in);
       
       // Scans in the user's 2 integers
       System.out.println("Please enter two integers on seperate lines to run calculations");
       int integerOne = input.nextInt();
       input.nextLine(); 
       int integerTwo = input.nextInt();
       
       // Caculate the sum of the 2 chosen integers
       int sum = integerOne + integerTwo;
       
       System.out.println("The sum of these two integers is " + sum);
       
       // Calculate the product of the 2 chosen integers
       int product = integerOne * integerTwo;
       
       // State the product and sum of the two chosen integers
       System.out.println("The product of these two integers is " + product);
    }
    
}
