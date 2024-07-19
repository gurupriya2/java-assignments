package LAB5.learningmodule;

import LAB5.WrongInputException;

public class LearningModule {
    private AgeValidator agevalidator;

    public LearningModule() {
        this.agevalidator = new AgeValidator();
    }

    public String getLearningCode(String name, int age) throws WrongInputException {
        try {
            AgeValidator ageValidator = new AgeValidator();
            String ageCode = ageValidator.getAgeCode(age);
            return name + ageCode;
        } catch (InvalidAgeException e) {
            throw new WrongInputException("Invalid age input: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        LearningModule learningModule = new LearningModule();

        try {
            System.out.println(learningModule.getLearningCode("Alice : ", 20)); // Output: AliceAdult
            System.out.println(learningModule.getLearningCode("Bob : ", 15));   // Output: BobChild
            System.out.println(learningModule.getLearningCode("Charlie", -5)); // Throws WrongInputException
        } catch (WrongInputException e) {
            System.err.println(e.getMessage());
        }
    }
}

