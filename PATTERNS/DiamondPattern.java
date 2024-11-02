import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 5; // Starting value for the sequence

        // Upper half of the diamond
        for (int i = 0; i < n; i++) {
            // Print leading spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }
            // Print numbers
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print(count + " ");
                count += 2; // Increment by 2 for the sequence
            }
            // Move to the next line after each row
            System.out.println();
        }

        // Lower half of the diamond
        count -= 2 * n; // Adjust count to continue the sequence correctly
        for (int i = n - 1; i >= 1; i--) {
            // Print leading spaces
            for (int j = n; j > i; j--) {
                System.out.print("  ");
            }
            // Print numbers
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print(count + " ");
                count += 2; // Increment by 2 for the sequence
            }
            // Move to the next line after each row
            System.out.println();
        }

        sc.close();
    }
}
