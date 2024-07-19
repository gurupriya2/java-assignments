public class Finalclass {
    public void display() {
        System.out.println("This is a final class method.");
    }

    public class SubClass extends Finalclass { // This will cause a compilation error
        public void display() {
            System.out.println("This is a subclass method.");
        }
    }
}




