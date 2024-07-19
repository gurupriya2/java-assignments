package LAB5;

public class WrongInputException extends Exception {
    public WrongInputException(String message){
        super(message);
    }

    public static void main(String[] args) {
        int number=-1;
        try {
            if (number <= 0) {
                throw new WrongInputException(" Input must be positive");
            }
                System.out.println("Enter Number:" + number);
            }

        catch(Exception exception) {
            ;
            System.out.println("WrongInputException:" + exception.getMessage());
        }
        finally{
            System.out.println("wrong");
        }
    }
}
