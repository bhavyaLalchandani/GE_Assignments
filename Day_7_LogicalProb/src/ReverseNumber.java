public class ReverseNumber {
    public static void main(String[] args) {
        int num = 12345; // Example number
        System.out.println("Original Number: " + num);
        System.out.println("Reversed Number: " + reverse(num));
    }

    private static int reverse(int num) {
        int reversed = 0;
        while (num != 0) {
            int remainder = num % 10;
            reversed = reversed * 10 + remainder;
            num /= 10;
        }
        return reversed;
    }
}

