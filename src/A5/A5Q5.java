/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A5;

import java.util.Scanner;

/**
 * Determining the Nth Fibonacci Number
 *
 * @author isakm3897
 */
public class A5Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a scanner for input
        Scanner input = new Scanner(System.in);

        //asks user what Fibonacci number they would like to know
        System.out.println("What Fibonacci number would you like to know?");
        int fibonacciNum = input.nextInt();
        //clear the input buffer
        input.nextLine();

        //create array to store the fibonacci sequence
        int[] sequence = new int[fibonacciNum + 1];

        //Set the values of the first two Fibonacci numbers 
        sequence[0] = 1;
        if (fibonacciNum > 0) {
            sequence[1] = 1;
        }

        //use a for loop to go through the Fibonacci sequence until it reaches the Fibonacci number the user would like to know 
        for (int i = 2; i < fibonacciNum + 1; i++) {
            sequence[i] = sequence[i - 1] + sequence[i - 2];
        }

        //State the Fibonacci number the user would like to know
        System.out.println("The Fibonacci number for " + fibonacciNum + " is " + sequence[fibonacciNum]);

    }

}
