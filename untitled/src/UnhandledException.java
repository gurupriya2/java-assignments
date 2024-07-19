public class UnhandledException {

    public static void main(String[] args) {
        System.out.println("Caller begin");
        called();
        System.out.println("Back to caller");
    }
    private static void called() {
        System.out.println("The Calculator App");
        int num1 = 0, num2 = 200;
        int result = 0;
        try {
            String testString=null;
            testString.toUpperCase();
            result = num2 / num1;
            System.out.println("Will this execute?");
        }
        catch (Throwable  throwable)
        {
             System.out.println("Exception" + throwable);
        }
        System.err.println(result);
        System.out.println("Shutting down calculator...");
    }
}
