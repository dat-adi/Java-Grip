import java.util.List;
class JumpingClouds {

    /*
     * Complete the 'jumpingOnClouds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY c as parameter.
     */

    public static int jumpingOnClouds(List<Integer> c) {
        // Initializing variables
        Integer[] clouds = new Integer[c.size()];
        int i = 0, jumps = 0;
        int n = c.size();

        // Converting the List Integer into an Array
        clouds = c.toArray(clouds);

        // Checking the conditions for the clouds
        if(clouds[i + 2] == 0){
            jumps++;
            i = i + 2;
        }
        // Returning the jumps
        return jumps;
    }

    public static void main(String[] args){
        // Executing the function with a simple I/O operation
        List<Integer> cloudList = new List<Integer>();
        cloudList.add(0);
        cloudList.add(1);
        cloudList.add(0);
        cloudList.add(0);
        cloudList.add(0);
        cloudList.add(1);
        cloudList.add(0);

        int numberOfJumps = jumpingOnClouds(cloudList);
        System.out.println("The minimum number of jumps : " + numberOfJumps);
    }
}