package Loops;

import java.util.Scanner;

public class Whileeloop {
    // Print numbers 1 to 500
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter The NUMBER TO START : ");
          int n = sc.nextInt();
          while(n<=50){
             System.out.println(n);
             n++;
          }
          sc.close();
    }
}
