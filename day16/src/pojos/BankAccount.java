package pojos;

public class BankAccount {
	private int AccountNo;
	private String name;
	private String acType;
	private double balance;
	public BankAccount(int accountNo, String name, String acType, double balance) {
		super();
		AccountNo = accountNo;
		this.name = name;
		this.acType = acType;
		this.balance = balance;
	}
	public int getAccountNo() {
		return AccountNo;
	}
	public void setAccountNo(int accountNo) {
		AccountNo = accountNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAcType() {
		return acType;
	}
	public void setAcType(String acType) {
		this.acType = acType;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	
	

}
