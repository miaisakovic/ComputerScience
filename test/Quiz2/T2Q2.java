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

        int highestDivisor = 1;

        for (int i = 2; i <= integerOne && i <= integerTwo; i = i + 1) {
            int remainder = integerOne % i;
            int secondRemainder = integerTwo % i;
            highestDivisor = i;
            //check if divisor is actually a divisor 
            if (remainder == 0 && secondRemainder == 0) {
                System.out.println("The greatest common divisor is " + highestDivisor);
            }
        }
    }

}
