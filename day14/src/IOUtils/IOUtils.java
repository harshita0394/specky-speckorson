package IOUtils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class IOUtils {
	public static Object readData(String name)
	{
		{
			try {ObjectInputStream in = new ObjectInputStream(new FileInputStream(name));
			return(in.readObject());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return null;
}
		
	}
	
	public static void writeData(Object hm,String name) {
		try {ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(name));
			out.writeObject(hm);
		}
		catch(Exception e)
		{
			e.printStackTrace();;
		}
	}
	
}
