package dao;

import static dbUtils.DBUtils.fetchConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import pojos.BankAccount;

public class DBBankImplement implements DBBankUtils{
	private Connection cn;
	private PreparedStatement pst;
	
	public DBBankImplement() throws Exception{
		super();
		this.cn = fetchConnection();
		if(cn==null)
		{
			System.out.println("Connection failed	");
		}
		this.pst = cn.prepareStatement("select * from bank_account");
	}

	public void cleanUp() throws Exception{
		if(pst!=null)
			pst.close();
		if(cn!=null)
			cn.close();
	}
	@Override
	public ArrayList<BankAccount> getBankAccount() {
		ArrayList<BankAccount> bankList = new ArrayList<>();
		try (ResultSet rst= pst.executeQuery();){
			while(rst.next())
			{
				bankList.add(new BankAccount(rst.getInt(1),rst.getString(2),rst.getString(3),rst.getDouble(4)));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return bankList;
	}

	@Override
	public String createBankAccount(BankAccount a) {
		// TODO Auto-generated method stub
		return null;
	}

}
