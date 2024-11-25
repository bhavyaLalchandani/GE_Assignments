import java.util.Scanner;
public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two integers
        System.out.print("Enter the dividend: ");
        int dividend = sc.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = sc.nextInt();

        // Compute quotient and remainder
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        // Display the results
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
        sc.close();
    }
}
