import java.util.*;

class hourglass{

    private static int makeathree(int[][] arr){
        int sum, highest = 0;
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                sum = 0;
                int k = i, l = j;
                sum = sum + arr[k+1][l+1];
                for(l = j; l < j+3; l++){
                    sum = sum + arr[k][l];
                }
                k = k+2;
                for(l = j; l < j+3; l++){
                    sum = sum + arr[k][l];
                }
                if(highest < sum){
                    highest = sum;
                }
            }
        }
        return highest;
    }

    public static void main(String[] args){
        final Scanner sc = new Scanner(System.in);
        final int[][] arr = new int[6][6];
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 6; j++){
                arr[i][j] = sc.nextInt(); // Taking input for the matrix
            }
        }
        System.out.println("Your array is : ");
        
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 6; j++){
                System.out.print(arr[i][j]); // Displaying the matrix
            }
            System.out.println();
        }

        System.out.println("The highest sum is : " + makeathree(arr));

        sc.close(); //Preventing Scanner Leakage
    }
}