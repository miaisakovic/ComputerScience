/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A4;

import java.util.Scanner;

/**
 * Outputting the Number of Times "Code" was in the Word
 *
 * @author isakm3897
 */
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a scanner for input
        Scanner input = new Scanner(System.in);

        //Asks user for a word
        System.out.println("Please enter a word");
        String word = input.nextLine();

        //Create variables to store the number of words inputed by the user
        int numberOfWords = 0;

        //Loop through to get the number of times "code" was in the word
        while (word.contains("code")) {
            int code = word.indexOf("code");
            numberOfWords = numberOfWords + 1;
            word = word.substring(code + 4);
        }
        //Outputs the number of times "code" was in the word 
        System.out.println("The String contains " + numberOfWords);
    }

}
