package Thread;

public class Odd_thread extends Thread {
	private int range;
	public Odd_thread(String name,int range)
	{
		super(name);
		this.range=range;
		start();
	}
	
	@Override
	public void run()
	{
		System.out.println("started"+"The Odd thread has started ");
		try {
			for(int i=1;i<=range;i=i+2)
			{
				System.out.println(i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println("err in " + getName() + " " + e);

		}


}
}
