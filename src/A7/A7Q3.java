/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A7;

import java.util.Scanner;

/**
 * A Procedure-Type Method That Will Take an Integer as a Parameter and Will
 * Print Out Every Number That Will Divide the Parameter Evenly
 *
 * @author isakm3897
 */
public class A7Q3 {

    //procedure-type method 
    public static void factors(int integer) {
        //loops through until all factors of the integer are found
        for (int i = 1; i <= integer; i = i + 1) {
            int remainder = integer % i;
            //checking that the number is a factor
            if (remainder == 0 && i != integer) {
                //outputs factors with a comma at the end
                System.out.print(i + ", ");
            } else if (remainder == 0 && i == integer) {
                //outputs last factor with no comma at the end
                System.out.println(i);
            }
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a scanner for input
        Scanner input = new Scanner(System.in);

        //Ask the user for an integer 
        System.out.println("Please enter an integer:");
        int integer = input.nextInt();

        //outputs factors of the integer 
        factors(integer);

    }

}
