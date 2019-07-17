package Thread;

public class MainThread {

	public static void main(String[] args) throws Exception {
		System.out.println(Thread.currentThread());
		Odd_thread t1 = new Odd_thread("Odd Thread",30);
		EvenThread t2 = new EvenThread("Even Thread",10,t1);
		Thread.sleep(1000);
		t1.join();
		t2.join();
		System.out.println("main over....");

	}

}
