class HeapSort1 {
  private static void heapSort(int[] a, int n) {
    for(int i = n / 2 - 1; i >= 0; i--)
      heapify(a, n, i);

    for(int i = n - 1; i >= 0; i--) {
      int temp = a[0];
      a[0] = a[i];
      a[i] = temp;

      heapify(a, i, 0);
    }
  }

  private static void heapify(int[] a, int n, int i) {
    int largest = i;
    int left = 2 * i + 1;
    int right = 2 * i + 2;

    if(left < n && a[left] > a[largest])
      largest = left;
    if(right < n && a[right] > a[largest])
      largest = right;
    if(largest != i) {
      int temp = a[i];
      a[i] = a[largest];
      a[largest] = temp;

      printArr(a);
      heapify(a, n, largest);
    }
  }

  private static void printArr(int[] n) {
    for(int i: n){
      System.out.print(i + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int[] a = {-2, 6, 3, 10, 34};
    int n = a.length;
    printArr(a);
    heapSort(a, n);
    printArr(a);
  }
}
