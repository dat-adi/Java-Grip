package Prime;

import java.util.*;

public class BetweenPrimes
{
	public static void main(String[] args)
	{
		int i, j, n, h, counter = 0;
		System.out.println("Primes upto?");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println("Here are the numbers :");
		for(i = 1; i <= n; i++)
		{
			counter = 0;
			for(j = 1; j <= i; j++)
			{
				if(i%j == 0)
				{
					counter = counter + 1;
				}
			}
			/*if(counter == 2)
			{
				System.out.println(i);
			}*/
			if(counter == 2)
			{
				if(i == 2)
				{
					System.out.println();
				}
				else
				{
					h = (i+(i+2))/2;
					System.out.println("For "+i+" and, "+(i+2)+" the in between number is : "+h);
				}
			}
		}
	}
}