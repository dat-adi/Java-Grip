package LeetCode;

import java.util.*;
import java.lang.Math;

class Series {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int sum = 0;
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int j = 0; j < n; j++){
                sum = (int)(sum + Math.pow(2, j)*b);
                int sum1 = sum + a;
                System.out.print(sum1 + " ");
            }
            System.out.println();
        }
        in.close();
    }
}