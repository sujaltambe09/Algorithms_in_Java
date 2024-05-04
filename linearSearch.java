public class linearSearch {
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            int target = 6;
            int result = search(arr, target);
            if (result == -1) {
                System.out.println("Target not found in the array.");
            } else {
                System.out.println("Target found at index: " + result);
            }
        }
    
        static int search(int[] arr, int target) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == target) {
                    return i;
                }
            }
            return -1; // Target not found
        }
    }
    
