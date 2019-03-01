/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A2;

import java.util.Scanner;

/**
 * Is the Integer Special?
 *
 * @author isakm3897
 */
public class A2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a scanner for input
        Scanner input = new Scanner(System.in);

        //Asks user for 2 integers 
        System.out.println("Please enter an integer");
        int integerOne = input.nextInt();

        //States whether or not the chosen integer is special
        if (integerOne % 11 == 0) {
            System.out.println(integerOne + " is special!");
        } else if (integerOne % 11 == 1) {
            System.out.println(integerOne + " is special!");
        } else if (integerOne % 11 > 1) {
            System.out.println(integerOne + " is not special:(");
        }

    }

}
