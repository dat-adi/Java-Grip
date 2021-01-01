package MultiThreading;

public class ThreadEx1 {
	static class MyClient extends Thread{
		String uname;
		MyClient(String uname){
			this.uname = uname;
		}
		public void run(){
			System.out.println("Handling Gmail client : " + uname);
		}
	}
	public static void main(String[] args) {
		MyClient myClient1 = new MyClient("rama");
		MyClient myClient2 = new MyClient("ravana");
		MyClient myClient3 = new MyClient("sita");
		System.out.println("It is a Gmail server and it is listening to client requests...");
		myClient1.start();
		myClient2.start();
		myClient3.start();
	}
}
