/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A3;

import java.util.Scanner;

/**
 * Guessing Game
 *
 * @author isakm3897
 */
public class A3Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Asks user for an integer between 1 and 100
        System.out.println("Welcome to the number guessing game!");
        System.out.println("Please enter your guess between 1 and 100:");
        int integer = input.nextInt();

        // create a variable for the random number that will be generated 
        int number = (int) (Math.random() * 100 + 1);

        // loop through until the user finds the correct number
        while (integer != number) {
            if (integer > number) {
                System.out.println("Too high!");
                System.out.println("Please enter your guess between 1 and 100:");
                integer = input.nextInt();
            }
            if (integer < number) {
                System.out.println("Too low!");
                System.out.println("Please enter your guess between 1 and 100:");
                integer = input.nextInt();
            }
        }
        // State that the number is correct when it matches the value of the random number
        if (integer == number) {
            System.out.println("Correct!");
        }

    }

}
