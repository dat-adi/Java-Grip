import java.util.Scanner;

class zeroOneCounter {
    public static void main(String[] args){
        // Defining the scanner variable
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.println("Enter the array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int zeroCount = 0, oneCount = 0;

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        // Counting the number of ones and zeroes
        for(int i = 0; i < n; i++){
            if(arr[i] == 0){
                zeroCount++;
            } else {
                oneCount++;
            }
        }

        // Defining a new array
        int[] newArr = new int[n];
        int globalI = 0;

        // Creating the new array
        for(int i = 0; i < zeroCount; i++){
            newArr[globalI++] = 0;
        }
        for(int i = 0; i < oneCount; i++){
            newArr[globalI++] = 1;
        }

        // Displaying the new array
        for(int i = 0; i < n; i++){
            System.out.print(newArr[i] + " ");
        }
    }
}
