/*
 *
 * Finding the length of connected cells of 1s (regions) in a matrix of 0s and 1s.
 * Given a matrix, each of which may be 0 or 1. 
 * The filled cells that are connected form a region. 
 * Two cells are connected if they are adjacent to each other horizontally, vertically, or diagonally. 
 * There may be several regions in the matrix. 
 * How do you find the largest region (in terms of number of cells) in the matrix?
 *
 * @name: G V Datta Adithya
 * @regno: 19BCE7119
 *
 */
// Importing required modules
import java.util.Scanner;

// Instantiating the main class
class ConnectedCells{
    // Initializing global variables
    static int gRow, gCol, count;

    // Creating a function to check if an 
    // adjacent vertex exists in a path
    public static boolean checkPathExists(int[][] mat, int i, int j,
                          boolean[][] visited) {
        // Checking if the condition is satisfied
        if(i >= 0 && i < gRow && j >= 0 
                && j < gCol && mat[i][j] == 1 
                && visited[i][j] == false){
            // Returning true if pass
            return true;
        }
        return false;
    }

    public static void checkDepth(int[][] mat, int row, int col,
                    boolean[][] visited)
    {
        // Setting up adjacent vertex index values
        int[] rowValues = { -1, -1, -1, 0, 0, 1, 1, 1 };
        int[] colValues = { -1, 0, 1, -1, 1, -1, 0, 1 };
 
        // Changing state of a visited cell
        visited[row][col] = true;
 
        // Iterating through all neighbours
        for (int k = 0; k < 8; k++)
        {
            if (checkPathExists(mat, row + rowValues[k], col + colValues[k],
                       visited))
            {
                // increment region length by one
                count++;
                checkDepth(mat, row + rowValues[k], col + colValues[k],
                    visited);
            }
        }
    }

    // Calculating the max region
    public static int calculateMaxRegion(int[][] mat){
        // Initializing the result variable
        int res = 0;
        boolean[][] visited = new boolean[gRow][gCol];

        for (int i = 0; i < gRow; i++) {
            for (int j = 0; j < gCol; j++) {
                // Checking whether the conditions
                // are satisfied or not
                if (mat[i][j] == 1 && !visited[i][j]) {
                    count = 1;
                    checkDepth(mat, i, j, visited);
 
                    // Providing the highest depth 
                    // as the result
                    if (res < count){
                        res = count;
                    }
                }
            }
        }

        return res;
    }

    public static void main(String[] args){
        // Taking inputs
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the matrix : ");

        // Initializing the matrix
        gRow = sc.nextInt();
        gCol = gRow;

        int[][] mat = new int[gRow][gCol];
        
        // Taking elements for the matrix values
        for(int i = 0; i < gRow; i++){
            for(int j = 0; j < gCol; j++){
                System.out.print("Enter the element ( " + i + ", " + j + " ) : ");
                mat[i][j] = sc.nextInt();
            }
        }

        // Calculating and producing
        int max = calculateMaxRegion(mat);
        System.out.println("Largest region : " + max);
    }
}
