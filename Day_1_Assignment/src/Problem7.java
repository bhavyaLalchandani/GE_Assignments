import java.util.Scanner;
public class Problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two integers to Swap
        System.out.print("Enter the Number-1: ");
        int first = sc.nextInt();

        System.out.print("Enter the Number-2: ");
        int second = sc.nextInt();

        // Swap
        // Step 1 - store value of 1st num in a var
        int temp = first;
        // Step 2 - Assign val of 2nd num to 1st num
        first = second;
        // Step 3 - Assign val of 1st num to 2nd num using the stored val
        second = temp;

        System.out.print("The Numbers are Swapped\nThe Number-1 is: " + first + "\nThe Number-2 is: " + second);
    }
}
