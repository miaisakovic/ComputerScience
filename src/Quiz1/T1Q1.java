package Quiz1;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * The Age of the Oldest Child When the Ages of a Family of 3 Children Forms an Arithmetic Sequence
 *
 * @author isakm3897
 */
public class T1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a scanner for input 
        Scanner input = new Scanner(System.in);

        //Asks for the ages of the youngest and middle child
        System.out.println("Please enter the age of the youngest child");
        int youngestChild = input.nextInt();
        System.out.println("Please enter the age of the middle child");
        int middleChild = input.nextInt();

        //Calculates the age of the oldest child
        int ageDifference = middleChild - youngestChild;
        int oldestChild = ageDifference + middleChild;

        //States the age of the oldest child
        System.out.println("The oldest child will be " + oldestChild + " years old");

    }

}
