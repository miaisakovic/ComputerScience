/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A2;

import java.util.Scanner;

/**
 * Ordering Numbers in Ascending Order
 *
 * @author isakm3897
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a scanner for input
        Scanner input = new Scanner(System.in);

        //Asks user for 2 integers 
        System.out.println("Please enter an integer");
        int integerOne = input.nextInt();
        System.out.println("Please enter another integer");
        int integerTwo = input.nextInt();

        // States integers in ascending order
        if (integerOne > integerTwo) {
            System.out.println("Your numbers in ascending order are " + integerOne + ", " + integerTwo);
        } else if (integerTwo > integerOne) {
            System.out.println("Your numbers in ascending order are " + integerTwo + ", " + integerOne);
        } else {
            System.out.println("Since the numbers are equal, they cannot be put into ascending order.");
        }
    }

}
