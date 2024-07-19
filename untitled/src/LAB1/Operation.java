package LAB1;

public class Operation {
        public static void main(String[] args) {
            int num1 = 50;
            int num2 = 30;
            Operation sum = new Operation();
            sum.add(num1, num2);
            sum.add(8,9,5);
            sum.add(56.3f, 67.0f);
            sum.add("hello ", 67);

        }

        public void add(int a, int b) {
            System.out.println("The sum of " + a + " and " + b + " is " + (a + b));
        }

        public void add(int a, int b, int c) {
            System.out.println("The sum of inputs is " +  (a + b +c));
        }
        public void add(float a, float b) {
            System.out.println("The sum of inputs is " +  (a + b));
        }
        public void add(String a, int b) {
            System.out.println("The sum of inputs is " +  (a + b));
        }
    }

