import java.util.Scanner;
public class Problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking Input
        System.out.print("Enter first No: ");
        int first = sc.nextInt();
        System.out.print("Enter second No: ");
        int second = sc.nextInt();
        System.out.print("Enter third No: ");
        int third = sc.nextInt();
        int greatest;

        // Logic
        if (first > second && first > third) {
            greatest = first;
        } else if (second > first && second > third) {
            greatest = second;
        } else {
            greatest = third;
        }

        System.out.println("The greatest no. is: " + greatest);
    }
}
