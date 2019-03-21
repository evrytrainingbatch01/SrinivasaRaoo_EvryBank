package evry.org.dao;

import java.util.HashMap;
import java.util.Scanner;

import evry.org.model.Account;
import evry.org.model.Customer;
import evry.org.service.EbAdmin;
import evry.org.service.EbCustomer;
import evry.org.service.VerifyLogin;

public class CustomerM {
	
	private static HashMap<Integer,Customer> listofusers=new HashMap<>();
	private static Customer cust;
	private static Account account;
	private static EbCustomer ebcustomer=new EbCustomer();
	private static EbAdmin ebadmin=new EbAdmin();
	public static VerifyLogin login=new VerifyLogin();
	public static boolean flag;
	

	public static void main(String[] args) {
		
String[] customerdetails=new String[4];

System.out.println("Welcome to Evry Bank .........!");
System.out.println("plesae Specify the Role by chosing the number below");
System.out.println("1.User 2.Admin");
Scanner sc=new Scanner(System.in);
int option=sc.nextInt();


switch(option)
{
	
	case 1:
		
		
		flag=login.verifyLogin();
		
		while(true) {
		if(flag)
		{
			
			
	System.out.println("Plesae choose the number to perfrom the corresponding transaction");
		System.out.println("1.New Account? 2.DepositMoney 3.TransferMoney 4.WithdrawMoney 5.View Account 6.View Profile 7.Loan");
		sc=new Scanner(System.in);
		option=sc.nextInt();
		
		
		switch(option)
		{
       case 1:
          ebcustomer.addCustomer();
          break;
		case 2:
			ebcustomer.addMoney();
			 break;
		case 3:
			ebcustomer.sendMoney();
			break;
		case 4:
			ebcustomer.withdrawMoney();
			break;
		case 5:
			ebcustomer.getAccountDetails();
			break;
		case 6:
			ebcustomer.getCustomerDetails();
			break;
		case 7:
			ebcustomer.getLoan();
            break;			
		
		}
		
			
		
}
		else {
			System.out.println("sorry... User not found");
			}
		
System.out.println("you want to continue ? 1.yes 2.No");
	int decision=sc.nextInt();
	if(decision==1)
		continue;
	else
		break;
		
		}
		
		break;
		
	case 2:
		
		
		flag=login.verifyLogin();
	
		while(true) {
		if(flag)
		{
		System.out.println("Plesae choose the number to perfrom the corresponding transaction");
			System.out.println("1.AddCustomer 2.DeleteCustomer 3.ListOfCustomers 4.SanctionLoan 5.ApproveTransactions 6.AddMoney");
			sc=new Scanner(System.in);
			option=sc.nextInt();
			
			
			switch(option)
			{
	       case 1:
	          ebadmin.addCustomer();
	          break;
           case 2:
	          ebadmin.deleteCustomer();
    		 break;
     		case 3:
            	ebadmin.getAllcustomerDetails();
            	break;
            case 4:
            	ebadmin.sanctionLoan();
         	  break;
            case 5:
            	ebadmin.approveTransactions();
          	break;
         	case 6:
                ebadmin.addMoney();
                break;
			case 7:
				ebcustomer.getLoan();
	            break;			
			
			}}
	else {
		System.out.println("sorry... User not found (or) you don't have admin access");
	}
			
		
		System.out.println("you want to continue ? 1.yes 2.No");
		int decision=sc.nextInt();
		if(decision==1)
			continue;
		else
			break;
			
			}
			
			break;
			
		}

	}
}


