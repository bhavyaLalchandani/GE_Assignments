import java.util.Scanner;
public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Initializing the Variables
        int num, mul = 1;

        System.out.print("Enter a Value: ");
        // Input Value
        num = sc.nextInt();

        // Check Condition
        if (num > 31) {
            System.out.println("Value of number should be less than 31");
            return;
        }

        // Computation
        else {
            System.out.println(mul);
            for (int j = 1; j <= num; j++) {
                mul = mul * 2;
                System.out.println(mul);
            }
        }
    }
}
