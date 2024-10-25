// package Conditionals;

// import java.util.Scanner;
// public class nP {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("ENter The Number : ");
//         int n = sc.nextInt();
//         if(n>=0){
//             System.out.println(n+ ":  THis Was The Positive Number");
//         }
//         else if(n<0){
//             System.out.println(n+ ":  This Was The Negative Number"); 
//         }
//     }
// }

// By Using Ternary Statement.

package Conditionals;

import java.util.Scanner;

public class nP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number: ");
        int n = sc.nextInt();
        
        // Using ternary operator
        String result = (n >= 0) ? (n + ": This Was The Positive Number") : (n + ": This Was The Negative Number");
        System.out.println(result);
        
        sc.close(); // It's good practice to close the scanner
    }
}
