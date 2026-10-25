
public class PrecedencePuzzleSolver {
    public static void main(String[] args) {

        // EXPRESSION 1
        // Prediction: 14
        int result1 = 2 + 3 * 4;
        System.out.println("Expression 1: 2 + 3 * 4 = " + result1);
        // Correct: Multiplication has higher precedence than addition.

        // EXPRESSION 2
        // Prediction: true
        int a = 10;
        int b = 5;
        boolean result2 = a > b && a % 2 == 0;
        System.out.println("Expression 2: a > b && a % 2 == 0 = " + result2);
        // Correct: Arithmetic is evaluated first, then relational operators,
        // and finally the logical AND (&&).

        // EXPRESSION 3
        // Prediction: 7
        int x = 5;
        int result3 = x++ + 2;
        System.out.println("Expression 3: x++ + 2 = " + result3);
        System.out.println("Value of x after expression: " + x);
        // Correct: Postfix increment uses the original value (5) first,
        // then increments x to 6. Therefore, 5 + 2 = 7.

        // EXPRESSION 4
        // Prediction: 16
        int result4 = (2 + 2) * 3 + 4;
        System.out.println("Expression 4: (2 + 2) * 3 + 4 = " + result4);
        // Correct: Parentheses first, then multiplication, then addition.
    }
}
