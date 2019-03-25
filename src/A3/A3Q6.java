/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A3;

import java.util.Scanner;

/**
 * “Square” of Asterisks
 *
 * @author isakm3897
 */
public class A3Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Asks user for an integer between 1 and 5
        System.out.println("Please enter an integer between 1 and 5:");
        int integer = input.nextInt();

        // counter variable to control loop
        int count = 0;
        // this loop will start a new line
        while (count < integer) {
            // body: statements within {..}
            System.out.println("");
            count = count + 1;
            // counter variable to control loop 
            int secondCount = 0;
            // this loop will output astericks
            while (secondCount < integer) {
                System.out.print("*");
                secondCount = secondCount + 1;

            }

        }
    }

}
