import java.util.Scanner;

public class NameI {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt(); // User input for size of the pattern
       
       for (int i = 0; i < n; i++) {
           for (int j = 0; j < n; j++) {
               // Logic to print '*' in specific pattern
               if (j == 3) {
                   System.out.print("* ");
               } else if (i == 0 || i == n - 1) { // Print '*' in the first and last rows
                   System.out.print("* ");
               } else {
                   System.out.print("  "); // Print spaces elsewhere
               }
           }
           System.out.println(); // Move to the next line after each row
       }
       sc.close(); // Close scanner outside the loop
   } 
}
