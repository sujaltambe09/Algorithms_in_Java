import java.util.Arrays;

class InsertionSort {

    public static void main(String[] args) {
        int[] arr = { 5, 4, 2, 3, 1 };
        Insertion(arr);

        System.out.println(Arrays.toString(arr));
    }

    static void Insertion(int[] arr) {
        // Loop i runs from 0 to arr.length-2 and j runs from i+1.
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j > 0; j--) {
                if(arr[j] < arr[j-1]) {
                    swap(arr,j,j-1);
                }
                else {
                    break;
                }
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}