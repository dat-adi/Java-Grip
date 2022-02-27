/*
 *
 * This program explores the various methods provided by the String Buffer 
 * class.
 * The unique aspect of the String Buffer class is that it is thread-safe and 
 * cannot be accessed by multiple threads at once.
 *
 */

class StringBufferClassDemo {
    public static void main(String[] args){
        // Initializing a String Buffer object
        StringBuffer sb = new StringBuffer("Nice");
        System.out.println("Initial capacity: " + sb.capacity());

        // Appending a word to the String Buffer
        sb.append(" Doggo");
        System.out.println("Appended String: " + sb);

        // Inserting a word into the String Buffer
        sb.insert(4, " Good");
        System.out.println("Inserting into the String: " + sb);

        // Replacing a word in the string
        sb.replace(0, 4, "Extremely");
        System.out.println("Replacing a word of the String: " + sb);
        sb.append(" who breathes fire");
        System.out.println("Intermediate capacity: " + sb.capacity());

        // Deleting a word from the string based on the index
        sb.delete(0, 9);
        System.out.println("After deletion of a word in the String: " + sb);

        // Reversing the string
        sb.reverse();
        System.out.println("Reversing the string: " + sb);

        // Increasing the capacity
        sb.ensureCapacity(50);
        System.out.println("Final capacity: " + sb.capacity());
    }
}
