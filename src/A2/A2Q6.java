/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A2;

import java.util.Scanner;

/**
 * Is Today a Holiday?
 *
 * @author isakm3897
 */
public class A2Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a scanner for input 
        Scanner input = new Scanner(System.in);

        // Ask the user the day of the week and if it is a holiday
        System.out.println("Please enter a number representing the day of the week (0=Sun, 1=Mon, 2=Tue, ...6=Sat)");
        int dayOfTheWeek = input.nextInt();
        System.out.println("Is today a holiday? (yes/no)");
        input.nextLine();
        String holiday = input.nextLine();

        // Program states when you should wake up
        if (dayOfTheWeek == 0 || dayOfTheWeek == 6) {
            System.out.println("You should wake up at 10:00");
        } else if (holiday.equalsIgnoreCase("yes")) {
            System.out.println("You should wake up at 10:00");
        } else {
            System.out.println("You should wake up at 7:00");
        }
    }

}
