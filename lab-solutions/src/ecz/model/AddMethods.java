package ecz.model;

public class AddMethods {
    public static void main(String[] args) {
        int num1 = 50;
        int num2 = 30;
        AddMethods sum = new AddMethods();
        System.out.println(sum.add(num1, num2));
        System.out.println(sum.add(8, 9, 5));
        System.out.println(sum.add(56.3f, 67.0f));
        System.out.println(sum.add("hello ", 67));
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public float add(float a, float b) {
        return a + b;
    }

    public String add(String a, int b) {
        return a + b;
    }
}
