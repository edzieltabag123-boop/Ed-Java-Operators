
import java.util.Scanner;

public class FourFunctionCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();

        System.out.println("\n=== Calculator Results ===");
        System.out.println("Addition (+): " + (num1 + num2));
        System.out.println("Subtraction (-): " + (num1 - num2));
        System.out.println("Multiplication (*): " + (num1 * num2));

        if (num2 != 0) {
            System.out.println("Division (/): " + (num1 / num2));
            System.out.println("Modulus (%): " + (num1 % num2));
        } else {
            System.out.println("Division (/): Cannot divide by zero.");
            System.out.println("Modulus (%): Cannot divide by zero.");
        }

        // Division with integers truncates the decimal part.
        // Modulus returns the remainder and can be negative
        // when one of the operands is negative.

        input.close();
    }
}
