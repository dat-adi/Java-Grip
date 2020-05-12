package online_programs;

import java.util.*;

class formatOutput{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] s1 = new String[3];
        int[] x = new int[3];
        for(int i=0;i<3;i++)
            {
                s1[i]=sc.next();
                x[i]=sc.nextInt();
            }
        System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                System.out.printf("%-15s%03d\n", s1[i], x[i]); // for HackerRank, just put System.out.printf("%-15s%03d%n", s1, x);
                //"%-15s" formats the spaces between the two different outputs, and %03d formats the 0 padding.
            }
        System.out.println("================================");
        sc.close();
    }
}