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
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       // Create a scanner for input 
       Scanner input = new Scanner (System.in);
       
       // Ask user for two integers 
       System.out.println("Please enter in two integers, on seperate lines, to divide.");
       int integerOne = input.nextInt();
       input.nextLine(); 
       int integerTwo = input.nextInt();
    
       // Divide the 2 chosen integers
       int quotient = integerOne / integerTwo;
       int remainder = integerOne % integerTwo; 
       
       // state the quotient and remainder of the two chosen integers 
       System.out.println(integerOne + "/" + integerTwo +  " is " + quotient + " with a remainder of " + remainder + ".");
      
    }
    
}
