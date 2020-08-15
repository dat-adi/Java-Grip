package OOPs;

public class boyGirl {
	static class Person{
		String hairColor, eyeColor, skinColor, height, weight;
		Person(String hc, String ec, String sc, String he, String we){
			this.hairColor = hc;
			this.eyeColor = ec;
			this.skinColor = sc;
			this.height = he;
			this.weight = we;
		}
		
		String read(){return "reading";}
		String play(){return "playing";}
		String sleep(){return "sleeping";}
		String walk(){return "walking";}
	}
	
	public static void main(String[] args) {
		System.out.println("\nBoy\n");
		Person boy = new Person("black", "black", "Fair", "5.10 inch", "65 kg");
		System.out.println("John has " + boy.hairColor + " hair, " + boy.eyeColor + " eyes, " +
			boy.skinColor + " skin " + boy.height + " tall  and weighs " + boy.weight);
		System.out.printf("John might be %s, %s, %s, %s.%n", boy.read(), boy.play(), boy.sleep(), boy.walk());
		
		System.out.println("\nGirl\n");
		Person girl = new Person("brown", "brown", "milky white", "5.4 inch", "50 kg");
		System.out.println("Emily has " + girl.hairColor + " hair, " + girl.eyeColor + " eyes, " +
			girl.skinColor + " skin " + girl.height + " tall  and weighs " + girl.weight);
		System.out.printf("Emily might be %s, %s, %s, %s.%n", girl.read(), girl.play(), girl.sleep(), girl.walk());
	}
}
