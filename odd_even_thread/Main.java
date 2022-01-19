package odd_even_thread;

public class Main {

	public static void main(String[] args) {
		OddThread oddThread=new OddThread();
		EvenThread evenThread=new EvenThread();
		oddThread.start();
		try {
			oddThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		evenThread.start();

	}

}
