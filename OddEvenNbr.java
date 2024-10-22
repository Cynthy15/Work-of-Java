package cynthy.workofcynthy;
/*
@author cynthia
 */
import java.util.Scanner;

public class OddEvenNbr  {
    public static void main(String[] args) {
        Scanner a;
        a = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = a.nextInt();

        if (n % 2 == 0) {
            System.out.println(n + " is an even number.");
        } else {
            System.out.println(n + " is an odd number.");
        }
        
        a.close();
    }
}
