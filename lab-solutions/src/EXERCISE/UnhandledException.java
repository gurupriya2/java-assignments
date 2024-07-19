package EXERCISE;

public class UnhandledException {

    public static void main(String[] args) {
        System.out.println("Caller begin");
        called();
        System.out.println("Back to caller");
    }

    private static void called() {
        System.out.println("The EXERCISE.Calculator App");
        int num1 = 0, num2 = 200;
        int result = 0;

        try {
            // This will cause a NullPointerException
            String testString = null;
            testString.toUpperCase();

            // This will cause an ArithmeticException (divide by zero)
            result = num2 / num1;

            // This line will not execute due to the exception
            System.out.println("Will this execute?");
        } catch (Throwable throwable) {
            // This will catch any Throwable (including Exceptions)
            System.out.println("Exception: " + throwable);
        }

        // This line will always execute, whether an exception occurs or not
        System.err.println(result);
        System.out.println("Shutting down calculator...");
    }
}
