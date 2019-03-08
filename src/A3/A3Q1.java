/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A3;

/**
 *
 * @author isakm3897
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // start count at 1
        int count = 1;
        int sum = 0;
        while (count < 200) {
            sum = sum + count;
            count = count + 2;
        }System.out.println("The sum of the first 100 odd numbers is " + sum);
    }

}
