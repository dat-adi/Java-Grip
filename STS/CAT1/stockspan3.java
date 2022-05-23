class EthCode {

  static void calculateSpan(int A[],
    int n, int ans[]) {
    // Span value of first element is always 1
    ans[0] = 1;

    // Calculate span values for rest of the elements
    for (int i = 1; i < n; i++) {
      int counter = 1;
      while ((i - counter) >= 0 && A[i] >= A[i - counter]) {
        counter += ans[i - counter];
      }
      ans[i] = counter;
    }
  }

  static void printArray(int arr[], int n) {
    for (int i = 0; i < n; i++)
      System.out.print(arr[i] + " ");
  }

  public static void main(String[] args) {
    int price[] = { 10, 4, 5, 90, 120, 80 };
    int n = price.length;
    int S[] = new int[n];

    calculateSpan(price, n, S);

    printArray(S, n);
  }
}