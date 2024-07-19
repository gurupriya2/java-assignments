public class Calculator {
        int a = 5000000;
        int b = 298755;
        void add() {
            System.out.println("addition result =" + (a + b));
        }
        void sub(){
            System.out.println("subtraction result =" + (a - b));
        }
        void multiply(){
            System.out.println("multiplication result =" + (a * b));
        }
        void divide() {
            System.out.println("division result +" + (a / b));
        }
    public static void main(String[] args){
    Calculator operation=new Calculator();
        operation.add();
        operation.sub();
        operation.multiply();
        operation.divide();
    }
}
