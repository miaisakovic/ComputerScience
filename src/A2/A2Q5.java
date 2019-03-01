/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A2;

import java.util.Scanner;

/**
 *
 * @author isakm3897
 */
public class A2Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a scanner for input
        Scanner input = new Scanner (System.in);
        
        //Asks user for 2 integers 
        System.out.println("Please enter the amount of teas:");
        int tea = input.nextInt();
        System.out.println("Please enter the amount of candies:");
        int candies = input.nextInt();
        
        //Program states if the party is great, good, or bad
        if (tea >= 5 && candies >= 5){
            System.out.println("That is a good tea party!");
        }else if (tea*2 >= candies || candies*2 >= tea){
            System.out.println("That is a great tea party!!!");
        }else {
            System.out.println("That is a bad tea party :(");
        }
    }
    
}
