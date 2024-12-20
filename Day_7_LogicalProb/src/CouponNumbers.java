import java.util.HashSet;
import java.util.Random;

public class CouponNumbers {
    public static void main(String[] args) {
        int n = 5; // Number of distinct coupons
        int totalRandomNumbers = generateCoupons(n);
        System.out.println("Total random numbers generated: " + totalRandomNumbers);
    }

    private static int generateCoupons(int n) {
        HashSet<Integer> coupons = new HashSet<>();
        Random random = new Random();
        int count = 0;

        while (coupons.size() < n) {
            int coupon = random.nextInt(1000); // Generating random coupons in range [0, 999]
            coupons.add(coupon);
            count++;
        }

        System.out.println("Generated Coupons: " + coupons);
        return count;
    }
}
