package multi_threading;

public class ThreadEx3 {
	static class MyThread extends Thread{
		public void run(){
			for(int i = 0; i < 10; i++){
				System.out.println("Child Thread");
			}
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		MyThread t = new MyThread();
		t.start();
		t.join();
		for(int i = 0; i < 10; i++){
			System.out.println("Main Thread");
		}
	}
}

// Main Thread waits for Child Thread to finish.