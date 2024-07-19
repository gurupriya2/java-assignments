public class Multiplication{

        // Method using for loop
        public static void multiplicationTableFor(int num) {
            System.out.println("Multiplication table using for loop:");
            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " x " + i + " = " + (num * i));
            }
        }

        // Method using while loop
        public static void multiplicationTableWhile(int num) {
            System.out.println("Multiplication table using while loop:");
            int i = 1;
            while (i <= 10) {
                System.out.println(num + " x " + i + " = " + (num * i));
                i++;
            }
        }

        // Method using do-while loop
        public static void multiplicationTableDoWhile(int num) {
            System.out.println("Multiplication table using do-while loop:");
            int i = 1;
            do {
                System.out.println(num + " x " + i + " = " + (num * i));
                i++;
            } while (i <= 10);
        }

        public static void main(String[] args) {
            int number = 2; // Example input
            multiplicationTableFor(number);
            System.out.println(); // Separating outputs
            multiplicationTableWhile(number);
            System.out.println(); // Separating outputs
            multiplicationTableDoWhile(number);
        }
    }


