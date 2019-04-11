/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A4;

import java.util.Scanner;

/**
 * Outputting a Word Without A's
 *
 * @author isakm3897
 */
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a scanner for input
        Scanner input = new Scanner(System.in);

        //Asks user for a word
        System.out.println("Please enter a word");
        String word = input.nextLine();

        //Replaces all the a's with nothing 
        String newWord = word.replace("a", "");

        //Outputs the word without a 
        System.out.println("The word without a is " + newWord);

    }

}
