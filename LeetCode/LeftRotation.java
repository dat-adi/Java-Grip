package LeetCode;

import java.util.*;

class LeftRotation {

    private static void rotation(int[] arr, int rots){
        int size = arr.length - 1;
        int[] arr2 = new int[arr.length];
        for(int i = 0; i < rots; i++){
            arr2[size] = arr[0];
            System.arraycopy(arr, 1, arr2, 0, size);
            System.arraycopy(arr2, 0, arr, 0, size + 1);
        }
        System.out.println();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();
        System.out.println("Enter the rotations of the array : ");
        int rots = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        rotation(arr, rots);
        for (int value : arr) {
            System.out.print(value + " ");
        }
        sc.close();
    }
}