class Main
{
    // Function to find the length of the longest common subsequence of
    // sequences `X[0…m-1]` and `Y[0…n-1]`
    public static int LCSLength(String X, String Y, int m, int n)
    {
        // return if the end of either sequence is reached
        if (m == 0 || n == 0) {
            return 0;
        }
 
        // if the last character of `X` and `Y` matches
        if (X.charAt(m - 1) == Y.charAt(n - 1)) {
            return LCSLength(X, Y, m - 1, n - 1) + 1;
        }
 
        // otherwise, if the last character of `X` and `Y` don't match
        return Integer.max(LCSLength(X, Y, m, n - 1),
                        LCSLength(X, Y, m - 1, n));
    }
 
    public static void main(String[] args)
    {
        String X = "ABCBDAB", Y = "BDCABA";
 
        System.out.println(LCSLength(X, Y, X.length(), Y.length()));
    }
}