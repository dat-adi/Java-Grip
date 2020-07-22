import java.util.*;

class primes_in_numbers{
    private static String PrimeDecomp(int num){
        List<Integer> powers = new ArrayList<Integer>();
        List<Integer> numbers = new ArrayList<Integer>();
        int dup = num;
        int count;
        for(int i = 2; i < num/2; i++){
            count = 0;
            while(dup%i == 0){
                count++;
                dup /= i;
            }
            if(count != 0){
                numbers.add(i);
                powers.add(count);
            }
        }
        String str = "";
        for(int i = 0; i < numbers.size(); i++){
            if(powers.get(i) != 1)
                str += "(" + numbers.get(i) + "**" + powers.get(i) + ")";
            else
                str += "(" + numbers.get(i) + ")";
        }
        return str;
    }
    public static void main(String[] args){
        int num = 10224;
        System.out.println(PrimeDecomp(num));
    }
}
