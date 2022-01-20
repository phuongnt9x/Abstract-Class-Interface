package thread_prime;

public class LazyPrimeFactorization implements Runnable {
	int n;
	private Thread myThread;
	private String nameThread;

	public LazyPrimeFactorization(int n, String name) {
		super();
		this.n = n;
		this.nameThread = name;
		this.myThread = new Thread(this, nameThread);

	}

	@Override
	public void run() {
		for (int i = 2; i < n; i++) {
			if (is_prime(i))
				System.out.println(this.getNameThread() + ": " + i);
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}

	}

	public boolean is_prime(int n) {
		if (n < 2) {
			return false;
		} else if (n == 2) {
			return true;
		} else {
			for (int i = 2; i < n; i++) {
				if (n % i == 0) {
					return false;
				}
			}
		}
		return true;
	}

	public Thread getMyThread() {
		return myThread;
	}

	public String getNameThread() {
		return nameThread;
	}

}
