/*
 * Implementation of the 0/1 Knapsack Algorithm using Dynamic Programming
 *
 * @name: G V Datta Adithya
 * @regno: 19BCE7119
 *
*/

import java.util.Scanner;

// Creating the knapsack class
class knapsack{
    // Calling the dynamic knapsack function
    public static void knapsackDyn(int W[], int V[], int M, int n){
        // Declaring a table of values
        int B[][] = new int[n + 1][M + 1];
        
        // Initializing the table with zeroes
        for (int i=0; i<=n; i++){
            for (int j=0; j<=M; j++) {
                B[i][j] = 0;
            }
        }
        
        // Checks the conditions and 
        // allocates the value to the array
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= M; j++) {
                B[i][j] = B[i - 1][j];
                
                if ((j >= W[i-1]) && (B[i][j] < B[i - 1][j - W[i - 1]] + V[i - 1])) {
                    B[i][j] = B[i - 1][j - W[i - 1]] + V[i - 1]; 
                }
                
                System.out.print(B[i][j] + " ");
            }
            System.out.print("\n");
        }
        
        System.out.println("Max Value:\t" + B[n][M]);
        
        System.out.println("Selected Packs: ");
        
        // Displays the different packages
        while (n != 0) {
            if (B[n][M] != B[n - 1][M]) {
                System.out.println("\tPackage " + n + " with W = " + W[n - 1] + " and Value = " + V[n - 1]);
                
                M = M - W[n-1];
            }
            
            n--;
        }
    }

    public static void main(String[] args) {
        // Initializing a scanner object
        Scanner sc = new Scanner(System.in);
        
        // Taking the number of elements
        System.out.println("Enter the number of elements : ");
        int num = sc.nextInt();
        int[] W = new int[num];
        int[] V = new int[num];

        // Taking the weights and values
        for(int i = 0; i < num; i++){
            System.out.println("Enter the weight : ");
            W[i] = sc.nextInt();

            System.out.println("Enter the value : ");
            V[i] = sc.nextInt();
        }

        // Enter the max weight
        System.out.println("Enter the max weight : ");
        int M = sc.nextInt();
        int n = V.length;

        knapsackDyn(W, V, M, n);
    }
}

