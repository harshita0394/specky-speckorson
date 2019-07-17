package Runnable;

public class Tester {

	public static void main(String[] args) throws Exception{
		//OddThread o1 = new OddThread(10);
		//EvenThread e1 = new EvenThread(20);
		Thread t1 = new Thread(new OddThread(10),"Odd thread");
		Thread t2 = new Thread(new EvenThread(20,t1),"Even thread");
		t1.start();
		t2.start();
		Thread.sleep(10000);
		t1.join();
		t2.join();
		System.out.println("main over...");
		// TODO Auto-generated method stub

	}

}
