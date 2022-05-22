class EthCode {
  public static int calculate(int[][] T, int i, int j) {
    if (i <= j) {
      return T[i][j];
    }

    return 0;
  }

  public static int findMaxCoins(int[] coin) {
    int n = coin.length;

    // base case: one pot left, only one choice possible
    if (n == 1) {
      return coin[0];
    }

    // if we are left with only two pots, choose one with maximum coins
    if (n == 2) {
      return Integer.max(coin[0], coin[1]);
    }

    // create a dynamic 2D matrix to store subproblem solutions
    int[][] T = new int[n][n];

    for (int iteration = 0; iteration < n; iteration++) {
      for (int i = 0, j = iteration; j < n; i++, j++) {
        int start = coin[i] + Integer.min(calculate(T, i + 2, j),
          calculate(T, i + 1, j - 1));

        int end = coin[j] + Integer.min(calculate(T, i + 1, j - 1),
          calculate(T, i, j - 2));

        T[i][j] = Integer.max(start, end);
      }
    }

    return T[0][n - 1];
  }

  public static void main(String[] args) {
    int[] coin = { 4, 6, 2, 3 };
    System.out.println(findMaxCoins(coin));
  }
}