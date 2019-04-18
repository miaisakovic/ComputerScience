/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz2;

import java.util.Scanner;

/**
 * How Many Words Did the User Input Before Typing STOP?
 *
 * @author isakm3897
 */
public class T2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a scanner for input
        Scanner input = new Scanner(System.in);

        //Asks user for a word
        System.out.println("Please enter a word. Type STOP to stop the loop.");
        String word = input.nextLine();

        // Create variables to store the number of words inputed by the user
        int numberOfWords = 0;
        if (word.equals("STOP")) {
            System.out.println("You have entered 0 words before typing STOP");
        }

        // loop through until user inputs STOP
        while (!word.equals("STOP")) {
            System.out.println("Please enter a word. Type STOP to stop the loop.");
            word = input.nextLine();
            numberOfWords = numberOfWords + 1;

            //state the number of words the user has inputed before typing STOP
            if (word.equals("STOP")) {
                System.out.println("You have entered " + numberOfWords + " words before typing STOP.");
            }
        }

    }

}
