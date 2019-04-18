/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A5;

import java.util.Scanner;

/**
 * Using an Array to Output Who is Above the Average Height of a Group of People
 * Who Entered a Room
 *
 * @author isakm3897
 */
public class A5Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a scanner for input
        Scanner input = new Scanner(System.in);

        //Asks user for how many people have entered 
        System.out.println("How many people have entered?");
        int numPeople = input.nextInt();
        //clear the input buffer
        input.nextLine();

        //Create array to store the height of these people
        double[] height = new double[numPeople];

        //create a variable to store the sum
        double sum = 0;

        //Use a for loop to go through each person's height
        for (int i = 0; i < numPeople; i++) {
            //get the height of each person
            System.out.println("Enter the height of a person in feet:");
            height[i] = input.nextDouble();
            //add it to the sum
            sum = sum + height[i];
        }

        //Some blank lines
        System.out.println("");
        System.out.println("");

        //Calaculates average height 
        double average = sum / numPeople;

        //Outputting all the heights of the people in this group that are above that group's average height ar
        System.out.println("The people in this group that are above the group's average height are:");
        for (int i = 0; i < height.length; i++) {
            //Outputs all the people who are above the average height
            if (height[i] > average) {
                double tallPeople = height[i];
                System.out.println("- " + tallPeople);
            }
        }

    }

}
