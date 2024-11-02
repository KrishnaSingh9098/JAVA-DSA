import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            // Print leading spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }
            // Print stars
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("* ");
            }
            // Move to the next line after each row
            System.out.println();
        }
        sc.close();
    }

}
