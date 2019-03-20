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
		customerdetails=new String[7];
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
		
		
customerdao.addMoney(customerdetails);
		
		
	}

	@Override
	public void sendMoney() {
		
		System.out.println("option 3 has been chosen");
		System.out.println("Please provide the below details to transfer the Amount");
		System.out.println("1.your_Account_No 2.Benificiary_Account_No 3.IFSC code 4.Amount to be tranferred");
		customerdetails=new String[4];
		sc=new Scanner(System.in);
		
		for(int i=0;i<customerdetails.length;i++)
		  {
			 
			 customerdetails[i]=sc.nextLine(); 
			 
		  }
		
		for(int i=0;i<customerdetails.length;i++)
		{
		System.out.println(customerdetails[i]);
			 
		}
		
		customerdao.sendMoney(customerdetails);
		
		
	}

	@Override
	public void withdrawMoney() {
		
		
		System.out.println("option 4 has been chosen");
		System.out.println("Please provide the below details to withdraw the Amount");
		System.out.println("1.Account_No 2.Amount to be withdrwan");
		customerdetails=new String[2];
		sc=new Scanner(System.in);
		
		for(int i=0;i<customerdetails.length;i++)
		  {
			 
			 customerdetails[i]=sc.nextLine(); 
			 
		  }
		
		for(int i=0;i<customerdetails.length;i++)
		{
		System.out.println(customerdetails[i]);
			 
		}
		
         customerdao.withdrawMoney(customerdetails);
	
	}
	@Override
	public void getAccountDetails() {
		
		System.out.println("option 5 has been chosen");
		System.out.println("Please provide the below details to display your account details");
		System.out.println("1.First_Name 2.Last_Name");
		customerdetails=new String[2];
		sc=new Scanner(System.in);
		
		for(int i=0;i<customerdetails.length;i++)
		  {
			 
			 customerdetails[i]=sc.nextLine(); 
			 
		  }
		
		for(int i=0;i<customerdetails.length;i++)
		{
		System.out.println(customerdetails[i]);
			 
		}
		
		customerdao.getAccountDetails(customerdetails);
		
		
	}
	
	@Override
	public void getCustomerDetails() {
		
		
		System.out.println("option 6 has been chosen");
		System.out.println("Please provide the below details to display your Profile details");
		System.out.println("1.Account_No");
		customerdetails=new String[1];
		sc=new Scanner(System.in);
		
		for(int i=0;i<customerdetails.length;i++)
		  {
			 
			 customerdetails[i]=sc.nextLine(); 
			 
		  }
		
		for(int i=0;i<customerdetails.length;i++)
		{
		System.out.println(customerdetails[i]);
			 
		}
		
		customerdao.getCustomerDetails(customerdetails);
	}


	@Override
	public void getLoan() {
		
		System.out.println("option 7 has been chosen");
		System.out.println("Please provide the below details to proceed further:");
		System.out.println("1.Account No 2.Loan Amount");
		
		customerdetails=new String[2];
		sc=new Scanner(System.in);
		
		for(int i=0;i<customerdetails.length;i++)
		  {
			 
			 customerdetails[i]=sc.nextLine(); 
			 
		  }
		
		for(int i=0;i<customerdetails.length;i++)
		{
		System.out.println(customerdetails[i]);
			 
		}
		
customerdao.getLoan(customerdetails);
	}

	
}
