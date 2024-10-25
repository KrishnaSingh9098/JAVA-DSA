package Conditionals;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter A: ");
        int a = sc.nextInt();
        
        System.out.print("Enter B: ");
        int b = sc.nextInt();
        
        System.out.print("Enter operator (+, -, *, /, %): ");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println("Result: " + (a + b));
                break;
            case '-':
                System.out.println("Result: " + (a - b));
                break;
            case '*':
                System.out.println("Result: " + (a * b));
                break;
            case '/':
                // Check for division by zero
                if (b != 0) {
                    System.out.println("Result: " + (a / (double) b));
                } else {
                    System.out.println("Error: Division by zero");
                }
                break;
            case '%':
                System.out.println("Result: " + (a % b));
                break;
            default:
                System.out.println("My Calculator is NOT so much advanced.");
                break;
        }

        // Close the scanner
        sc.close();
    }
}
