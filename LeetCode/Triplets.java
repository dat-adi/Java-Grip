package LeetCode;

import java.util.*;

class Triplets {
    private static int[] compare(int[] al, int[] bob){
        int[] score = {0, 0};
        for(int i = 0; i < 3; i++){
            if(al[i] > bob[i])score[0]++;
            else if (bob[i] > al[i])score[1]++;
        }
        return score;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[3];
        for(int i = 0; i < 3; i++)arr1[i] = sc.nextInt();
        int[] arr2 = new int[3];
        for(int i = 0; i < 3; i++)arr2[i] = sc.nextInt();
        int[] arr3 = compare(arr1, arr2);
        for(int i = 0; i < 2; i++)System.out.print(arr3[i] + " ");
        sc.close();
    }
}