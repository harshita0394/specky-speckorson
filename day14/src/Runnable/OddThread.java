package Runnable;

public class OddThread implements Runnable {
	private int range;
	public OddThread(int range) {
		this.range = range;
	}

	@Override
	public void run() {
		try {

			System.out.println("started"+"The Odd thread has started ");
				for(int i=1;i<=range;i=i+2)
				{
					System.out.println(i);
					Thread.sleep(1000);
				}
		}
		catch(Exception e)
		{
			System.out.println("err in " + Thread.currentThread().getName() + " " + e);
		}
		// TODO Auto-generated method stub

	}

}
