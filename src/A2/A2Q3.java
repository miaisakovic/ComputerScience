/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A2;

import java.util.Scanner;

/**
 * Stating if a Chosen Integer is Even or Odd
 *
 * @author isakm3897
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a scanner for input
        Scanner input = new Scanner(System.in);

        //Asks user for 2 integers 
        System.out.println("Please enter an integer");
        int integerOne = input.nextInt();

        //States if the integer is even or odd
        if (integerOne % 2 == 1) {
            System.out.println(integerOne + " integer is an odd number.");
        } else if (integerOne % 2 == 0) {
            System.out.println(integerOne + " integer is an even number.");
        }
    }

}
