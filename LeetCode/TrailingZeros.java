package LeetCode;

class TrailingZeros{
  public static int zeros(int n) {
    int count = 0;
    for(int i = 5; n/i >= 1; i *= 5){
        count += n/i;
    }
    return count;
  }

  public static void main(String[] args){
    System.out.println(zeros(14));
  }
}
