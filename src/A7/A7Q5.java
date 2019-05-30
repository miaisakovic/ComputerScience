/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A7;

import java.util.Scanner;

/**
 * A Procedure-Type Method that will Produce a Pattern of a Random Number of
 * Asterisks Between 1 and 5 Along the Page
 *
 * @author isakm3897
 */
public class A7Q5 {

    //procedure-type method 
    public static void chaotic(int integer) {
        //loops through until there is asterick pattern on the wanted amount of lines
        for (int i = 0; i < integer; i++) {
            //gets a random number between 1 and 5
            int randNum = (int) (Math.random() * (5 - 1 + 1)) + 1;
            //loops through a random number of times so that there is 1 to 5 astericks on one line 
            for (int x = 0; x < randNum; x++) {
                System.out.print("*");
            }
            //makes a new line
            System.out.println("");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a scanner for input
        Scanner input = new Scanner(System.in);

        //Ask the user for the number of lines they would like for there to be an asterick pattern
        System.out.println("Please enter the number of lines you would like for there to be an asterick pattern");
        int integer = input.nextInt();

        //outputs asterick pattern
        chaotic(integer);
    }

}
