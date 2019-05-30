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
public class A7Q6 {

    //function type method
    public static int lastDigit(int integer) {
        //pulls apart a number into digits by using modulus 10 
        int lastNumber = integer % 10;
        //makes any negative number positive
        if (lastNumber < 0) {
            lastNumber = lastNumber * (-1);
        }
        //give back the answer
        return lastNumber;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a scanner for input
        Scanner input = new Scanner(System.in);

        //Ask the user for an integer
        System.out.println("Please enter an integer");
        int integer = input.nextInt();

        //outputs the last digit of an integer 
        int answer = lastDigit(integer);
        System.out.println(answer);
    }

}
