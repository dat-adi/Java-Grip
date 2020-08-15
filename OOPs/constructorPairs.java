package OOPs;

import java.util.Scanner;

public class constructorPairs {
	static class consPair{
		int pair1, pair2;
		consPair(){
			this.pair1 = 0;
			this.pair2 = 0;
		}
		consPair(int n){
			this.pair1 = n;
			this.pair2 = 0;
		}
		consPair(int a, int b){
			this.pair1 = a;
			this.pair2 = b;
		}
		String returnTwo(){
			return "(" + this.pair1 + "," + this.pair2 + ")";
		}
		void changeFirst(int in){
			this.pair1 = in;
		}
		
		void changeSecond(int in2){
			this.pair2 = in2;
		}
	}
	
	private static void minMax(int[] arr){
		int min = arr[0], max = arr[0];
		for (int value : arr) {
			if (value <= min) {
				min = value;
			}
			if (value > max) {
				max = value;
			}
		}
		consPair minMaxCheck = new consPair(min, max);
		System.out.println(minMaxCheck.returnTwo());
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		consPair noArgs = new consPair();
		System.out.println("1.\n");
		System.out.println("Enter value for single argument integer pair : ");
		consPair oneArgs = new consPair(sc.nextInt());
		System.out.println("Enter value for double argument integer pair : ");
		consPair allArgs = new consPair(sc.nextInt(), sc.nextInt());
		System.out.println("Values for no arguments integer pair : " + noArgs.returnTwo());
		System.out.println("Values for single argument integer pair : " + oneArgs.returnTwo());
		System.out.println("Values for double argument integer pair : " + allArgs.returnTwo());
		System.out.println("Change the first argument in the double integer pair : ");
		allArgs.changeFirst(sc.nextInt());
		System.out.println("Change the second argument in the double integer pair : ");
		allArgs.changeSecond(sc.nextInt());
		System.out.println("Values for double argument integer pair after modification : " + allArgs.returnTwo());
		System.out.println("\n2.\n");
		System.out.println("Enter the size of the integer array to be passed into minMax() : ");
		int[] arr = new int[sc.nextInt()];
		System.out.println("Enter the elements of the array : ");
		for(int i = 0; i < arr.length; i++){
			arr[i] = sc.nextInt();
		}
		minMax(arr);
	}
}
