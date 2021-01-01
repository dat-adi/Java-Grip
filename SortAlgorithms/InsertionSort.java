package SortAlgorithms;

import java.util.Scanner;

class InsertionSort {
	private static Scanner sc = new Scanner(System.in);
	
	private static int[] insertSort(int[] arr, int n){
		for(int i = 1; i < n; i++){
			int key = arr[i];
			int j = i-1;
			
			while( j >= 0 && arr[j] > key){
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
		return arr;
	}
	
	private static void display(int[] arr){
		for (int value : arr) System.out.print(value + " ");
		System.out.println();
	}
	
	public static void main(String[] args){
		System.out.println("Input the array size : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		System.out.println("Input the array : ");
		for(int i = 0; i < size; i++)arr[i] = sc.nextInt();
		System.out.println("The old array is : ");
		display(arr);
		System.out.println("The new sorted array is : ");
		display(insertSort(arr, size));
	}
}
