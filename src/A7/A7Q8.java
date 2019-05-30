/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A7;

import java.util.Scanner;

/**
 *
 * @author isakm3897
 */
public class A7Q8 {

    //function type method
    public static boolean allDigitsOdd(int integer) {
        //set boolean variable 
        boolean odd = true;

        //loops through each digit of the integer 
        while (integer > 0) {
            //boolean is false since there is an even digit 
            if (integer % 2 == 0) {
                odd = false;
                break;
            }
            //boolean is true since there is an odd digit 
            if (integer % 2 == 1) {
                integer = integer / 10;
            }
        }
        //give back the answer 
        return odd;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a scanner for input
        Scanner input = new Scanner(System.in);

        //Ask the user for an integer
        System.out.println("Please enter a positive integer");
        int integer = input.nextInt();

        //outputs if boolean is true or false 
        boolean answer = allDigitsOdd(integer);
        System.out.println(answer);
    }

}
