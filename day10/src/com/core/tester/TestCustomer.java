package com.core.tester;

import static com.core.utils.MapUtils.populateData;
import static com.core.utils.ValidationUtils.validateCustomer;
import static com.core.utils.ValidationUtils.validateLogin;
import static com.core.utils.ValidationUtils.validatePassword;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

import com.app.core.Customer;

import cust_excs.CustomerHandlingException;
public class TestCustomer {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		try{
			boolean exit=false;
			HashMap<String,Customer> custMap = populateData();
			while(!exit)
			{
				try{
					System.out.println("Choose the following options");
					System.out.println("1:Register Customer 2:Display all Customer 3.Search by email 4.login 5.Change Password 6.Un subscribe customer 7.Sort By Email 8.Sort By RegAmount 10.Sort ByDate Amount 20:Exit");					switch(sc.nextInt())
					{
					case 1:
						System.out.println("Enter email,password,register amount,registration date");
						Customer c1 = validateCustomer(sc.next(),sc.next(),sc.nextDouble(),sc.next(),custMap);
						custMap.putIfAbsent(c1.getEmail(),c1);
						System.out.println("Customer Registered Successfully"); 
						break;
					case 2:
						for(Customer cust:custMap.values())
						{
							System.out.println(cust);
						}
						break;
					case 3:
						System.out.println("Enter the email address to be found");
						Customer c2=custMap.get(sc.next());
						if(c2==null)
							throw new CustomerHandlingException("Invalid email id");
						System.out.println(c2);
						break;
					case 4:
						System.out.println("Enter your email address");
						String email=sc.next();
						String password = sc.next();
						validateLogin(email,password,custMap);
						System.out.println("Login Successful");
						break;
					case 5:
						System.out.println("Enter Email ID,old password,new password");
						email=sc.next();
						password=sc.next();
						String new_password=sc.next();
						Customer c3=validateLogin(email,password,custMap);
						validatePassword(new_password);
						c3.setPassword(new_password);
						System.out.println("PassWord change successful");
						break;
					case 6:
						System.out.println("Enter Email ID,old password,new password");
						email=sc.next();
						password=sc.next();
						validateLogin(email, password, custMap);
						if(custMap.remove(email)==null)
						{
							throw new CustomerHandlingException("Invalid email.Could not Unsubscribe");
						}
						custMap.remove(email);
						System.out.println("Customer Unsubscribed");
						break;
					case 7:
						TreeMap<String,Customer> tm = new TreeMap<>(custMap);
						System.out.println("Sorting customers as per email id");
						for (Customer e1:tm.values())
						{
							System.out.println(e1);
						}
						break;
					case 8:
						Collection<Customer> c5 = new ArrayList<>();
						for(Customer c:custMap.values())
						{
							c5.add(c);
						}
						Collections.sort(((ArrayList<Customer>)c5),new Comparator<Customer>(){
							@Override
							public int compare(Customer c1,Customer c2)
							{
								return ((Double)c1.getReg_amount()).compareTo(c2.getReg_amount());
							}
						}
						);
						for(Customer custnew:c5)
						{
							System.out.println(custnew);
						}
						break;
					/*case 10:
						Collections.sort(custMap, new Comparator<Customer>()
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
*/					case 20:
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
