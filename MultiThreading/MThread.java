package MultiThreading;

public class MThread {
	static class TEx1 extends Thread {
		MThread mt;
		TEx1(MThread mt)
		{
			this.mt = mt;
		}
		public void run() {
			for(int i=0;i<10;i++) {
				mt.a[i]= i * i;
			}
		}
	}
	
	int[] a = new int[10];
	
	public static void main(String[] args) throws InterruptedException {
		MThread mt = new MThread();
		TEx1 t = new TEx1(mt);
		t.start();
		t.join();
		for(int i=0;i<10;i++) {
			System.out.print(mt.a[i] + " ");
		}
	}
}