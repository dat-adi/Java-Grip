package OOPs;

class Phone{
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