import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) { // Loop through rows
            for (int j = 0; j < n; j++) { // Loop through columns
                // Print the vertical part of K
                if (j == 0) {
                    System.out.print("* ");
                }
                // Print the diagonal part of K
                else if (i + j == n / 2 || i - j == n / 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Print space for alignment
                }
            }
            System.out.println(); // Move to the next line
        }
        sc.close(); // Close the scanner
    }
}
