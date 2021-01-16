package IOTester;

public class OverloadedThis {
	int a;
	int b;
	
	OverloadedThis(int i, int j){
		a = i;
		b = j;
	}
	
	OverloadedThis(int i){
		this(i, i);
	}
	
	OverloadedThis(){
		this(0);
	}
	
	public static void main(String[] args) {
		System.out.println("Working with Overloaded Constructors.");
		OverloadedThis ot;
		ot = new OverloadedThis(3, 4);
		System.out.println("Values are : " + ot.a + ", " +  ot.b);
		ot = new OverloadedThis(2);
		System.out.println("Values are : " + ot.a + ", " +  ot.b);
		ot = new OverloadedThis();
		System.out.println("Values are : " + ot.a + ", " +  ot.b);
	}
}
