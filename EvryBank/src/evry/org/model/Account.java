package evry.org.model;

import java.util.Random;

public class Account {
	
	private int account_no=Account.random();
	private double balance;
	
	public int getAccount_no() {
		return account_no;
	}
	public void setAccount_no(int account_no) {
		this.account_no = account_no;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	public static int random()
	{
		Random ran=new Random();
		return ran.nextInt(1000000);
		
	}

}
