package thread_simple;

public class NumberGenerator implements Runnable {
	private Thread myThread;
	private String nameThread;

	public NumberGenerator(String nameThread) {
		this.nameThread = nameThread;
		myThread = new Thread(this, nameThread);
	}

	public String getNameThread() {
		return nameThread;
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.print("\n" + this.getNameThread() + " Number: " + i + "\nHash code:"
						+ this.myThread.hashCode());
			}
			Thread.sleep(500);
		} catch (InterruptedException e) {
			System.out.println("Thread  interrupted.");
		}

	}

	public Thread getMyThread() {
		return myThread;
	}

}
