class RepeatedString {

    /*
     * Complete the 'repeatedString' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. LONG_INTEGER n
     */

    public static long repeatedString(String s, long n) {
        // Initializing the variables
        long size = s.length(), repeated = n/size;

        // Number of characters left
        long left = n - (size * repeated);
        int extra = 0;

        // Number of characters in the repeated string
        int count = 0;
        for(int i = 0; i < size; i++){
            if(s.charAt(i) == 'a'){
                ++count;
            }
        }

        // Number of characters in the partially repeated string
        for(int i = 0; i < left; i++){
            if(s.charAt(i) == 'a'){
                ++extra;
            }
        }

        // Totalling the repeated and remaining strings
        repeated = (repeated * count) + extra;

        // Returning the number of a's
        return repeated;
    }

    public static void main(String[] args){
        long numA = repeatedString("aba", 10);
        System.out.println("The number of a's in the repeated string : " + numA);
    }
}