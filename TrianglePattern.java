/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cynthy.workofcynthy;

/**
 *
 * @author cynthia
 */
public class TrianglePattern {
    public static void main(String[] args) {
        int rows = 7;

        for (int i = 1; i <= rows; i++) {
           
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
           
            System.out.println();
        }
    }
}
