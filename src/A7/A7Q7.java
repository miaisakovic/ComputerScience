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
public class A7Q7 {

    //function type method
    public static int firstDigit(int integer) {
        //variable to store the first digit of the integer 
        int firstNumber = 0;
        //loops through until the number becomes single digit
        while (integer > 10 || integer < -10) {
            //pulls apart the number into digits by dividing by 10 
            firstNumber = integer / 10;
            integer = firstNumber;
        }
        //if the integer is single digit, it will directly output it 
        if (integer < 10 && integer > -10) {
            firstNumber = integer;
        }
        //makes a negative number positive 
        if (firstNumber < 0) {
            firstNumber = firstNumber * (-1);
        }
        //give back the answer
        return firstNumber;
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

        //outputs the first digit of an integer 
        int answer = firstDigit(integer);
        System.out.println(answer);
    }

}
