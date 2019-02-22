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
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        // Ask for what temperature in celcius needs to be converted to fahrenhiet
        System.out.println("Please enter a temperature you would like to convert in degrees Celsius");
        int fahrenheit = input.nextInt ();
        // First step towards solving for the temperature in farhenheit 
        int firstStep = (fahrenheit/9);
        // State and solve for the temperature in fahrenheit 
        System.out.println("The temperature in degrees fahrenheit is " + firstStep*37);
      
    
    }
    
}
