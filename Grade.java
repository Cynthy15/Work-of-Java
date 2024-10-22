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

public class Grade{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        System.out.print("Enter your grade (A, B, C, D, F): ");
        char grade = sc.next().charAt(0);
        
        // Printing message based on the grade 
        switch (grade) {
            case 'A' : System.out.println("Excellent");
            case 'B' : System.out.println("Well done");
            case 'C' : System.out.println("Good");
            case 'D' : System.out.println("pass");
            case 'F' : System.out.println("You failed.");
            default  : System.out.println("Invalid grade entered.");
        }
        
        sc.close();
    }
}
