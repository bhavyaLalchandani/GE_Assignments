import java.util.Scanner;
public class Problem5 {
    //Initialize the Variables
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number for Prime Factors Calculation");
        int n = sc.nextInt();

        System.out.println("The Prime Factors of " + n + " are:");

        int i = 2;
        while(n > 1){
            if(n % i == 0){
                System.out.print(i + " ");
                n = n/i;
            } else {
                i++;
            }
        }

    }

}
