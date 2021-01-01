package LeetCode;

import java.util.*;
import java.lang.*;


class SplitStrings{
    public static String[] solution(String s) {
      String[] splits;
      int len = s.length();
      if(len%2 == 0){
        splits = new String[len/2];
        int splitno = len/2;
        for(int i = 0; i < splitno; i++){
          splits[i] = s.substring(i*2, i*2+2);
        }
      }
      else{
        splits = new String[(len+1)/2];
        int splitno = (len+1)/2;
        int i;
        for(i = 0; i < splitno-1; i++){
          splits[i] = s.substring(i*2, i*2+2);
        }
        splits[i] = s.charAt(len-1) + "_";
      }
      return splits;
    }

    public static void main(String[] args){
      String s = "abcdef";
      String s1 = "HelloWorl";
      System.out.println(Arrays.toString(solution(s)));
      System.out.println(Arrays.toString(solution(s1)));
    }
}
