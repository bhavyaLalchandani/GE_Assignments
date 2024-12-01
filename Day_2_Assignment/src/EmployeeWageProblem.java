public class EmployeeWageProblem
{
    public static final int PART_TIME = 0;
    public static final int FULL_TIME = 1;
    public static final int wagePerHr = 20;

    public static void main(String[] args) {
        // Step - 1 = Displaying the Hello Program
        System.out.println("Welcome to Employee Wage Computation");

        // Deciding Emp Type
        int empType = (int) (Math.random() * 100) % 2;;

        // Step - 2 = Checking Attendance
        boolean attend = checkAttendance(empType);
        if (attend) System.out.println("Employee Present");
        else System.out.println("Employee Absent");

        // Step - 3 = Calculating Daily Wage from Type
        System.out.println(dailyWageCalculator(empType, 20));
    }

    public static boolean checkAttendance(int empType) {
        // if type == 1 after random function calc then employee present
        return empType == FULL_TIME;
    }

    public static int dailyWageCalculator(int empType, int wagePerHr) {
        int workingTime = 0; // 0 hrs initially

        // if type == 1, full time then working Time = 8hrs
        if(empType == FULL_TIME) workingTime = 8;
        else System.out.println("Employee is Absent today so Wage = 0 Rs.");

        int wage = workingTime * wagePerHr;
        return wage;
    }
}
