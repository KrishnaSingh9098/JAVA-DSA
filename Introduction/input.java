import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the first number (a): ");
        int a = sc.nextInt();

        System.out.print("Enter the second number (b): ");
        int b = sc.nextInt();

        // Perform calculations
        System.out.println("Addition: " + (a + b));
        System.out.println("Difference: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / (double)b)); // Use double for accurate division
        System.out.println("Remainder: " + (a % b));
        
        // Additional examples
        System.out.println("5 divided by 2: " + (5 / 2));
        System.out.println("10 divided by 7: " + (10 / (double) 7)); // Correct type conversion

        // Close the scanner
        sc.close();
    }
}
