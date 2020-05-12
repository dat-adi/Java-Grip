import java.util.*;

public class TheSanthoshPattern
{
	public static void main(String[] args)
	{
		int[][] A = new int[4][4];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 4; i++)
		{
			for(int j = 0; j < 4; j++)
			{	
				if(i == j)
				{
					A[i][j] = i;
				}
				else
				{
					A[i][j] = 0;
				}
			}
		}
		for(int i = 0; i < 4; i++)
		{
			for(int j = 0; j < 4; j++)
			{
				System.out.print(A[i][j]);
			}
			System.out.println();
		}
	}
}