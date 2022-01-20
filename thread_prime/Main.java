package thread_prime;

public class Main {

	public static void main(String[] args) {
		int n=1500;
		LazyPrimeFactorization lp=new LazyPrimeFactorization(n,"Thread A");
		OptimizedPrimeFactorization op=new OptimizedPrimeFactorization(n,"B");
		lp.getMyThread().start();
		op.getMyThread().start();
	}

}
