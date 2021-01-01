package SortAlgorithms;

import java.util.Scanner;

class SelectionSort {
	private static Scanner sc = new Scanner(System.in);
	
	private static int[] selectSort(int[] arr){
		int min;
		int n = arr.length;
		for(int i = 0; i < n; i++){
			min = i;
			for(int j = i+1; j < n; j++){
				if(min > arr[j]){
					min = j;
				}
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
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
		display(selectSort(arr));
	}
}
