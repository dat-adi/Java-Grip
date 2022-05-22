class EthCode
{
    // Returns true if there exists a subsequence of `A[0…n]` with the given sum
    public static boolean subsetSum(int[] A, int n, int k)
    {
        // return true if the sum becomes 0 (subset found)
        if (k == 0) {
            return true;
        }
 
        // base case: no items left, or sum becomes negative
        if (n < 0 || k < 0) {
            return false;
        }
 
        // Case 1. Include the current item `A[n]` in the subset and recur
        // for the remaining items `n-1` with the remaining total `k-A[n]`
        boolean include = subsetSum(A, n - 1, k - A[n]);
 
        // Case 2. Exclude the current item `A[n]` from the subset and recur for
        // the remaining items `n-1`
        boolean exclude = subsetSum(A, n - 1, k);
 
        // return true if we can get subset by including or excluding the
        // current item
        return include || exclude;
    }
 
    // Subset Sum Problem
    public static void main(String[] args)
    {
        // Input: a set of items and a sum
        int[] A = { 7, 3, 2, 5, 8 };
        int k = 14;
 
        if (subsetSum(A, A.length - 1, k)) {
            System.out.print(true);
        }
        else {
            System.out.print(false);
        }
    }
}