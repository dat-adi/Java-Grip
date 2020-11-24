import java.util.Scanner;

public class HumanReadableTime{
    private static String makeReadable(int seconds){
        int rem_seconds = seconds%60;
        int minutes = seconds/60;
        String time = minutes + ":" + rem_seconds;
        return time;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(makeReadable(sc.nextInt()));
    }
}
