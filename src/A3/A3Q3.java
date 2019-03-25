/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A3;

import java.util.Scanner;

/**
 * A Program that will Prompt the User for a Number Between 1 and 10
 *
 * @author isakm3897
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a scanner for input
        Scanner input = new Scanner(System.in);

        //Asks user for a number between 1 and 10
        System.out.println("Please enter a number between 1 and 10");
        int integer = input.nextInt();

        //Boolean test within (..)
        while (integer <= 1 || integer >= 10) {
            // body: statements within {..}
            System.out.println("Please enter a number between 1 and 10");
            integer = input.nextInt();
        }
        //After the loop has finished
        System.out.println("You chose " + integer);

    }

}
