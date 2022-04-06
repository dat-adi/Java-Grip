package Collections;

// Working with assertion requires you to run the file using java -ea filename
public class AssertDemo {
	static int val = 3;
	
	static int getnum(){
		return val--;
	}
	
	public static void main(String[] args) {
		int n;
		for(int i = 0; i < 10; i++){
			n = getnum();
			assert n > 0 : "N is not positive!";
			System.out.println("N is " + n);
		}
	}
}
