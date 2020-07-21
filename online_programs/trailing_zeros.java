public class trailing_zero {
  public static int zeros(int n) {
    long fact = 1;
    for(int i = 1; i <= n; i++){
      fact = fact*i;
      System.out.println("fact : " + fact + ", i :" + i);
    }
    System.out.println("Factorial : " + fact);
    int count = 0;
    while(fact%10 == 0){
      count++;
      fact /= 10;
    }
    return count;
  }

  public static void main(String[] args){
    System.out.println(zeros(14));
  }
}
