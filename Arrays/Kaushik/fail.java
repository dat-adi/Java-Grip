import java.util.*;
public class fail
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=9;
        for(int i=1;i<=n;i++)
        {
            
            for(int j=1;j<=3;j++)
            {
                System.out.print(j);
            }
            System.out.println("");
            for(int k=1;k<=7;k+=3)
            {
                System.out.println(k);
            }
        }
    }
}