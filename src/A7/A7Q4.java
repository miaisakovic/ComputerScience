/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A7;

import java.util.Scanner;

/**
 * A Function-Type Method that will Return the new Balance of an Account After
 * the Compound Interest is Added
 *
 * @author isakm3897
 */
public class A7Q4 {

    //function-type method
    public static double compoundInterest(double principle, double interestRate, int years) {
        //Solve for the compound interest
        double newBalance = principle * (1 + interestRate) * Math.pow(principle, years);
        //give back the answer
        return newBalance;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a scanner for input
        Scanner input = new Scanner(System.in);

        //Ask the user for the initial amount
        System.out.println("Please enter the initial amount.");
        double principle = input.nextDouble();

        //Ask the user for the interest rate
        System.out.println("Please enter the interest rate.");
        double interestRate = input.nextDouble();

        //Ask the user for the number of years
        System.out.println("Please enter the number of years.");
        int years = input.nextInt();

        //Output the interest rate 
        double answer = compoundInterest(principle, interestRate, years);
        System.out.println("The compound interest is " + answer);

    }

}
