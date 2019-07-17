package iter;

import java.util.ArrayList;
import java.util.Iterator;


public class Integer1 {
	public static void main(String[] args)
	{
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(100);
		al1.add(43);
		al1.add(988);
		al1.add(23);
		al1.add(41);
		Iterator<Integer> itr = al1.iterator();
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
