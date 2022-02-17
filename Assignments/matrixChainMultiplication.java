/*
 * @name: G V Datta Adithya
 * @regno: 19BCE7119
 */
import java.util.Scanner;

class matrixChainMultiplication{
	// Matrix Ai has dimension p[i-1] x p[i] for i = 1..n
	static int chainOrder(int p[], int n)
	{
        // Defining an array to contain the 
        // multiplication values
		int m[][] = new int[n][n];

		int i, j, k, L, q;

		// cost is zero when multiplying one matrix.
		for (i = 1; i < n; i++)
			m[i][i] = 0;

		// L is chain length.
		for (L = 2; L < n; L++) {
			for (i = 1; i < n - L + 1; i++) {
				j = i + L - 1;
				if (j == n)
					continue;
				m[i][j] = Integer.MAX_VALUE;
				for (k = i; k <= j - 1; k++) {
					// q = cost/scalar multiplications
					q = m[i][k] + m[k + 1][j]
						+ p[i - 1] * p[k] * p[j];
					if (q < m[i][j])
						m[i][j] = q;
				}
			}
		}

		return m[1][n - 1];
	}

	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Taking inputs for the array
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements : ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
		int size = arr.length;

        // Displaying the number of multiplications
		System.out.println(
			"The number of minimum multiplications are "
			+ chainOrder(arr, size));
	}
}
