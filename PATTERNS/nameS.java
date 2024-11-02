import java.util.Scanner;

public class nameS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Print '*' for specific rows and columns
                if ((i == 0 || i == 2 || i == 4) && (j >= 1 && j <= 5)) {
                    System.out.print("* ");
                } 
                else if( (i==1 && j==0)  && (i==3 && j==4)){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  "); // Print spaces for other positions
                }
            }
            // Print new line after each row
            System.out.println();
        }
        sc.close(); // Close the scanner
    }
}
