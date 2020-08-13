package OOPs;

public class Phone_Use {
	public static void main(String[] args) {
		
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
