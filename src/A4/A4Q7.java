/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A4;

import java.util.Scanner;

/**
 * Is the String Balanced?
 *
 * @author isakm3897
 */
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a scanner for input
        Scanner input = new Scanner(System.in);

        //Asks user for a word
        System.out.println("Please enter a string");
        String word = input.nextLine();
        //A variable that stores the same string as the variable "word" does 
        String yWord = word;

        //Variables to store the number of times x and y was in the string 
        int y = 0;
        int x = 0;

        //Finds the number of times y was in the word 
        while (yWord.contains("y")) {
            int yLetter = yWord.indexOf("y");
            y = y + 1;
            yWord = yWord.substring(yLetter + 1);
        }
        //Finds the number of times x was in the word
        while (word.contains("x")) {
            int xLetter = word.indexOf("x");
            x = x + 1;
            word = word.substring(xLetter + 1);
        }
        //Outputs that the string is balanced if x and y are in the string the same number of times 
        if (x == y) {
            System.out.println("This String is balanced");
        }
        //Outputs that the string is not balanced if x and y are in the string the same number of times
        if (x != y) {
            System.out.println("This String is not balanced");
        }

    }

}
