package cust_excs;

@SuppressWarnings("serial")
public class CustomerHandlingException extends Exception {
	public CustomerHandlingException(String err_msg)
	{
		super(err_msg);
	}
}
