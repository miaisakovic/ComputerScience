/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz1;

import java.util.Scanner;

/**
 * Alien Species
 *
 * @author isakm3897
 */
public class T1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a scanner for input 
        Scanner input = new Scanner(System.in);

        //Asks for the number of antennas and eyes the alien has
        System.out.println("How many antennas?");
        int antennas = input.nextInt();
        System.out.println("How many eyes?");
        int eyes = input.nextInt();

        //States what species of alien it is
        if (antennas >= 3 && eyes <= 4) {
            System.out.println("TroyMartin");
        }
        if (antennas <= 6 && eyes >= 2) {
            System.out.println("VladSaturnian");
        }
        if (antennas <= 2 && eyes <= 3) {
            System.out.println("GraemeMercurian");
        }

        if (antennas < 3 && eyes > 4) {
            System.out.println("None found");
        } else if (antennas > 6 && eyes < 2) {
            System.out.println("None found");
        } else if (antennas > 2 && eyes > 3) {
            System.out.println("None found");
        }
    }

}
