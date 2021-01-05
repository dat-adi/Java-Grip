package Generics;

import java.util.Arrays;

public class LeastFrequent {
	public static <E> E lesfreq(E[] arr, int n){
		
		Arrays.sort(arr);
		
		int min_count = n+1;
		E res = null;
		int curr_count = 1;
		
		for (int i = 1; i < n; i++) {
			if (arr[i] == arr[i - 1])
				curr_count++;
			else {
				if (curr_count < min_count) {
					min_count = curr_count;
					res = arr[i - 1];
				}
				
				curr_count = 1;
			}
		}
		
		// If last element is least frequent
		if (curr_count < min_count)
		{
			res = arr[n - 1];
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		Integer[] intArr = {12, 32, 52, 56, 23, 12, 12, 42, 23, 32, 46, 56};
		Character[] charArr = {'h', 'e', 'l', 'l', 'o', 'v', 'i', 't', 'a', 'p'};
		
		System.out.println(lesfreq(intArr, intArr.length));
		System.out.println(lesfreq(charArr, charArr.length));
	}
}
