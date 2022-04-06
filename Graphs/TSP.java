/**
 * An implementation of the traveling salesman problem in Java using dynamic programming
 *
 * @name: G V Datta Adithya
 * @regno: 19BCE7119
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TSP {

  private final int N, start;
  private final double[][] distance;
  private List<Integer> tour = new ArrayList<>();
  private double minTourCost = Double.POSITIVE_INFINITY;
  private boolean ranSolver = false;

  public TSP(double[][] distance) {
    this(0, distance);
  }

  public TSP(int start, double[][] distance) {
    N = distance.length;

    this.start = start;
    this.distance = distance;
  }

  // Returns the optimal tour for the traveling salesman problem.
  public List<Integer> getTour() {
    if (!ranSolver) solve();
    return tour;
  }

  // Returns the minimal tour cost.
  public double getTourCost() {
    if (!ranSolver) solve();
    return minTourCost;
  }

  // Solves the traveling salesman problem and caches solution.
  public void solve() {

    if (ranSolver) return;

    final int END_STATE = (1 << N) - 1;
    Double[][] memo = new Double[N][1 << N];

    // Add all outgoing edges from the starting node to memo table.
    for (int end = 0; end < N; end++) {
      if (end == start) continue;
      memo[end][(1 << start) | (1 << end)] = distance[start][end];
    }

    for (int r = 3; r <= N; r++) {
      for (int subset : combinations(r, N)) {
        if (notIn(start, subset)) continue;
        for (int next = 0; next < N; next++) {
          if (next == start || notIn(next, subset)) continue;
          int subsetWithoutNext = subset ^ (1 << next);
          double minDist = Double.POSITIVE_INFINITY;
          for (int end = 0; end < N; end++) {
            if (end == start || end == next || notIn(end, subset)) continue;
            double newDistance = memo[end][subsetWithoutNext] + distance[end][next];
            if (newDistance < minDist) {
              minDist = newDistance;
            }
          }
          memo[next][subset] = minDist;
        }
      }
    }

    // Connect tour back to starting node and minimize cost.
    for (int i = 0; i < N; i++) {
      if (i == start) continue;
      double tourCost = memo[i][END_STATE] + distance[i][start];
      if (tourCost < minTourCost) {
        minTourCost = tourCost;
      }
    }

    int lastIndex = start;
    int state = END_STATE;
    tour.add(start);

    // Reconstruct TSP path from memo table.
    for (int i = 1; i < N; i++) {

      int bestIndex = -1;
      double bestDist = Double.POSITIVE_INFINITY;
      for (int j = 0; j < N; j++) {
        if (j == start || notIn(j, state)) continue;
        double newDist = memo[j][state] + distance[j][lastIndex];
        if (newDist < bestDist) {
          bestIndex = j;
          bestDist = newDist;
        }
      }

      tour.add(bestIndex);
      state = state ^ (1 << bestIndex);
      lastIndex = bestIndex;
    }

    tour.add(start);
    Collections.reverse(tour);

    ranSolver = true;
  }

  private static boolean notIn(int elem, int subset) {
    return ((1 << elem) & subset) == 0;
  }

  // This method generates all bit sets of size n where r bits
  // are set to one. The result is returned as a list of integer masks.
  public static List<Integer> combinations(int r, int n) {
    List<Integer> subsets = new ArrayList<>();
    combinations(0, 0, r, n, subsets);
    return subsets;
  }

  // To find all the combinations of size r we need to recurse until we have
  // selected r elements (aka r = 0), otherwise if r != 0 then we still need to select
  // an element which is found after the position of our last selected element
  private static void combinations(int set, int at, int r, int n, List<Integer> subsets) {

    // Return early if there are more elements left to select than what is available.
    int elementsLeftToPick = n - at;
    if (elementsLeftToPick < r) return;

    // We selected 'r' elements so we found a valid subset!
    if (r == 0) {
      subsets.add(set);
    } else {
      for (int i = at; i < n; i++) {
        // Try including this element
        set ^= (1 << i);

        combinations(set, i + 1, r - 1, n, subsets);

        // Backtrack and try the instance where we did not include this element
        set ^= (1 << i);
      }
    }
  }

  public static void main(String[] args) {
    // Create adjacency matrix
    int n = 6;
    double[][] distanceMatrix = new double[n][n];
    for (double[] row : distanceMatrix) java.util.Arrays.fill(row, 10000);
    distanceMatrix[5][0] = 9;
    distanceMatrix[5][1] = 2;
    distanceMatrix[1][2] = 21;
    distanceMatrix[1][5] = 12;
    distanceMatrix[4][1] = 2;
    distanceMatrix[2][4] = 14;
    distanceMatrix[3][2] = 6;
    distanceMatrix[3][3] = 16;
    distanceMatrix[0][3] = 8;

    for(int i = 0; i < n; i++){
        for(int j = 0; j < n; j++){
            System.out.print(distanceMatrix[i][j] + " ");
        }
        System.out.println();
    }

    int startNode = 0;
    TSP solver =
        new TSP(startNode, distanceMatrix);

    System.out.println("Tour: " + solver.getTour());
    System.out.println("Tour cost: " + solver.getTourCost());
  }
}
