package sorting;

import java.util.Scanner;

class BubbleSort {

	private static Scanner sc = new Scanner(System.in);
	
	private static int[] sort_arr(int[] arr, int n){
		int i, j, temp;
		for(i = 0; i < n; i++){
			for(j = 0; j < i; j++){
				if(arr[j] > arr[i]){
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
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
		display(sort_arr(arr, size));
	}
}
