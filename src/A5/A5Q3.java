/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A5;

import java.util.Scanner;

/**
 * Outputting 2 Integers in Ascending Order
 *
 * @author isakm3897
 */
public class A5Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a scanner for input
        Scanner input = new Scanner(System.in);

        //number of integers that will populate the array 
        int numIntegers = 2;

        //create array to store the value of the integers
        int[] valueOfInteger = new int[numIntegers];

        //use a for loop to go through each integer
        for (int i = 0; i < numIntegers; i++) {
            //get the value of each integer
            System.out.println("Please enter an integer");
            valueOfInteger[i] = input.nextInt();
        }

        //Some blank lines
        System.out.println("");
        System.out.println("");

        //Sort integers in ascending order
        for (int i = 0; i < valueOfInteger.length; i++) {
            if (valueOfInteger[0] > valueOfInteger[1]) {
                int a = valueOfInteger[1];
                valueOfInteger[1] = valueOfInteger[0];
                valueOfInteger[0] = a;
            } else if (valueOfInteger[0] <= valueOfInteger[1]) {
            }
        }
        //State the integers in ascending order
        System.out.println("These integers in ascending order are " + valueOfInteger[0] + ", " + valueOfInteger[1]);
    }
}
