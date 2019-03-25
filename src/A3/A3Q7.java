/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A3;

import java.util.Scanner;

/**
 * The Minimum and the Maximum Value of What the User Entered
 *
 * @author isakm3897
 */
public class A3Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a scanner for input
        Scanner input = new Scanner(System.in);

        //Asks user for a positive integer
        System.out.println("Please enter a positive integer (type -1 to stop):");
        int integer = input.nextInt();

        // Create variables to store the value of the highest and lowest number inputed by the user
        int lowestNumber = integer;
        int highestNumber = integer;

        // loop through until user inputs -1
        while (integer > 0) {
            System.out.println("Please enter a positive integer (type -1 to stop):");
            integer = input.nextInt();
            if (lowestNumber > integer && integer > 0) {
                lowestNumber = integer;
            }
            if (highestNumber < integer) {
                highestNumber = integer;
            }
            //state the lowest and highest number the user inputed
            if (integer == -1) {
                System.out.println("The lowest number was " + lowestNumber + " and the highest number was " + highestNumber + ".");
            }
        }

    }

}
