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

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //inputing values 
        System.out.print("Enter any year you want to see if it is a leap year: ");
        
        int y = sc.nextInt();
        
        // Checking if the year is a leap year
        if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)) 
        {
            System.out.println(y + " is a leap year.");
        }
        else 
        {
            System.out.println(y + " is not a leap year.");
        }
      
        sc.close();
    }
}

