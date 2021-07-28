class Result {

    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(int steps, String path) {
        // Initializing variables
        int valleyCounter = 0, seaLevelMeter = 0;
        int beforeLevelChange;

        for(int i = 0; i < path.length(); i++){
            // Assigning the value of the previous sea level to a variable
            // for future comparision

            beforeLevelChange = seaLevelMeter;

            // Altering level value based on input
            if(path.charAt(i) == 'U')
                seaLevelMeter++;
            else
                seaLevelMeter--;

            // Checking if previous was a valley or a mountain
            if(seaLevelMeter == 0 && beforeLevelChange < 0)
                valleyCounter++;
        }

        // Returning the required value
        return valleyCounter;
    }

    public static void main(String[] args){
        // Executing the function with a simple I/O operation
        int numberOfValleys = countingValleys(8, "UDDDUDUU");
        System.out.println("Number of Valleys in the given string are : " + numberOfValleys);
    }
}