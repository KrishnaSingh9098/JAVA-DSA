import java.util.Arrays;

public class SwapArrays {
    public static void main(String[] args) {
        int[] arr = {2 ,56,89,75,64};
        swap (arr, 56,75);
        System.out.println(Arrays.toString(arr));
    }
    public static void swap (int [] arr ,int index1, int index2){
        int temp = arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
