package tester;

import java.util.Scanner;

import dao.DBBankImplement;

public class tester{
	public static void main(String[] args) 
	{
	try(Scanner sc=new Scanner(System.in))
	{
		DBBankImplement dbbank = new DBBankImplement();
		boolean exit = false;
		while(!exit)
		{
			System.out.println("1:Display Emp details 10:Exit");
			switch(sc.nextInt())
			{
			case 1:
				dbbank.getBankAccount().forEach(System.out::println);
				break;
			case 10:
				break;
			}
			
		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}