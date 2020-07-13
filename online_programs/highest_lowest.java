package online_programs;

public class highest_lowest{
  public static String highAndLow(String numbers) {
    int high = 0, low =99;
    String[] numArr = numbers.split(" ");
    int[] numberArr = new int[numArr.length];
    for(int i = 0; i < numArr.length; i++){
      numberArr[i] = Integer.parseInt(numArr[i]);
    }
    return highestCalc(numberArr) + " " + lowestCalc(numberArr);
  }
  
  private static int highestCalc(int[] arr){
    int highest = arr[0];
    for(int i = 0; i < arr.length; i++){
      if(arr[i]> highest){
        highest = arr[i];
      }
    }
    return highest;
  }
  private static int lowestCalc(int[] arr){
    int lowest = arr[0];
    for(int i = 0; i < arr.length; i++){
      if(arr[i] < lowest){
        lowest = arr[i];
      }
    }
    return lowest;
  }
}
