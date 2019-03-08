/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A3;

import java.util.Scanner;

/**
 *
 * @author isakm3897
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a scanner for input
        Scanner input = new Scanner(System.in);

        //Asks user for the base integer and exponent 
        System.out.println("Please enter the base integer");
        int baseInteger = input.nextInt();
        System.out.println("Please enter the exponent");
        int exponent = input.nextInt();
        
        int total = 1;
        
        for (int i = 1; i <= exponent; i++){
            total = total*baseInteger;
        }
            System.out.println(baseInteger + "^" + exponent + " = " + total);
        
    }
    
}
