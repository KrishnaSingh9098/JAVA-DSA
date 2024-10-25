package Conditionals;

import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible to vote because your age is " + age + ".");
        } else {
            System.out.println("You are not eligible to vote because your age is " + age + ".");
        }

        sc.close(); // Close the scanner to avoid resource leaks
    }
}
