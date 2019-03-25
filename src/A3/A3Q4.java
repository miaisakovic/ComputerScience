/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A3;

import java.util.Scanner;

/**
 * Numbers Between 1 and n
 *
 * @author isakm3897
 */
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a scanner for input
        Scanner input = new Scanner(System.in);

        //Asks user for an integer greater than 1 
        System.out.println("Please enter an integer greater than 1:");
        int integer = input.nextInt();

        // counter variable used to control the loop
        int count = 1;
        // test: boolean test within (..)
        while (count < integer) {
            // body: statements within {..}
            System.out.print("[" + count + "], ");
            count = count + 1;
        }
        // After the loop has finished output the integer chosen by the user in square brackets
        System.out.print("[" + integer + "]");

    }

}
