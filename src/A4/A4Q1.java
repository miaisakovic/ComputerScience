/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A4;

import java.util.Scanner;

/**
 * The First Two Letters of a Word
 *
 * @author isakm3897
 */
public class A4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a scanner for input
        Scanner input = new Scanner(System.in);

        //Asks user for a word
        System.out.println("Please enter a word");
        String word = input.nextLine();
        
        //Gets the first two letters 
        char letterOne = word.charAt(0);
        char letterTwo = word.charAt(1);
        
        //Outputs the first two letters of the word
        System.out.println("The first two letters are " + letterOne + letterTwo);
    }

}
