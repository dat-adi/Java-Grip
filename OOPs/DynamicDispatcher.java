package OOPs;

public class DynamicDispatcher{
	static class Reverse{
		
		int find(int num){
			int temp = num;
			int reversed = 0;
			while(temp!=0){
				int digit = temp%10;
				reversed = reversed*10 + digit;
				temp /= 10;
			}
			return reversed;
		}
	}
	
	static class ReverseR extends Reverse{
		int find(int num){
			if(num < 10){
				return num;
			}
			else{
				System.out.print(num%10);
				find(num/10);
			}
			return num;
		}
	}
	
	public static void main(String[] args) {
		Reverse a = new Reverse();
		ReverseR b = new ReverseR();
		System.out.println(a.find(234556));
		System.out.println(b.find(234556));
	}
}
