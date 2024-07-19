package LAB1;

public class Wordcount {

    // Method to count the number of words in a string
    public static int countWords(String inputString) {
        // Check if the input string is null or empty
        if (inputString == null || inputString.isEmpty()) {
            return 0;
        }

        // Split the string by one or more spaces to get an array of words
        String[] words = inputString.split("\\s+");
        int wordCount = 0;

        // Iterate through each word in the array
        for (String word : words) {
            // Check if the word contains any alphabetic characters
            if (word.matches(".*[a-zA-Z]+.*")) {
                wordCount++;
            }
        }

        // Return the count of words
        return wordCount;
    }

    // Main method to test the countWords method
    public static void main(String[] args) {
        String exampleString = "Sum of 12 and 20 is 32";
        System.out.println(countWords(exampleString));  // Output: 4
    }
}

