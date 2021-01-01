package LeetCode;

import java.util.Scanner;

public class HumanReadableTime{
    private static String makeReadable(int seconds){
        int rem_seconds = seconds%60;
        int minutes = seconds/60;
        return minutes + ":" + rem_seconds;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(makeReadable(sc.nextInt()));
    }
}
