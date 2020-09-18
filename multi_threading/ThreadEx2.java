package multi_threading;

public class ThreadEx2 {
	static class MyThread extends Thread{
		String uname;
		MyThread(String uname){
			this.uname = uname;
		}
		public void run(){
			System.out.println("Here is the proof of process : " + uname);
		}
	}
	public static void main(String[] args) {
		MyThread t1 = new MyThread("big brain");
		MyThread t2 = new MyThread("smol brain");
		t1.start();
		t2.start();
		Thread t = Thread.currentThread();
		for(int i = 20; i < 30; i++){
			System.out.println(t.getName() + " " + i);
		}
	}
}
