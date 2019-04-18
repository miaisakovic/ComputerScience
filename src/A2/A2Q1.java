/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A2;

import java.util.Scanner;

/**
 * Determining Which of the Chosen 2 Numbers Input is the Largest One
 *
 * @author isakm3897
 */
public class A2Q1 {

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

        //States which integer is bigger in value
        if (integerOne > integerTwo) {
            System.out.println("The biggest number is " + integerOne);
        } else if (integerTwo > integerOne) {
            System.out.println("The biggest number is " + integerTwo);
        } else {
            System.out.println("Since the integers are equal, neither integer is greater than the other.");
        }
    }

}
