/*
 *
 * This is a program created to exhibit the various methods that a String
 * class consists of.
 *
 */

public class StringMethodsDemo {
    public static void main(String[] args) {
        // Initializing the strings for the operations
        String targetString = "A fed Doggo is a good Doggo.";
        String s1= "DOGGO";
        String s2= "Doggo";
        String s3 = "  The clan of the doggos  ";
        
        // Displaying the output of the operations of the String class
        System.out.println("Char at index 2(third position): " + targetString.charAt(2));
        System.out.println("After Concat: "+ targetString.concat(" Just like any other good doggo."));
        System.out.println("Checking equals ignoring case: " +s2.equalsIgnoreCase(s1));
        System.out.println("Checking equals with case: " +s2.equals(s1));
        System.out.println("Checking Length: "+ targetString.length());
        System.out.println("Replace function: "+ targetString.replace("fun", "easy"));
        System.out.println("SubString of targetString: "+ targetString.substring(8));
        System.out.println("SubString of targetString: "+ targetString.substring(8, 12));
        System.out.println("Converting to Lower case: "+ targetString.toLowerCase());
        System.out.println("Converting to Upper case: "+ targetString.toUpperCase());
        System.out.println("Trimming string: " + s3.trim());
        System.out.println("searching s1 in targetString: " + targetString.contains(s1));
        System.out.println("searching s2 in targetString: " + targetString.contains(s2));

        // Converting the String into a character array, and deriving properties from it
        char[] charArray = s2.toCharArray();
        System.out.println("Size of char array: " + charArray.length);
        System.out.println("Printing last element of array: " + charArray[3]);

    }

}
