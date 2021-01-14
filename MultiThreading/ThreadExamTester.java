package MultiThreading;

import java.util.Scanner;

public class ThreadExamTester {
	
	private static int columnSum(int[][] arr, int n, int j){
		int sum = 0;
		System.out.print(j + ", ");
		for(int i = 0; i < n; i++){
			sum += arr[i][j];
		}
		return sum;
	}
	
	static class ColumnThread extends Thread{
		ThreadExamTester mt;
		ColumnThread(ThreadExamTester mt){
			this.mt = mt;
		}
		
		public void run() {
			int colsum = columnSum(mt.matrix2D, mt.n, mt.j);
			System.out.println("Thread " + mt.j + " : " + colsum);
			mt.matrixColSums[mt.k] = colsum;
			mt.k++;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	int n, j, k;
	int[][] matrix2D;
	int[] matrixColSums;
	
	public static void main(String[] args) throws InterruptedException {
		ThreadExamTester mt = new ThreadExamTester();
		Scanner sc = new Scanner(System.in);
		System.out.println("Creating a 2D matrix of NxN...");
		System.out.println("Enter the value of n");
		
		mt.n = sc.nextInt();
		System.out.println("Taking input for matrix...");
		
		mt.matrix2D = new int[mt.n][mt.n];
		for(int i = 0; i < mt.n; i++){
			for(int j = 0; j < mt.n; j++){
				System.out.println("Enter the number at position " + "(" + (i+1) + ", " + (j+1) + ") : ");
				mt.matrix2D[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Phase 1 : Individual column threads...");
		ColumnThread[] ct = new ColumnThread[mt.n];
		mt.matrixColSums = new int[mt.n];
		for(int i = 0; i < mt.n; i++){
			ct[i].start();
			ct[i].join();
			System.out.println(mt.matrixColSums[i] + " ");
		}
		
		System.out.println("Phase 2: Sum of column sums...");
		sc.close();
	}
}
