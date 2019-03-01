/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A1;

import java.util.Scanner;

/**
 *Calculates the Area of a Circle
 * @author isakm3897
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
       // Create a scanner for input 
       Scanner input = new Scanner (System.in);
     
       // Ask the user for the radius of a circle in cm  
       System.out.println("Please enter the radius of a circle in cm.");
       double radius = input.nextDouble();
       
       //Solve for the area
       double radiusSquared = Math.pow(radius, 2); 
       double area = radiusSquared * Math.PI;
       
       //State the area 
       System.out.println("The area of this circle would be " + area + " cm squared");
    }
    
}
