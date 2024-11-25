import java.util.Scanner;
public class Problem9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take input
        System.out.print("Enter an alphabet: ");
        char alphabet = sc.next().charAt(0);

        // Convert to lowercase to simplify checking
        alphabet = Character.toLowerCase(alphabet);

        if (alphabet >= 'a' && alphabet <= 'z') {
            if (alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u') {
                System.out.println(alphabet + " is a vowel.");
            } else {
                System.out.println(alphabet + " is a consonant.");
            }
        } else {
            System.out.println("Invalid input. Please enter a valid alphabet.");
        }

        sc.close();
    }
}
