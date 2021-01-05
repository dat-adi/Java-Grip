package Generics;

public class FirstGen {
	static class GenCheck<T>{
		T ob;
		GenCheck(T o){
			ob = o;
		}
		
		void showType(){
			System.out.println(ob.getClass().getTypeName());
		}
	}
	public static void main(String[] args) {
		GenCheck <String> genInt = new GenCheck<>("Big Brainer");
		genInt.showType();
	}
}
