/*
 *
 * An implementation of Dijsktra's Algorithm in the 
 * Java Programming Language
 *
 */
class Dijkstra{
    // Defining a method to implement the formula
    private static int[] dijsktra(int[][] g, int src){
        // Defining arrays for measuring distances between points
        // and a flag array for checking completion status
        int[] dist = new int[6];
        boolean[] flag = new boolean[6];

        // Defining the source vertex properties
        dist[src] = 0;
        flag[src] = true;

        // Setting max values for the remaining vertices
        for(int i = 1; i < 6; i++){
            dist[i] = Integer.MAX_VALUE;
        }

        // Iterating through all of the vertices.
        for(int i = 0; i < 6; i++){
            // Iterating through one vertex values to
            // the rest of the vertices.
            for(int j = 0; j < 6; j++){
                /*
                 * First, we check if the value of the vertex is 0,
                 * which is unreachable.
                 * Next, we check if the distance of the path is 
                 * lesser than the direct distance from the source.
                 */
                if(g[src][j] != 0 && (g[src][j] + dist[src]) < dist[j]){
                    // Assigning the value to the
                    // distance array
                    dist[j] = g[src][j] + dist[src];
                }
            }

            // Setting the source and flag vertices
            // to the minimum, and completed respectively.
            src = minOfArray(dist, flag);
            flag[src] = true;
        }

        return dist;
    }

    // Method defined to retrieve the minimum
    // index of an array
    private static int minOfArray(int[] arr, boolean[] flag){
        int min = Integer.MAX_VALUE;
        int minIndex = 0;

        // Checking for minimum and for vertices
        // not already visited.
        for(int i = 0; i < arr.length; i++){
            if(min > arr[i] && flag[i] == false){
                min = arr[i];
                minIndex = i;
            }
        }

        return minIndex;
    }

    public static void main(String[] args){
        // Defining the source and graph 
        int source = 0;
        int[][] Graph = {
            {0, 2, 4, 0, 0, 0},
            {0, 0, 1, 7, 0, 0},
            {0, 0, 0, 0, 3, 0},
            {0, 0, 0, 0, 0, 1},
            {0, 0, 0, 2, 0, 5},
            {0, 0, 0, 0, 0, 0},
        };

        // Calling the function to get the graph
        int[] tmpArr = dijsktra(Graph, source);

        // Printing the distances from
        // the source to the other vertices
        for(int i = 0; i < 6; i++){
            System.out.println(source + " -> " + i + " => " + tmpArr[i]);
        }
    }
}
