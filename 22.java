
import java.util.Scanner;

public class GradeThresholdChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter student's average grade: ");
        double average = input.nextDouble();

        System.out.print("Enter number of absences: ");
        int absences = input.nextInt();

        // A student passes with an average above 75 and at most
        // 3 absences, OR an average of at least 90 regardless of absences.
        boolean passes = (average > 75 && absences <= 3) || average >= 90;

        System.out.println("\n=== Grade Threshold Results ===");
        System.out.println("Average Grade: " + average);
        System.out.println("Absences: " + absences);

        if (passes) {
            System.out.println("Result: PASS");
            System.out.println("Reason: You met at least one of the passing conditions.");
        } else {
            System.out.println("Result: FAIL");
            System.out.println("Reason: Your average is not above 75 with at most 3 absences,");
            System.out.println("and your average is below 90.");
        }

        input.close();
    }
}
