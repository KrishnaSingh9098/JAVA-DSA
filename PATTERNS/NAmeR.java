import java.util.Scanner;

public class NAmeR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height of R: ");
        int n = sc.nextInt(); // User input for height

        for (int i = 0; i < n; i++) { // Loop for rows
            for (int j = 0; j < n; j++) { // Loop for columns
                // Print the left vertical line of R
                if (j == 0) {
                    System.out.print("* ");
                }
                // Print the top horizontal line of R
                else if (i == 0 && j < n - 1) {
                    System.out.print("* ");
                }
                // Print the middle horizontal line of R
                else if (i == n / 2 && j < n - 1) {
                    System.out.print("* ");
                }
                // Print the diagonal part of R
                else if (i < n / 2 && j == n - 1 - i) {
                    System.out.print("* ");
                }
                // Print the bottom diagonal part of R
                else if (i > n / 2 && j == i - n / 2) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  "); // Print space for alignment
                }
            }
            System.out.println(); // Move to the next line after finishing a row
        }
        sc.close(); // Close the scanner
    }
}
