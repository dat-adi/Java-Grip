package SearchAlgorithms;

import java.util.Scanner;

//Successful searches -> elements present in the list.
//Unsuccessful searches => elements not present in the list.

class LinearSearch {
    private static boolean searchForElement(final int ele, final int[] arr){
        boolean result = false;
        for (int value : arr) {
            if (ele == value) {
                //if element found, change result to true.
                result = true;
                break;
            }
        }
        return result;
    }
    public static void main(final String[] args){
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
        if(searchForElement(element, arr))System.out.println("Element found");
        else{
            System.out.println("Your element is not found.");
        }
        sc.close();
    }
}