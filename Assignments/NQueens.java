/*
 * A problem on where to place the n queens on a nxn board, such that none of the queens
 * hit each other, row-wise, column-wise, or diagonal-wise.
 *
 */

import java.util.Scanner;
 
class NQueens {
  static int N = 4;

  /* ld is an array where its indices indicate row-col+N-1
     (N-1) is for shifting the difference to store negative
     indices */
  static int[] ld = new int[30];

  /* rd is an array where its indices indicate row+col
     and used to check whether a queen can be placed on
     right diagonal or not*/
  static int[] rd = new int[30];

  /*column array where its indices indicates column and
    used to check whether a queen can be placed in that
    row or not*/
  static int[] cl = new int[30];

  /* A utility function to print solution */
  static void printSolution(int board[][]) {
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++)
        System.out.printf(" %d ", board[i][j]);
      System.out.printf("\n");
    }
  }

  /* A recursive utility function to solve N
     Queen problem */
  static boolean solveNQUtil(int board[][], int col) {
    if (col >= N)
      return true;

    for (int i = 0; i < N; i++) {
      if ((ld[i - col + N - 1] != 1 &&
            rd[i + col] != 1) && cl[i] != 1)
      {
        // Place this queen in board[i][col]
        board[i][col] = 1;
        ld[i - col + N - 1] =
          rd[i + col] = cl[i] = 1;

        /* recur to place rest of the queens */
        if (solveNQUtil(board, col + 1))
          return true;

        board[i][col] = 0;
        ld[i - col + N - 1] =
          rd[i + col] = cl[i] = 0;
      }
    }

    /* If the queen cannot be placed in any row in
       this column col then return false */
    return false;
  }

  // Solving the N Queens problem
  static boolean solveNQ() {
    int board[][] = {{ 0, 0, 0, 0 },
      { 0, 0, 0, 0 },
      { 0, 0, 0, 0 },
      { 0, 0, 0, 0 }};

    if (solveNQUtil(board, 0) == false)
    {
      System.out.printf("Solution does not exist");
      return false;
    }

    printSolution(board);
    return true;
  }

  public static void main(String[] args)
  {
    solveNQ();
  }
}
