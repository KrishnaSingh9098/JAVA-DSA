package Loops;

import java.util.Scanner;

public class SumOfAllOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number :");
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) { // Check if 'i' is odd
                sum += i; // Add 'i' to sum if it's odd
            }
            
        }

        System.out.println(sum); // Print the total sum of odd numbers
        sc.close(); // Close the scanner to prevent resource leak
    }
}
