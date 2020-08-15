package OOPs;

public class PhoneUse {
	static class Phone{
		String width, height,OS, brand, price;
		
		Phone(String width, String height, String OS, String brand, String price){
			this.width = width;
			this.height = height;
			this.OS = OS;
			this.brand = brand;
			this.price = price;
		}
		
		void call() {
			System.out.println("Calling...");
		}
		
		void sendMessage() {
			System.out.println("Sending Message...");
		}
		
		void browser(){
			System.out.println("Opening up the browser...");
		}
		
		void share() {
			System.out.println("Sharing object...");
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("Samsung Galaxy Phone : \n");
		
		Phone sgs4 = new Phone("6.98 cms", "13.6 cms", "Android", "Samsung", "1000 $");
		System.out.println(sgs4.width);
		System.out.println(sgs4.height);
		System.out.println(sgs4.OS);
		System.out.println(sgs4.brand);
		System.out.println(sgs4.price);
		sgs4.call();
		sgs4.sendMessage();
		sgs4.browser();
		sgs4.share();
		
		System.out.println("\nApple Iphone : \n");
		
		Phone Iphone = new Phone("5.86 cms", "12.3 cms", "IOS", "Apple", "1200 $");
		System.out.println(Iphone.width);
		System.out.println(Iphone.height);
		System.out.println(Iphone.OS);
		System.out.println(Iphone.brand);
		System.out.println(Iphone.price);
		Iphone.call();
		Iphone.sendMessage();
		Iphone.browser();
		Iphone.share();
	}
}
