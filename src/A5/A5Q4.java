/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A5;

import java.util.Scanner;

/**
 * Sorting the Array from Lowest to Highest Mark
 *
 * @author isakm3897
 */
public class A5Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a scanner for input
        Scanner input = new Scanner(System.in);

        //number of marks that will populate the array
        int numMarks = 10;

        //create array to store the value of the marks
        int[] mark = new int[numMarks];

        //use a for loop to go through each mark 
        for (int i = 0; i < numMarks; i++) {
            //get the value of each mark 
            System.out.println("Please enter a mark");
            mark[i] = input.nextInt();
        }

        //Some blank lines
        System.out.println("");
        System.out.println("");

        //Sort the marks from lowest to highest value
        for (int x = 0; x < mark.length; x++) {
            for (int y = x + 1; y < mark.length; y++) {
                if (mark[x] > mark[y]) {
                    int a = mark[y];
                    mark[y] = mark[x];
                    mark[x] = a;
                }
            }

        }
        //State the ten marks in ascending order
        System.out.println("These marks in ascending order are:");
        for (int i = 0; i < mark.length; i++) {
            int newMark = mark[i];
            System.out.println("- " + newMark);
        }
    }
}
