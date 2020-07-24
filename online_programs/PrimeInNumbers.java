package online_programs;

import java.util.*;

class PrimeInNumbers {
    private static String PrimeDecomp(int num){
        List<Integer> powers = new ArrayList<>();
        List<Integer> numbers = new ArrayList<>();
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
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < numbers.size(); i++){
            if(powers.get(i) != 1)
                str.append("(").append(numbers.get(i)).append("**").append(powers.get(i)).append(")");
            else
                str.append("(").append(numbers.get(i)).append(")");
        }
        return str.toString();
    }
    public static void main(String[] args){
        int num = 10224;
        System.out.println(PrimeDecomp(num));
    }
}
