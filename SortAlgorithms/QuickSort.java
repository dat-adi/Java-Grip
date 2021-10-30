import java.util.Scanner;

class QuickSort {
	
	private static Scanner sc = new Scanner(System.in);
	
	private static int partition(int[] arr, int low, int high){
		int pivot = arr[high];
		int i = low-1;
		for(int j = low; j < high; j++){
			if(arr[j] <= pivot){
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		
		return i+1;
	}
	
	private static int[] sort(int[] arr, int low, int high){
		if(low < high){
			int pi = partition(arr, low, high);
			sort(arr, low, pi-1);
			sort(arr, pi+1, high);
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
		display(sort(arr, 0, size-1));
	}
}
