public class palindrome {
    public static void main(String[] args) {
        int number = 12321;
        int reversedNumber = rev(number);
        System.out.println(ispal(number, reversedNumber));
    }

    static int rev(int n) {
        int reversed = 0;
        while (n != 0) {
            int rem = n % 10;
            reversed = reversed * 10 + rem;
            n = n / 10;
        }
        return reversed;
    }

    static boolean ispal(int original, int reversed) {
        return original == reversed;
    }
}
