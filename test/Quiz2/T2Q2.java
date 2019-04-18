/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz2;

import java.util.Scanner;

/**
 * Finding the Greatest Common Divisor
 *
 * @author isakm3897
 */
public class T2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a scanner for input
        Scanner input = new Scanner(System.in);

        //Asks user for 2 integers 
        System.out.println("Please enter your first integer");
        int integerOne = input.nextInt();
        System.out.println("Please enter your second integer");
        int integerTwo = input.nextInt();
        
        int divisor = 1;
       
        
        for (divisor = 1; divisor <= integerOne && divisor <= integerTwo; divisor = divisor +1){
           int remainder = integerOne%divisor;
            int secondRemainder = integerTwo%divisor;
                    
            //check if divisor is actually a divisor 
             if (remainder == 0&&secondRemainder == 0) {
                System.out.println("The greatest common divisor is " + divisor);
            }
        }
    }

}
