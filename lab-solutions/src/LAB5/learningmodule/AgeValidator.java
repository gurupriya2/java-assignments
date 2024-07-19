package LAB5.learningmodule;

public class AgeValidator {
    public String getAgeCode(int age) throws  InvalidAgeException {
        if (age < 0) {
            throw new InvalidAgeException("Age cannot be negative");
        }
        if (age > 18) {
            return "Adult";
        } else {
            return "Child";
        }

    }
}
