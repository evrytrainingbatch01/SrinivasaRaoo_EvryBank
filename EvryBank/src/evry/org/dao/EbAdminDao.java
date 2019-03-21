package evry.org.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import evry.org.service.EbCustomer;

public class EbAdminDao {
	

	public static Connection con;
	public static ResultSet resultset;
	public static EbCustomer ebcustomer=new EbCustomer();
	
	public static Connection getConnection() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/evry_db","root","Mysql56&");
		
		}
		catch(Exception e){ System.out.println(e);} 
		
		return con;
		
		
		
	}
	
	public void getAllcustomerDetails() {
		
		try {
			con=EbCustomerDao.getConnection();
				
				Statement stmt=con.createStatement(); 
				String sql="select * from  customers_evry";
				
				System.out.println(sql);
				resultset=stmt.executeQuery(sql);
				
				System.out.println("Customer_Id    First_Name    Last_Name    Age    City    Country    Mobile_No    Email_Id    Account_No    Balance");
				
				 while(resultset.next())
		           {
					 
					 System.out.println(resultset.getInt("Customer_id")+"              "+resultset.getString("First_Name")+"       "+resultset.getString("Last_Name")+"       "+resultset.getInt("Age")+"       "+resultset.getString("City")+"       "+resultset.getString("Country")+"       "+resultset.getString("Mobile_No")+"       "+resultset.getString("Emai_id")+"       "+resultset.getString("Account_No")+"        "+resultset.getString("Balance"));
		             	
		             	
		             }
         		con.close();  
				}
		
			catch(Exception e){ System.out.println(e);}  
		
	}
	
	public void addCustomer() {
		
		ebcustomer.addCustomer();
		
	}
	
	public void deleteCustomer(String[] customerdetails)
	{
		
		try {
			con=EbCustomerDao.getConnection();
				
				Statement stmt=con.createStatement(); 
				String sql="delete from customers_evry where First_Name='"+customerdetails[0]+"' and Emai_id='"+customerdetails[1]+"'";
				
				System.out.println(sql);
              System.out.println(stmt.executeUpdate(sql));
               con.close();  
				}
		
			catch(Exception e){ System.out.println(e);} 
		
	}
	
	public void addMoney() {
		
		ebcustomer.addMoney();
	}
	
	public void sanctionLoan() {
		
		System.out.println("Loan has been sanctioned");
	}
	
	public void approveTransactions()
	{
		System.out.println("All transactons have been approved");
	}


}
