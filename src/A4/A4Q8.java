/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A4;

import java.util.Scanner;

/**
 * Reverse String
 *
 * @author isakm3897
 */
public class A4Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a scanner for input
        Scanner input = new Scanner(System.in);

        //Asks user for a word
        System.out.println("Please enter a string");
        String word = input.nextLine();

        //Creates a new string to store the reversed word 
        String newWord = "";

        //Reverses the string 
        for (int i = word.length() - 1; i >= 0; i--) {
            newWord = newWord + word.charAt(i);
        }

        //Outputs the word backwards 
        System.out.println("This String backwards is" + newWord);
    }

}
