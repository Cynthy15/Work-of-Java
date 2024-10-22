/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cynthy.workofcynthy;

/**
 *
 * @author cynthia
 */
public class Reverse {
    public static void main(String[] args) {

        int[] ar = {3, 4, 6, 1, 9, 7, 5, 8};
        int n = 8;

        // This the array to hold the elements that have been reversed 
        int[] reverse = new int[8];

        //to reverse the array
        for (int i = 0; i < n; i++) {
            reverse[i] = ar[n - 1 - i];
        }

        // Print the reversed array
        System.out.println("Reversed array: ");
        for (int num : reverse) {
            System.out.print(num + "  ");
        }
    }
}
