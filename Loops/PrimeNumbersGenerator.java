package Loops;

import java.util.Scanner;

public class PrimeNumbersGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the upper limit to find prime numbers: ");
        int n = sc.nextInt();

        System.out.println("Prime numbers up to " + n + " are:");

        for (int num = 2; num <= n; num++) {
            boolean isPrime = true;
            int i = 2;

            // Check if num is prime
            do {
                if (num % i == 0 && i != num) {
                    isPrime = false; // Found a divisor
                    break;
                }
                i++;
            } while (i <= Math.sqrt(num));

            if (isPrime) {
                System.out.println(num); // Print prime number
            }
        }

        sc.close(); // Close the scanner to prevent resource leak
    }
}
