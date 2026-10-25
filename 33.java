
public class CompoundGrowthIncrementTracker {
    public static void main(String[] args) {

        // 1. Compound assignment operators
        double balance = 1000.0;

        System.out.println("=== Compound Growth Tracker ===");
        System.out.println("Initial balance: " + balance);

        balance += 200;
        System.out.println("After adding 200 (+=): " + balance);

        balance *= 1.10;
        System.out.println("After 10% growth (*=): " + balance);

        balance += 50;
        System.out.println("After adding 50 (+=): " + balance);

        // 2. Postfix increment (count++)
        int count = 5;

        System.out.println("\n=== Postfix Increment ===");
        System.out.println("count++: " + count++);
        System.out.println("Count after count++: " + count);

        // count++ uses the current value first, then increments it.

        // 3. Prefix increment (++count)
        System.out.println("\n=== Prefix Increment ===");
        System.out.println("++count: " + (++count));
        System.out.println("Count after ++count: " + count);

        // ++count increments the value first, then uses the new value.
    }
}
