package Conditionals;

import java.util.Scanner;

// public class FindLowerAndUpperCase {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter The Character:");
//         char ch = sc.next().charAt(0); // Get the first character of the input

//         if (ch >= 'a' && ch <= 'z') {
//             System.out.println("This Was The LowerCase Letter: " + ch);
//         } else if (ch >= 'A' && ch <= 'Z') {
//             System.out.println("This Was The UpperCase Letter: " + ch);
//         } else {
//             System.out.println("This is not a letter.");
//         }

//         sc.close(); // It's good practice to close the scanner
//     }
// }


public class FindLowerAndUpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Character:");
        char ch = sc.next().charAt(0); // Get the first character of the input

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("This Was The LowerCase Letter: " + ch);
        } else if (ch >= 65 && ch <= 90) {// Implicit Type ConverSion.
            System.out.println("This Was The UpperCase Letter: " + ch);
        } else {
            System.out.println("This is not a letter.");
        }

        sc.close(); // It's good practice to close the scanner
    }
}
