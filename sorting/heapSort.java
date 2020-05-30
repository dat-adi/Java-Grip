package sorting;

import java.util.Scanner;

class heapSort {
	
	private static void sort(int[] arr){
		int n = arr.length;
		
		for(int i = n/2 - 1; i >= 0; i--){
			heapify(arr, n, i);
		}
		
		for(int i = n-1; i >= 0; i--){
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			
			heapify(arr, i, 0);
		}
	}
	
	private static void heapify(int[] arr, int n, int i){
		int largest = i;
		int left = 2*i + 1;
		int right = 2*i + 2;
		
		if(left < n && arr[left] > arr[largest])
			largest = left;
		if(right < n && arr[right] > arr[largest])
			largest = right;
		
		if(largest != i){
			int swap = arr[i];
			arr[i] = arr[largest];
			arr[largest] = swap;
			
			heapify(arr, n, largest);
		}
	}
	
	private static void display(int[] arr){
		for (int value : arr) {
			System.out.print(value + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the elements of the array : ");
		for(int i = 0; i < arr.length; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("The unsorted array is : ");
		
		for (int value : arr) {
			System.out.print(value + " ");
		}
		System.out.println();
		
		sort(arr);
		System.out.println("The sorted out array is : ");
		display(arr);
	}
}