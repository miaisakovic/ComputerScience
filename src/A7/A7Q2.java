/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A7;

import java.util.Scanner;

/**
 * A Procedure-Type Method That Will Take an Exam Percentage as a Parameter and
 * Print out the Associated Letter Grade
 *
 * @author isakm3897
 */
public class A7Q2 {

    //Procedure-type method
    public static void examGrade(int examPercentage) {
        if (examPercentage <= 50 && examPercentage > 0) {
            System.out.println("Your exam grade is F");
        }
        if (examPercentage <= 59 && examPercentage >= 50) {
            System.out.println("Your exam grade is D");
        }
        if (examPercentage <= 69 && examPercentage >= 60) {
            System.out.println("Your exam grade is C");
        }
        if (examPercentage <= 79 && examPercentage >= 70) {
            System.out.println("Your exam grade is B");
        }
        if (examPercentage <= 100 && examPercentage >= 80) {
            System.out.println("Your exam grade is A");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a scanner for input
        Scanner input = new Scanner(System.in);

        //Ask the user for their exam percentage
        System.out.println("Please enter your exam percentage:");
        int examPercentage = input.nextInt();

        examGrade(examPercentage);

    }

}
