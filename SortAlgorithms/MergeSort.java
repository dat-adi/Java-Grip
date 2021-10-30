package SortAlgorithms;

import java.util.Scanner;

class MergeSort  {
    private static void merge(int[] arr, int l, int m, int r){
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for(int i = 0; i < n1; i++) left[i] = arr[l + i];
        for(int j = 0; j < n2; j++)	right[j] = arr[m + 1 + j];

        int i = 0, j = 0, k = l;

        while(i < n1 && j < n2){
            if(left[i] <= right[j]){
                arr[k] = left[j];
                i++;
            }
            else{
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        while(i < n1){
            arr[k] = left[i];
            i++;
            k++;
        }
        while(j < n2){
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    private static void sort(int[] arr, int l, int r){
        if(l < r){
            int m = (l+r)/2;
            sort(arr, l, m);
            sort(arr, m+1, r);

            merge(arr, l, m, r);
        }
    }

    private static void printArr(int[] arr){
        for (int value : arr) {
            System.out.println(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Given array :");
        for(int i = 0; i < size; i++)System.out.print(arr[i] + " ");

        sort(arr, 0, arr.length-1);
        System.out.println("Sorted array : ");
        printArr(arr);

    }
}
