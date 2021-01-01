package LeetCode;

class HighestLowest {
  public static String highAndLow(String numbers) {
    String[] numArr = numbers.split(" ");
    int[] numberArr = new int[numArr.length];
    for(int i = 0; i < numArr.length; i++){
      numberArr[i] = Integer.parseInt(numArr[i]);
    }
    return highestCalc(numberArr) + " " + lowestCalc(numberArr);
  }
  
  private static int highestCalc(int[] arr){
    int highest = arr[0];
    for (int value : arr) {
      if (value > highest) {
        highest = value;
      }
    }
    return highest;
  }
  private static int lowestCalc(int[] arr){
    int lowest = arr[0];
    for (int value : arr) {
      if (value < lowest) {
        lowest = value;
      }
    }
    return lowest;
  }
  public static void main(String[] args){
    String numArr = "2 4 1 7 3 5 9 8";
    System.out.println(highAndLow(numArr));
  }
}
