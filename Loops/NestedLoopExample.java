package Loops;

public class NestedLoopExample {
    public static void main(String[] args) {
        int maxNumber = 10; // Set the range for the multiplication table

        // Outer loop for the first number
        for (int i = 1; i <= maxNumber; i++) {
            // Inner loop for the second number
            for (int j = 1; j <= maxNumber; j++) {
                System.out.print(i * j + "\t"); // Print the product followed by a tab
            }
            System.out.println(); // Move to the next line after finishing one row
        }
    }
}
