/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A2;

import java.util.Scanner;

/**
 * Are You Speeding???
 *
 * @author isakm3897
 */
public class A2Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a scanner for input
        Scanner input = new Scanner(System.in);

        //Asks user for speed limit and the recorded speed of the car 
        System.out.println("Enter the speed limit:");
        int speedLimit = input.nextInt();
        System.out.println("Enter the recorded speed of the car: ");
        int carSpeed = input.nextInt();

        //Tell user if they are within the speed limit or not
        if (speedLimit > carSpeed) {
            System.out.println("Congratulations, you are within the speed limit!");
        }else {
            System.out.println("You are speeding and your fine is $500.");
        }

    }

}
