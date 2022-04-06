// JAVA program to delete a node from AVL Tree
import java.io.*;
import java.util.*;

class maxSlidingWindow {

  static ArrayList<Integer> findKMaxElement(int[] arr, int k, int n) {
    // creating the max heap ,to get max element always
    PriorityQueue<Integer> queue = new PriorityQueue<>(
        Collections.reverseOrder());

    ArrayList<Integer> res = new ArrayList<>();
    int i = 0;

    for (; i < k; i++)
      queue.add(arr[i]);

    // adding the maximum element among first k elements
    res.add(queue.peek());

    // removing the first element of the array
    queue.remove(arr[0]);

    // iterarting for the next elements
    for (; i < n; i++) {

      // adding the new element in the window
      queue.add(arr[i]);

      // finding & adding the max element in the
      // current sliding window
      res.add(queue.peek());

      // finally removing the first element from front
      // end of queue
      queue.remove(arr[i - k + 1]);
    }

    return res;
  }

  // Driver Code
  public static void main(String[] args) {
    int arr[] = { 8, 5, 10, 7, 9, 4, 15, 12, 90, 13 };
    int k = 4, n = arr.length;

    List<Integer> res = findKMaxElement(arr, k, n);
    for (int x : res)
      System.out.print(x + " ");
  }
}
