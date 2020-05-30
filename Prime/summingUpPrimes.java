package Prime;

import java.util.*;

class summingUpPrimes
{
	public static void main(String[] args)
	{
		int n, i, k, sum = 0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Upper limit to find primes : ");
		n = sc.nextInt();
		for(k=2;k<=n;k++) {
			int flag = 0;
			for (i = 2; i < k; i++) {
				if (k % i == 0) {
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(k);
				sum = sum + k;
			}
		}
		System.out.println("Sum of all the primes : " + sum);
	}
}