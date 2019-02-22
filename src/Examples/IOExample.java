/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;

import java.util.Scanner;

/**
 *Example of Java Input and Output
 * @author isakm3897
 */
public class IOExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       // Output text to the screen on a new line
       System.out.println("Hello World");
       
       // Prints text but waits at the end of the line
       System.out.print("Hello");
       System.out.print("World"); 
       
       // Finish a line or print a blank line 
       System.out.println();
       
       // Create a string variabel for name
       String name = "Mia Isakovic";
       // say hello to person
       System.out.println ("Hello " + name);
       
       // Change the name variable
       name = "Vshee Baller";
       System.out.println(name);
       
       // Create a scanner for input 
       Scanner input = new Scanner (System.in);
       
       // Scans in the user's year of birth
       System.out.println("Please enter the year you were born");
       int birthYear = input.nextInt();
       
       // Caculate how old they are
       int age = 2019 - birthYear;
       
       System.out.println("You could be " + age + " years old.");
       
       // + - addition
       // - - subtraction
       // * - multiplication
       // / - division
       // % - remainder (modulus) 5%2 = 1
       // Math.pow (base, exponent) = power
       // Math.sqrt (number) = square root
    }    
}
