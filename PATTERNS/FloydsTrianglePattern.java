import java.util.Scanner; // Import the Scanner class for user input

public class FloydsTrianglePattern { // Define the public class named FloydsTrianglePattern
    public static void main(String[] args) { // Main method where the program execution begins
        Scanner sc = new Scanner(System.in); // Create a Scanner object to read input from the user
        int n = sc.nextInt();         // Read an integer input from the user and store it in variable n
        int count = 1;    // Initialize a variable count to 1, which will be used to print numbers

        // Outer loop to control the number of rows in the triangle
        for (int i = 0; i < n; i++) { 
            // Inner loop to print numbers in each row
            for (int j = 0; j <= i; j++) { 
                System.out.print(count + " "); // Print the current count followed by a space
                count++; // Increment count for the next number
            }
            System.out.println(); // Move to the next line after completing a row
        }
        
        sc.close(); // Close the Scanner object to free up resources
    }
}
