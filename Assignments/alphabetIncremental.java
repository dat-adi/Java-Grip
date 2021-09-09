// Adding imports for the Scanner class
import java.util.*;

class alphabetIncremental {
    public static void main(String[] args){
        // Initializing the Scanner class
        Scanner sc = new Scanner(System.in);

        // Taking the input string from the user
        System.out.println("Enter the string to be evaluated : ");
        String inputString = sc.nextLine();

        char previousChar = inputString.charAt(0);
        String finalString = "" + inputString.charAt(0);

        // Iterating through the string and identification of duplicate characters
        for(int i = 1; i < inputString.length(); i++){
            char currentChar = inputString.charAt(i);

            // Checking the duplication of characters in the string
            if(currentChar == previousChar){
                int ascValue = currentChar;
                currentChar = (char)(ascValue + 1);
            }

            // Adding to the final output string
            finalString += currentChar;
            previousChar = currentChar;
        }

        // Output the final string
        System.out.println("Here is the final string : " + finalString);
    }
}
