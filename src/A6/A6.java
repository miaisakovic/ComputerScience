/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A6;

import java.util.Scanner;

/**
 * String Manipulation Hangman Game
 *
 * @author isakm3897
 */
public class A6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a scanner for input
        Scanner input = new Scanner(System.in);

        //Asks Player 1 for a word for Player 2 to guess
        System.out.println("Player 1: Enter a word in CAPITALS for Player 2 to guess:");
        String word = input.nextLine();
        //Replacing letters with hashes 
        String wordOne = word.replaceAll("[A-Z]", "-");
        System.out.println(wordOne);

        //Some blank lines to clear the screen 
        for (int i = 0; i < 20; i++) {
            System.out.println("");
        }

        //get the length of the word
        int wordLength = word.length();

        //Variable to store the amount of lives 
        int lives = 6;

        //Creating string to store the "progress" of Player 2's attempts to figure out the word
        String wordTwo = wordOne;

        //Loop through until player 2 runs out of lives or guesses the full word 
        for (int i = 0; i < wordLength + 10; i++) {
            System.out.println(wordTwo);
            System.out.println("Player 2: You have " + lives + " lives. Guess a CAPITAL letter:");
            String letter = input.nextLine();

            if (word.contains(letter)) {
                word = word.replace(letter, letter.toLowerCase());
                wordTwo = word.replaceAll("[A-Z]", "-");
                if (lives == 6) {
                    System.out.println("    +---+");
                    System.out.println("    |   |");
                    System.out.println("        |");
                    System.out.println("        |");
                    System.out.println("        |");
                    System.out.println("        |");
                    System.out.println("=========");
                } else if (lives == 5) {
                    System.out.println("    +---+");
                    System.out.println("    |   |");
                    System.out.println("    0   |");
                    System.out.println("        |");
                    System.out.println("        |");
                    System.out.println("        |");
                    System.out.println("=========");
                } else if (lives == 4) {
                    System.out.println("    +---+");
                    System.out.println("    |   |");
                    System.out.println("    0   |");
                    System.out.println("    |   |");
                    System.out.println("        |");
                    System.out.println("        |");
                    System.out.println("=========");
                } else if (lives == 3) {
                    System.out.println("    +---+");
                    System.out.println("    |   |");
                    System.out.println("    0   |");
                    System.out.println("   /|   |");
                    System.out.println("        |");
                    System.out.println("        |");
                    System.out.println("=========");
                } else if (lives == 2) {
                    System.out.println("    +---+");
                    System.out.println("    |   |");
                    System.out.println("    0   |");
                    System.out.println("   /|\\  |");
                    System.out.println("        |");
                    System.out.println("        |");
                    System.out.println("=========");
                } else if (lives == 1) {
                    System.out.println("    +---+");
                    System.out.println("    |   |");
                    System.out.println("    0   |");
                    System.out.println("   /|\\  |");
                    System.out.println("   /    |");
                    System.out.println("        |");
                    System.out.println("=========");
                }
            } else if (!word.contains(letter) && lives >= 1) {
                lives = lives - 1;
                if (lives == 5) {
                    System.out.println("    +---+");
                    System.out.println("    |   |");
                    System.out.println("    0   |");
                    System.out.println("        |");
                    System.out.println("        |");
                    System.out.println("        |");
                    System.out.println("=========");
                } else if (lives == 4) {
                    System.out.println("    +---+");
                    System.out.println("    |   |");
                    System.out.println("    0   |");
                    System.out.println("    |   |");
                    System.out.println("        |");
                    System.out.println("        |");
                    System.out.println("=========");
                } else if (lives == 3) {
                    System.out.println("    +---+");
                    System.out.println("    |   |");
                    System.out.println("    0   |");
                    System.out.println("   /|   |");
                    System.out.println("        |");
                    System.out.println("        |");
                    System.out.println("=========");
                } else if (lives == 2) {
                    System.out.println("    +---+");
                    System.out.println("    |   |");
                    System.out.println("    0   |");
                    System.out.println("   /|\\  |");
                    System.out.println("        |");
                    System.out.println("        |");
                    System.out.println("=========");
                } else if (lives == 1) {
                    System.out.println("    +---+");
                    System.out.println("    |   |");
                    System.out.println("    0   |");
                    System.out.println("   /|\\  |");
                    System.out.println("   /    |");
                    System.out.println("        |");
                    System.out.println("=========");
                }
            } else if (lives == 0) {
                System.out.println("You have run out of lives. This was the word: " + word);
                System.out.println("    +---+");
                System.out.println("    |   |");
                System.out.println("    0   |");
                System.out.println("   /|\\  |");
                System.out.println("   / \\  |");
                System.out.println("        |");
                System.out.println("=========");
                break;
            }

            if (!wordTwo.contains("-")) {
                System.out.println("CONGRADULATIONS!You won!");
                break;
            }

        }

    }

}
