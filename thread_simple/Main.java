package thread_simple;

public class Main {

	public static void main(String[] args) {
		NumberGenerator numgen1=new NumberGenerator("Thread x");
		NumberGenerator numgen2=new NumberGenerator("Thread y");
		numgen2.getMyThread().setPriority(Thread.MAX_PRIORITY);
		numgen1.getMyThread().start();
		numgen1.getMyThread().setPriority(Thread.MIN_PRIORITY);
		numgen2.getMyThread().start();

	}

}
