
import java.util.*;
public class createArray {
    public static void main(String[] args) {
        int[] marks = new int[5];
        Scanner sc = new Scanner(System.in);
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();
      System.out.println("Marks of Physics are  : "+ marks[0] + "Marks of Maths are   : " + marks[1] + "Marks of Bio are  : " + marks[2]);
      marks[2] = 95;
      System.out.println(marks[2]);
      System.out.println(marks[2] % 2);
      System.out.println(marks.length);
    }
}
