import java.util.Scanner;
public class Problem4 {
    public static void main(String[] args) {
        // Initialization
        double result = 0, num = 0, j;
        int n;
        Scanner sc = new Scanner(System.in);

        // Input the Data
        System.out.print("Enter N (Total numbers in the Harmonic Sequence): ");
        n = sc.nextInt();

        // Logic behind the Calculation
        for (j = 1; j <= n; j++) {
            num = num + (1 / j);
            result = num;
        }
        System.out.println("The value of Harmonic No. " + n + " is: " + result);

    }
}
