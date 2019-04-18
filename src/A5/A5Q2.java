/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A5;

import java.util.Scanner;

/**
 * Outputting the Lowest and Highest Integer the User Inputed by Using an Array
 *
 * @author isakm3897
 */
public class A5Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a scanner for input
        Scanner input = new Scanner(System.in);

        //Asks user for how many integers they would like to enter 
        System.out.println("How many integers would you like to enter?");
        int numIntegers = input.nextInt();
        //clear the input buffer
        input.nextLine();

        //Create array to store the value of the integers
        int[] valueOfInteger = new int[numIntegers];

        // Create variables to store the value of the highest and lowest integer inputed by the user
        int lowestInteger = 0;
        int highestInteger = 0;

        //Use a for loop to go through each value of the integers 
        for (int i = 0; i < numIntegers; i++) {
            //get the value of each integer 
            System.out.println("Enter an integer:");
            valueOfInteger[i] = input.nextInt();
             
            //These varaibles currently store the value of the first integer entered
            lowestInteger = valueOfInteger[i];
            highestInteger = valueOfInteger[i];
            
            //If the value of an integer is lower or higher than the integer the variaqble is currently storing, the variable will than store the value of that new integer
            if (lowestInteger > valueOfInteger[i]) {
                lowestInteger = valueOfInteger[i];
            }
            if (highestInteger < valueOfInteger[i]) {
                highestInteger = valueOfInteger[i];
            }
        }

        //state the lowest and highest number the user inputed
        System.out.println("The lowest number was " + lowestInteger + " and the highest number was " + highestInteger + ".");

    }
}
