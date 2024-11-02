import java.util.Scanner;

public class AlphabetPatterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Get user input for the height of R, K, and I
        System.out.print("Enter the height for K, R, I, S (should be an odd number for best shape): ");
        int n = sc.nextInt();
        
        printK(n);
        System.out.println(); // New line between letters
        printR(n);
        System.out.println(); // New line between letters
        printI(n);
        System.out.println(); // New line between letters
        printS(n);
        printH(n);
        printN(n);
        printA(n);
        
        sc.close(); // Close the scanner
    }

    public static void printK(int n) {
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
    }

    public static void printR(int n) {
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
                } else {
                    System.out.print("  "); // Print space for alignment
                }
            }
            System.out.println(); // Move to the next line after finishing a row
        }
    }

    public static void printI(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Logic to print '*' in specific pattern
                if (j == n / 2) {
                    System.out.print("* ");
                } else if (i == 0 || i == n - 1) { // Print '*' in the first and last rows
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Print spaces elsewhere
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }

    public static void printS(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Print '*' for the letter 'S'
                if (i == 0 || i == n - 1) { // Top and bottom rows
                    System.out.print("* ");
                } else if (i == n / 2) { // Middle row
                    System.out.print("* ");
                } else if (j == 0 && i < n / 2) { // Left side for top part
                    System.out.print("* ");
                } else if (j == n - 1 && i > n / 2) { // Right side for bottom part
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Print spaces for other positions
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }

    public static void printH(int n) {
        for (int i = 0; i < n; i++) { // Loop through rows
            for (int j = 0; j < n; j++) { // Loop through columns
                if (j == 0 || j == n - 1 || i == n / 2) { // Left and right vertical bars and middle
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Print spaces for other positions
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }

    public static void printN(int n) {
        for (int i = 0; i < n; i++) { // Loop through rows
            for (int j = 0; j < n; j++) { // Loop through columns
                if (j == 0 || j == n - 1 || i == j) { // Left and right vertical bars and middle
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Print spaces for other positions
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }



    public static void printA(int n) {
        for (int i = 0; i < n; i++) { // Loop through rows
            for (int j = 0; j < n; j++) { // Loop through columns
                // Print the diagonal lines and middle horizontal line
                if (j == 0 || j == n - 1 || (i == n / 2 && j > 0 && j < n - 1) || (i + j == n - 1 && j < n / 2) || (i - j == 0 && j < n / 2)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Print spaces for other positions
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
    
    
    
}
