public class Max {
   public static void main(String[] args) {
    int[] arr = {2 ,56,89,75,64};
    System.out.println(max(arr));
   } 

   static int max (int []arr){
    int maxArr =arr[0];
    for(int i=1;i<arr.length;i++){
        if(arr[i] > maxArr){
            maxArr = arr[i];
        }
    }
    return maxArr;
   }
}
