package Pattern;

import java.util.Scanner;

class Diamonds {
    private static String dia(int diamond){
        StringBuilder str = new StringBuilder();
		for(int i = 1; i < diamond; i += 2)
		{
			str.append(" ".repeat(Math.max(0, i)));
			for(int j = 1; j <= i; j += 2)
			{
				str.append("*");
			}
            str.append("\n");
		}
		for(int i = 1; i <= diamond; i += 2)
		{
			for(int j = 1; j <= i; j += 2)
			{
				str.append(" ");
			}
			str.append("*".repeat(Math.max(0, diamond - i + 1)));
            str.append("\n");
		}
        return str.toString();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the diamond size : ");
        System.out.print(dia(sc.nextInt()));
        sc.close();
    }
}
