public class EmployeeWageProblem
{
    public static final int PART_TIME = 0;
    public static final int FULL_TIME = 1;

    public static void main(String[] args) {
        // Step - 1 = Displaying the Hello Program
        System.out.println("Welcome to Employee Wage Computation");

        // Step - 2 = Checking Attendance
        boolean attend = checkAttendance();
        if (attend) System.out.println("Employee Present");
        else System.out.println("Employee Absent");
    }

    public static boolean checkAttendance() {
        int attendance = (int) (Math.random() * 100) % 2;

        // if type == 1 after random function calc then employee present
        return attendance == FULL_TIME;
    }

    public static int dailyWageCalculator() {
        int attendance = (int) (Math.random() * 100) % 2;

        // if type == 1 after random function calc then employee present
        return attendance == FULL_TIME;
    }
}
