package OOPs;

public class constructorPairs {
	static class consPair{
		int pair1, pair2;
		consPair(){
			this.pair1 = 0;
			this.pair2 = 0;
		}
		consPair(int n){
			this.pair1 = n;
			this.pair2 = 0;
		}
		consPair(int a, int b){
			this.pair1 = a;
			this.pair2 = b;
		}
		
	}
	
	public static void main(String[] args) {
		consPair noArgs = new consPair();
		consPair oneArgs = new consPair(3);
		consPair allArgs = new consPair(4, 5);
	}
}
