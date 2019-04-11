/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A4;

import java.util.Scanner;

/**
 * Moving the Last 2 Letters from the String to the Front of the Word
 *
 * @author isakm3897
 */
public class A4Q3 {

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

        //Gets all the letters until the last two letters  
        String start = word.substring(0, wordLength - 2);
        //Gets the last two letters
        String ending = word.substring(wordLength - 2, wordLength);

        //Outputs the last two letters of the word first and then the rest of the word 
        System.out.println("The word with the last two characters moved the front is " + ending + start);
    }

}
