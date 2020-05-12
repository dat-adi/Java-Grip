package online_programs;

import java.util.*;

class leftRotation {

    private static int[] rotation(int[] arr, int rots){
        int size = arr.length - 1;
        int[] arr2 = new int[arr.length];
        for(int i = 0; i < rots; i++){
            arr2[size] = arr[0];
            for(int j = size; j >= 1; j--){
                arr2[j-1] = arr[j];
            }
            for(int j = 0; j <= size; j++){
                arr[j] = arr2[j];
            }
        }
        System.out.println();
        return arr;
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
        arr = rotation(arr, rots);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}