/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cynthy.workofcynthy;

/**
 *
 * @author cynthia
 */
public class AverageArray {
    public static void main(String[] args) {
        // array initialization 
        int[] array = {10, 12, 34, 23, 56, 78};
        
        // Initialize the sum variable
        int sum = 0;

        // Calculate the sum of all elements in the array 
        for (int num : array) {
            sum += num;
        }

        // Calculate the average
        double aver = sum /6;

        // Print the average of the elements in the array
        
        System.out.println("The average of the array elements is: " + aver);
    }
}
