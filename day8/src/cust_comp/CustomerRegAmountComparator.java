package cust_comp;

import java.util.Comparator;

import com.core.core.Customer;

public class CustomerRegAmountComparator implements Comparator<Customer> {
	@Override
	public int compare(Customer c1,Customer c2)
	{
		Double reg_amt = c1.getReg_amount();
		return reg_amt.compareTo(c2.getReg_amount());
	}

}
