import java.util.Scanner;
public class Problem2 {
    public  static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String yearStr;
        int year;

        System.out.println("Enter the year: ");
        yearStr = sc.next();
        if (yearStr.length() != 4){
            System.out.println("Enter a valid year (a 4 digit no.): ");
            return;
        } else {
            year = Integer.parseInt(yearStr);
            if (year % 400 == 0 && year % 100 == 0)
                System.out.println("Year " + year + " is a leap year");
            else if (year % 100 != 0 && year % 4 == 0)
                System.out.println("Year " + year + " is a leap year");
            else
                System.out.println("Year " + year + " is not a leap year");
        }
    }
}
