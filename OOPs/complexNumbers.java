package OOPs;

import java.util.Scanner;

public class complexNumbers {
	static class complexCalc{
		int a, b, c, d;
		complexCalc(int a, int b, int c, int d){
			this.a = a;
			this.b = b;
			this.c = c;
			this.d = d;
		}
		String add(){
			int firstArg = a + c;
			int secondArg = b + d;
			return "(" + firstArg + ", " + secondArg + "i)";
		}
		
		String subtract(){
			int firstArg = a - c;
			int secondArg = b - d;
			return "(" + firstArg + ", " + secondArg + "i)";
		}
		
		String multiply(){
			int firstArg = a*c - b*d;
			int secondArg = a*d + b*c;
			return "(" + firstArg + ", " + secondArg + "i)";
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the real value for the first complex number : ");
		int a = sc.nextInt();
		System.out.print("Enter the imaginary value for the first complex number : ");
		int b = sc.nextInt();
		System.out.print("Enter the real value for the second complex number : ");
		int c = sc.nextInt();
		System.out.print("Enter the imaginary value for the second complex number : ");
		int d = sc.nextInt();
		complexCalc A = new complexCalc(a, b, c, d);
		System.out.println("First Complex Number : " + "(" + a +", "+ b + ")");
		System.out.println("Second Complex Number : " + "(" + c +", "+ d + ")");
		System.out.println("Addition : " + A.add());
		System.out.println("Subtraction : " + A.subtract());
		System.out.println("Multiplication : " + A.multiply());
	}
}
