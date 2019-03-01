/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A2;

import java.util.Scanner;

/**
 * Pythagorean Triple
 *
 * @author isakm3897
 */
public class A2Q9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a scanner for input
        Scanner input = new Scanner(System.in);

        //Asks user for 2 integers 
        System.out.println("Enter an integer:");
        int integerOne = input.nextInt();
        System.out.println("Enter a second integer:");
        int integerTwo = input.nextInt();
        System.out.println("Enter a third integer:");
        int integerThree = input.nextInt();

        //Program states whether or not there is a Pythagorean Triple
        if (Math.pow(integerOne, 2) + Math.pow(integerTwo, 2) == Math.pow(integerThree, 2)) {
            System.out.println(integerOne + "^2 + " + integerTwo + "^2 = " + integerThree + "^2");
        } else if (Math.pow(integerTwo, 2) + Math.pow(integerThree, 2) == Math.pow(integerOne, 2)) {
            System.out.println(integerTwo + "^2 + " + integerThree + "^2 = " + integerOne + "^2");
        } else if (Math.pow(integerThree, 2) + Math.pow(integerOne, 2) == Math.pow(integerTwo, 2)) {
            System.out.println(integerThree + "^2 + " + integerOne + "^2 = " + integerTwo + "^2");
        } else {
            System.out.println("No Pythagorean Triple found!");
        }
    }

}
