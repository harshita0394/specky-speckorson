package Runnable;

public class EvenThread implements Runnable {
	private int range;
	Thread o1;
	public EvenThread(int range,Thread o1)
	{
		this.range = range;
		this.o1=o1;
	}
	@Override
	public void run() {
		try {

			System.out.println("started"+"The Odd thread has started ");
				for(int i=0;i<=range;i=i+2)
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
