package Lab2;
import java.util.*;

public class Welcome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String greet = sc.nextLine();
        greeting(greet);
    }

    public static void greeting(String name) {
        System.out.println("Hi " + name + ", Welcome to my home");
    }

}