/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A4;

import java.util.Scanner;

/**
 * Outputting the Letters Between the First and Last Letter
 *
 * @author isakm3897
 */
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a scanner for input
        Scanner input = new Scanner(System.in);

        //Asks user for a word
        System.out.println("Please enter a word");
        String word = input.nextLine();

        //Get the length of the word
        int wordLength = word.length();

        //Outputs the letters between the first and the last
        System.out.println(word.substring(1, wordLength - 1));
    }

}
