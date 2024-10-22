/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cynthy.workofcynthy;

/**
 *
 * @author cynthia
 */
public class LargestElement {
    
    public static void main(String[] args) {

        int[] array = {34, 23, 12, 45, 67, 89, 234, 26, 10, 30, 43};

        int larg = array[0];

        for (int i = 1; i < array.length; i++) {
            
            if (array[i] > larg) {
                larg = array[i];
            }
        }

        // Printing the largest element
        System.out.println("The largest element in the array is: " + larg);
    }
}

