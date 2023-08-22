import java.util.Scanner;

public class MonthDaysCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the name of the month (e.g., January, February, etc.): ");
        String monthName = scanner.nextLine().toLowerCase();
        
        int days = getDaysInMonth(monthName);
        
        if (days != -1) {
            System.out.println("Number of days in " + monthName + ": " + days);
        } else {
            System.out.println("Invalid month name entered.");
        }
        
        scanner.close();
    }
    
    public static int getDaysInMonth(String month) {
        switch (month) {
            case "january":
            case "march":
            case "may":
            case "july":
            case "august":
            case "october":
            case "december":
                return 31;
            case "april":
            case "june":
            case "september":
            case "november":
                return 30;
            case "february":
                return 28;
            default:
                return -1; // Invalid month name
        }
    }
}
