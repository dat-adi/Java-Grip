package SearchAlgorithms;

import java.util.Scanner;

class BinarySearch {
    private static int binSearch(int ele, int[] arr){
        int index=-1;
        int low = 0, high = arr.length-1, mid;
        while(high >= low){
            mid = (high + low)/2;
            if(ele < arr[mid]) high = mid-1;
            else if(ele > arr[mid]) low = mid+1;
            else{
                index = mid;
                break;
            }
        }
        return index;
    }
    public static void main(String[] args){
        final Scanner sc = new Scanner(System.in);
        //Taking the input for the size of the array
        System.out.println("Enter the number of elements in the array : ");
        final int size = sc.nextInt();
        
        //Taking input for the array elements.
        System.out.println("Enter the elements of the array : ");
        final int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        //Taking input for the element to search for.
        System.out.println("Enter the element you wish to search for.");
        final int element = sc.nextInt();

        //calling function to search for the element.
        int position = binSearch(element, arr);
        if(position == -1) System.out.println("Your element doesn't exist in the array.");
        else{
            System.out.println("The element exists at : " + position);
        }
        sc.close();
    }
}