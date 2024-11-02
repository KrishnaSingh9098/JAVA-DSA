import java.util.Scanner;

public class AlternateReverseTraimglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int county = 1;
            for(int j=0;j<n;j++){
                if(i+j >=3){
                    System.out.print(county + " ");
                    county++;
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
