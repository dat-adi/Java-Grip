package multi_threading;

public class ThreadEx4 {
	static class MyThread extends Thread{
		static Thread mt;
		public void run(){
			try{
				mt.join();
			}
			catch(InterruptedException ie) {
				ie.printStackTrace();
			}
			for (int i = 0; i < 10; i++){
				System.out.println("Child Thread");
			}
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		MyThread.mt = Thread.currentThread();
		MyThread t = new MyThread();
		t.start();
		t.interrupt();
		for (int i = 0; i < 10; i++){
			System.out.println("Main Thread");
			Thread.sleep(2000);
		}
	}
}
