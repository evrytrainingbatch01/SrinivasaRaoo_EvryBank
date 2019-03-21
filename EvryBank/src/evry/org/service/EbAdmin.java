package evry.org.service;

import java.util.Scanner;

import evry.org.dao.EbAdminDao;

public class EbAdmin  implements AdminTransactions {
	
	private EbAdminDao admindao=new EbAdminDao();
	public static  String[] customerdetails;
	public static Scanner sc;

	@Override
	public void addAdmin() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addCustomer() {
		
		admindao.addCustomer();
	}

	@Override
	public void deleteCustomer() {
		System.out.println("Please provide the below details to delete the customer");
		System.out.println("1.FirstName 2.Email_id");
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
		admindao.deleteCustomer(customerdetails);
		
	}

	@Override
	public void addMoney() {
		
		admindao.addMoney();
		
	}

	@Override
	public void approveTransactions() {
		admindao.approveTransactions();
		
	}

	@Override
	public void sanctionLoan() {
		
		admindao.sanctionLoan();
	}

	@Override
	public void getAllcustomerDetails() {
		
		admindao.getAllcustomerDetails();
	}

}
