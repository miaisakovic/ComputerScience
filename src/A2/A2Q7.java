/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A2;

import java.util.Scanner;

/**
 * FizzBuzz
 *
 * @author isakm3897
 */
public class A2Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a scanner for input
        Scanner input = new Scanner(System.in);

        //Asks user for 2 integers 
        System.out.println("Please enter a number to play FizzBuzz");
        int integer = input.nextInt();
        
        //Program states what you should say in the FizzBuzz game
        if (integer % 3 == 0 || integer % 5 == 0) {
            System.out.println("You should say Fizz");
        } else if (integer % 3 == 0 && integer % 5 == 0) {
            System.out.println("You should say FizzBuzz");
        } else {
            System.out.println("You should say " + integer);
        }

    }

}
