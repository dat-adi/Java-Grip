import java.util.*;

public class Start
{
	public static void main(String[] args)
	{
		int i, j, sw;
		int[] n = new int[10];
		int[][] a = new int[3][3];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the case you wish to execute :");
		System.out.println("1. A 1 Dimensional array.");
		System.out.println("2. A 2 Dimensional array.");
		System.out.println("3. Taking a string of characters and splitting them up.");
		sw = sc.nextInt();
		switch(sw)
		{
			case 1:
			{
				System.out.println("Enter the values of your array of integers :");
				for(i = 0; i<10; i++)
				{
					System.out.println();
					n[i] = sc.nextInt();
				}
				System.out.println("Hey, so, your numbers are :");
				for(i = 0; i<10; i++)
				{
					System.out.print(" "+ n[i] + " ");
				}
				break;
			}
			case 2:
			{
				System.out.println("Enter the elements of the array :");
				for(i = 0; i < 3; i++)
				{
					for(j = 0; j < 3; j++)
					{
						a[i][j] = sc.nextInt();
					}
				}
				System.out.println("The Matrix is :");
				for(i = 0; i < 3; i++)
				{
					for(j = 0; j < 3; j++)
					{
						System.out.print(a[i][j] + " ");
					}
					System.out.println();
				}
				break;
			}
			case 3:
			{
				String str;
        		System.out.println("Enter the String :");
				str = sc.nextLine();
				char[] charArray = str.toCharArray();
				int length = str.length();
				for(i = 0; i < length; i++)
				{
					System.out.print(charArray[i] + " ");
				}
				break;
			}
			default:
			{
				System.out.println("It's another day and you entered a case wrong, Try again?");
				break;
			}
		}
	}
}