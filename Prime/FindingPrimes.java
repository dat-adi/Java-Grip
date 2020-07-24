package Prime;

import java.util.*;

class FindingPrimes
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Upper limit to find primes : ");
		int size = sc.nextInt();
		int i,n;
		String str = "";
		for(i = 0; i <= size; i++) {
			int counter = 0;
			for(n=i;n>=1;n--) {
				if(i%n == 0) {
					counter = counter + 1;
				}
			}
			if(counter == 2) {
				str = str + i + " ";
			}
		}
		System.out.println(str);
		sc.close();
	}
}
