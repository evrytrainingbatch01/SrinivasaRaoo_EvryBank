package evry.org.service;

import java.util.Scanner;

import evry.org.dao.EbCustomerDao;
import evry.org.model.Account;
import evry.org.model.Customer;

public class EbCustomer implements CustomerTransactions{
	
	
	private Customer customer;
	private Account account;
	private Scanner sc;
	private EbCustomerDao customerdao=new EbCustomerDao();
	public static  String[] customerdetails=new String[3];
	

	@Override
	public void addCustomer() {
		account=new Account();
		System.out.println("Please provide the below details to create account");
		System.out.println("1.FirstName 2.LastName 3.Age 4.City 5.Country 6.Mobile_No 7.Email_id");
		String[] customerdetails=new String[7];
		sc=new Scanner(System.in);

		for(int i=0;i<customerdetails.length;i++)
		  {
			 
			 customerdetails[i]=sc.nextLine(); 
			 
		  }
		
		for(int i=0;i<customerdetails.length;i++)
		{
		System.out.println(customerdetails[i]);
			 
		}
		
		

customer=new Customer(customerdetails[0],customerdetails[1],Integer.parseInt(customerdetails[2]),customerdetails[3],customerdetails[4],Integer.parseInt(customerdetails[5]),customerdetails[6],account);
		customerdao.addCustomer(customer);
	
	}

	@Override
	public void addMoney() {
		
		System.out.println("option 2 has been chosen");
		System.out.println("Please provide the below details to deposit the Amount");
		System.out.println("1.Account No 2.Email_id 3.Amount to be deposited");
		sc=new Scanner(System.in);
		
		for(int i=0;i<customerdetails.length;i++)
		  {
			 
			 customerdetails[i]=sc.nextLine(); 
			 
		  }
		
		for(int i=0;i<customerdetails.length;i++)
		{
		System.out.println(customerdetails[i]);
			 
		}
		if(customerdetails==null)
		{
			System.out.println("it's null value");
		}
		else
			System.out.println("it't nottttttttt null value");
		
customerdao.addMoney(customerdetails);
		
		
	}

	@Override
	public void sendMoney() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdrawMoney() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getAccountDetails() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getLoan() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getCustomerDetails() {
		// TODO Auto-generated method stub
		
	}

}
