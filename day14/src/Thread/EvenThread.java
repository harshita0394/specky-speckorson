package Thread;

public class EvenThread extends Thread {
	private int range;
	private Odd_thread o1;
	public EvenThread(String name,int range,Odd_thread o1)
	{
		super(name);
		this.range=range;
		this.o1=o1;
		start();
	}
	public void run() {
		System.out.println("started"+"The Even thread has started ");
		try {
			for(int i=0;i<=range;i=i+2)
			{
				System.out.println(i);
				sleep(1000);
			}
			o1.join();
		}
		catch(Exception e)
		{
			System.out.println("err in " + getName() + " " + e);

		}
		
	}
	
}
