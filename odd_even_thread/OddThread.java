package odd_even_thread;

public class OddThread extends Thread {
	private Thread odd;
	
	public OddThread() {
		super();
	}

	public Thread getOdd() {
		return odd;
	}

	public void run() {
		for(int i=1;i<=10;i+=2) {
			System.out.println(i);
		}
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
