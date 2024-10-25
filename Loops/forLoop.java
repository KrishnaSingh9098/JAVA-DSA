package Loops;

import java.util.Scanner;

public class forLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Loop to print 'n' n times
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }

        sc.close(); // Closing the scanner to prevent resource leak
    }
}



// for(initialisation,condition,updation){
//     work
// }

