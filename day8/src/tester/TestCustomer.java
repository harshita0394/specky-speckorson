package tester;

import static com.core.utils.ValidationUtils.validateCustomer;
import static com.core.utils.ValidationUtils.validateLogin;
import static com.core.utils.ValidationUtils.validatePassword;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import com.core.core.Customer;

import cust_comp.CustomerRegAmountComparator;
import cust_excs.CustomerHandlingException;

public class TestCustomer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try{
			boolean exit=false;
			ArrayList<Customer> custList = new ArrayList<>();
			while(!exit)
			{
				try{
					System.out.println("Choose the following options");
					System.out.println("1:Register Customer 2:Display all Customer 3.Search by email 4.login 5.Change Password 6.Un subscribe customer 7.Display RegDate>30th June 8.Sort By Email 9.Sort By RegAmount 10.Sort ByDate Amount 20:Exit");
					switch(sc.nextInt())
					{
					case 1:
						System.out.println("Enter email,password,register amount,registration date");
						Customer c1 = validateCustomer(sc.next(),sc.next(),sc.nextDouble(),sc.next(),custList);
						custList.add(c1);
						System.out.println("Customer Registered Successfully"); 
						break;
					case 2:
						for(Customer c:custList)
						{
							System.out.println(c);
						}
						break;
					case 3:
						System.out.println("Enter the email address to be found");
						Customer c2=new Customer(sc.next());
						int index = custList.indexOf(c2);
						if(index==-1)
						{
							throw new CustomerHandlingException("email address invalid");
						}
						System.out.println(custList.get(index));
						break;
					case 4:
						System.out.println("Enter your email address");
						String email=sc.next();
						String password = sc.next();
						validateLogin(email,password,custList);
						System.out.println("Login Successful");
						break;
					case 5:
						System.out.println("Enter Email ID,old password,new password");
						email=sc.next();
						password=sc.next();
						String new_password=sc.next();
						validateLogin(email,password,custList);
						c2 = custList.get(custList.indexOf(new Customer(email)));
						validatePassword(new_password);
						c2.setPassword(new_password);
						System.out.println("PassWord change successful");
						break;
					case 6:
						System.out.println("Enter Email ID,old password,new password");
						email=sc.next();
						password=sc.next();
						validateLogin(email, password, custList);
						custList.remove(custList.contains(new Customer(email)));
						System.out.println("Customer Unsubscribed");
						break;
					case 7:
						for(Customer c3:custList)
						{
							if(c3.getReg_date().isAfter(LocalDate.of(LocalDate.now().getYear(), 06, 30)))
							{
								System.out.println(c3);
							}
						}
						break;
					case 8:
						Collections.sort(custList);
						break;
					case 9:
						Collections.sort(custList,new CustomerRegAmountComparator());
						break;
					case 10:
						Collections.sort(custList, new Comparator<Customer>()
						{
							@Override
							public int compare(Customer c1,Customer c2)
							{
								Double regamt = c1.getReg_amount();
								return regamt.compareTo(c2.getReg_amount());
							}
						}
						);
						break;
					case 20:
						exit=true;
						break;
					}
				}catch(Exception e)
				{
					System.out.println(e.getMessage());
				}
			}
			{
				
			}
		}finally
		{
			if(sc!=null)
			{
				sc.close();
			}
		}

	}

}
