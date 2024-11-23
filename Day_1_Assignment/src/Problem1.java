import java.util.Scanner;
public class Problem1 {
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);

         // Ask the user to input the times they want to flip the coin
         System.out.print("Enter the No. of times you want to flip the Coin : ");

         // input using the Scanner class
         int flipCount = sc.nextInt();

         //Initialize the necessary variables
         int headsCount = 0, tailsCount = 0;
         double headsPercentage, tailsPercentage;

         // Computing the Toss result for 'flipCount' times
         for (int i = 0; i < flipCount; i++) {
            double random = Math.random();
            if(random < 0.5){
                tailsCount++;
            } else {
                headsCount++;
            }
         }

         // Calculating each percentage using the heads and tail counts
         headsPercentage = headsCount / (double) flipCount * 100;
         tailsPercentage = tailsCount / (double) flipCount * 100;

         // Printing the result to the Screen
         System.out.println("Percentage of heads attained: " + headsPercentage + "%");
         System.out.println("Percentage of tails attained: " + tailsPercentage + "%");
     }
}
