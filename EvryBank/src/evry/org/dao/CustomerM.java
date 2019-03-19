package evry.org.dao;

import java.util.HashMap;
import java.util.Scanner;

import evry.org.model.Account;
import evry.org.model.Customer;
import evry.org.service.EbCustomer;

public class CustomerM {
	
	private static HashMap<Integer,Customer> listofusers=new HashMap<>();
	private static Customer cust;
	private static Account account;
	private static EbCustomer ebcustomer=new EbCustomer();
	

	public static void main(String[] args) {
		
String[] customerdetails=new String[4];
	System.out.println("Hi Welcome to Evry Bank . Plesae choose the number to perfrom the corresponding transaction");
		System.out.println("1.Add New user 2.AddMoney 3.SendMoney 4.WithdrawMoney 5.View Account 6.View Profile 7.Loan");
		Scanner sc=new Scanner(System.in);
		int option=sc.nextInt();
		System.out.println(option);
		
		
		
switch(option)
		{
       case 1:
          ebcustomer.addCustomer();
          break;
		case 2:
			ebcustomer.addMoney();
			 break;
		case 3:
			System.out.println("option 1 has been chosen");
		case 4:
			System.out.println("option 1 has been chosen");
		case 5:
			System.out.println("option 1 has been chosen");
		case 6:
			System.out.println("option 1 has been chosen");
		case 7:
			System.out.println("option 1 has been chosen");
			
		
		}
		
//		Customer c1=new Customer("srinu","nayan",18)
		
		
		

	}

}
