/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A4;

import java.util.Scanner;

/**
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
        
        
        char letterTwo = word.charAt(1);
        
        int wordLength = word.length();
        
        // go through each letter
        for(int i = 0; i < wordLength; i++){
            // get letter at position i 
            char letter = word.charAt(i-1);
            String str = word.substring(1,i-1);
        }
        System.out.println(word.substring(1,i-1));
    }
    
}
