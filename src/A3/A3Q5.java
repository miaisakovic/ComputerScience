/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A3;

import java.util.Scanner;

/**
 * Asterisks
 *
 * @author isakm3897
 */
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a scanner for input
        Scanner input = new Scanner(System.in);

        //Asks user for an integer between 1 and 5
        System.out.println("Please enter an integer between 1 and 5:");
        int integer = input.nextInt();

        // counter variable used to control the loop
        int count = 0;
        // test: boolean test within (..)
        while (count < integer) {
            // body: statements within {..}
            System.out.print("*");
            count = count + 1;
        }

    }

}
