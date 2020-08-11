package OOPs;

import java.util.Scanner;

public class Phone_Use {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the properties for an Iphone : ");
		System.out.println("Width of the iphone : ");
		double width = sc.nextDouble();
		System.out.println("Height of the iphone  : ");
		double height = sc.nextDouble();
		sc.nextLine();
		System.out.println("OS of the iphone  : ");
		String OS = sc.nextLine();
		System.out.println("Brand of the iphone  : ");
		String brand = sc.nextLine();
		System.out.println("Price of the iphone  : ");
		String price = sc.nextLine();
		
		Phone testPhone = new Phone(width, height, OS, brand, price);
		System.out.println(testPhone.width);
		System.out.println(testPhone.height);
		System.out.println(testPhone.OS);
		System.out.println(testPhone.brand);
		System.out.println(testPhone.price);
		testPhone.call();
		testPhone.sendMessage();
		testPhone.browser();
		testPhone.share();
		sc.close();
	}
}
