//With first traversal, larget number comes at the last position
// with second traversal, second largest number comes at the last second index
// with third traversal, third largest number comes at the last third index
// And so on......
// Also Known as, sinking sort or exchange sort !!!!

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,6,1,2,3,8,6,8,2};
        Bsort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void Bsort(int[] arr) {
        boolean swapped;
       for (int i = 0; i < arr.length; i++) {
            swapped= false;
            for(int j=1; j< arr.length - i; j++) {
                if(arr[j] < arr[j-1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) {
                break;
            }
       }
    }
}
