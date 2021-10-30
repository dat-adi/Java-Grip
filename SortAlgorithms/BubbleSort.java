package SortAlgorithms;

// Importing the module for the Scanner class
import java.util.Scanner;

class BubbleSort {

    // Initializing global scanner variable
    private static Scanner sc = new Scanner(System.in);

    // Method to Bubble Sort the array
    private static int[] sort_arr(int[] arr, int n){
        // Initializing variables
        int i, j, temp;

        // For loop to iterate through the array
        for(i = 0; i < n; i++){
            // For loop for variables before 'i'
            for(j = 0; j < i; j++){
                // Check if a number before the
                // number at i is larger than
                // the number present at i
                if(arr[j] > arr[i]){
                    // Swapping the numbers
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    // Method created to display the elements
    // of the array
    private static void display(int[] arr){
        for (int value : arr)
            System.out.print(value + " ");

        System.out.println();
    }

    public static void main(String[] args){
        // Taking the input of the size of the array
        System.out.println("Input the array size : ");
        int size = sc.nextInt();

        // Initializing an empty int array
        int[] arr = new int[size];

        // Taking inputs for the array
        System.out.println("Input the array : ");
        for(int i = 0; i < size; i++)
            arr[i] = sc.nextInt();

        // Displaying the old and new arrays
        System.out.println("The old array is : ");
        display(arr);

        System.out.println("The new sorted array is : ");
        display(sort_arr(arr, size));
    }
}
