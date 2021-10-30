import java.util.*;

class MS{
    private static void merge(int[] arr, int strt, int mid, int end){
        int numFirst = mid - strt + 1;
        int numSecond = end - mid;

        int[] left = new int[numFirst];
        int[] right = new int[numSecond];

        for(int i = 0; i < numFirst; i++)
            left[i] = arr[strt + i];
        for(int i = 0; i < numSecond; i++)
            right[i] = arr[mid + 1 + j];
    }

    private static void mergeSort(int[] arr, int strt, int end){
        if(strt < end){
            int mid = (strt + end)/2;
            mergeSort(arr, strt, mid);
            mergeSort(arr, mid + 1, end);

            merge(arr, strt, mid, end);
        }
    }

    private static void printArr(int[] arr){
        for(int i = 0; i < arr.length(); i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Here's the original array : ");
        printArr(arr);

        // Performing the merge sort operation on the array
        arr = mergeSort(arr, 0, arr.length() - 1);

        System.out.println("Here's the sorted array : ");
        printArr(arr);
    }
}
