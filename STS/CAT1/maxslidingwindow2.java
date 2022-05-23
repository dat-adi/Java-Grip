class Solution {
  public static int[] maxSlidingWindow(int[] nums, int k) {
      if (nums == null || k < 0) return new int[0];
      int n = nums.length;
      int[] arr = new int[n - k + 1];
      Deque<Integer> que = new ArrayDeque<>();
      int j = 0;
      for (int i = 0; i < n; ++i) {
          // remove numbers from start if they are out of range
          while (!que.isEmpty() && que.peek() < i - k + 1)
              que.poll();
          // remove numbers from last if they are smaller than current no. bcz they are useless (just like me)
          while (!que.isEmpty() && nums[que.peekLast()] < nums[i])
              que.pollLast();
          // put current index in queue
          que.offer(i);
          if (i >= k - 1)
              arr[j++] = nums[que.peek()];
      }
      return arr;
  }

  public static void main(String args[]) {
    int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int k = 3;
    int op[] = maxSlidingWindow(arr, k);
    for (Integer i: op) {
      System.out.print(i + " ");
    }
  }

}