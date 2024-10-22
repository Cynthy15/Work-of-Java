/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cynthy.workofcynthy;

/**
 *
 * @author cynthia
 */
import java.util.Scanner;

public class NumbrCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Get input fron a user 
        System.out.println("Enter any number from your choice: ");
        int a = sc.nextInt();
        
        // Check if the number is positive, negative, or zero number
        if (a > 0) {
            System.out.println(a + " is  a positive number.");
        } else if (a < 0) {
            System.out.println(a + " is negative.");
        } else {
            System.out.println("The number is zero.");
        }
        
        // Close the scanner
        sc.close();
    }
}

