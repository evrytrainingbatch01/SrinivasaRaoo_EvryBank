package evry.org.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import evry.org.model.Customer;

public class EbCustomerDao {
	
	public static Connection con;
	public static ResultSet resultset;
	
	public static Connection getConnection() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/evry_db","root","Mysql56&");
		
		}
		catch(Exception e){ System.out.println(e);} 
		
		return con;
		
		
		
	}
	
	public void addCustomer(Customer cu) {
		
//		System.out.println(cu.getCustomer_id()+" "+cu.getFist_name()+" "+cu.getLast_name()+" "+cu.getAge()+" "+cu.getCity()+" "+cu.getCountry()+" "+cu.getMobile_no()+" "+cu.getEmail_id()+""+cu.getAc().getAccount_no()+" "+cu.getAc().getBalance());
		int accountno=0;
		try {
		con=EbCustomerDao.getConnection();
			
			Statement stmt=con.createStatement(); 
			String sql="insert into customers_evry(customer_id,First_Name,Last_Name,Age,City,Country,Mobile_No,Emai_id,Account_No,Balance) values('"+cu.getCustomer_id()+"','"+cu.getFist_name()+"','"+cu.getLast_name()+"','"+cu.getAge()+"','"+cu.getCity()+"','"+cu.getCountry()+"','"+cu.getMobile_no()+"','"+cu.getEmail_id()+"','"+cu.getAc().getAccount_no()+"','"+cu.getAc().getBalance()+"')";
			
			System.out.println(sql);
            
            if(stmt.executeUpdate(sql)!=1)
    			System.out.println("Sorry !. Something went wrong . plesae try again");
    		else {
    			
    			con=EbCustomerDao.getConnection();
    			
    			stmt=con.createStatement(); 
    		sql="select Account_No from customers_evry  where First_Name='"+cu.getFist_name()+"' and Emai_id='"+cu.getEmail_id()+"'";
    		
    		resultset=stmt.executeQuery(sql);
    		
    		 while(resultset.next()){
    	         //Retrieve by column name
    	        accountno  = resultset.getInt("Account_No");
    	         
    	         
    		   }
    		 
    		 System.out.println(" your account has been created successfully . your A/No  is :"+accountno);
    		 
    		 
    		 
    		 }
		con.close();  
			}
		
		catch(Exception e){ System.out.println(e);}  
		
			
}  
	
	
	public void addMoney(String[] customerdetails)
	{
		int id=0;
		try {
		con=EbCustomerDao.getConnection();
		Statement stmt=con.createStatement();
		String sql="update customers_evry set Balance=Balance+"+customerdetails[2]+" where Account_No='"+customerdetails[0]+"' and Emai_id='"+customerdetails[1]+"'";
		System.out.println(sql);
		if(stmt.executeUpdate(sql)!=1)
			System.out.println("Sorry !. Something went wrong . plesae try again");
		else {
			
			con=EbCustomerDao.getConnection();
			
			stmt=con.createStatement(); 
		sql="select * from customers_evry  where Account_No='"+customerdetails[0]+"'";
		resultset=stmt.executeQuery(sql);
		
		 while(resultset.next()){
	         //Retrieve by column name
	        id  = resultset.getInt("Balance");
	         
	         
		   }
		 
		 System.out.println("Thanks for using netbanking . your account "+customerdetails[0]+" has been credited by "+customerdetails[2]+" and the current balance is :"+id);
		 
		 
		 
		 }
		}
		catch(Exception e){ System.out.println(e);}  
		
	}
	
	public void sendMoney(String[] customer)
	{
		 int id=0;
		try {
           con=EbCustomerDao.getConnection();
			
			Statement stmt=con.createStatement(); 
			String sql="update customers_evry set Balance=Balance-"+customer[3]+" where Account_No='"+customer[0]+"'";
			
			System.out.println(sql);
			if(stmt.executeUpdate(sql)!=1)
				System.out.println("Sorry !. Something went wrong . plesae try again");
			else {
				
				con=EbCustomerDao.getConnection();
				
				stmt=con.createStatement(); 
			sql="select * from customers_evry  where Account_No='"+customer[0]+"'";
			ResultSet rs=stmt.executeQuery(sql);
			
			 while(rs.next()){
		         //Retrieve by column name
		        id  = rs.getInt("Balance");
		         
		         
			   }
			
			 System.out.println("Thanks for using netbanking . your account "+customer[0]+" has been debited by "+customer[3]+" and transferred  to the benificiary account "+customer[1]+"  the current balance is :"+id);
			 
			 
			 
			 }
		}
		catch(Exception e){ System.out.println(e);} 
		
	}
	
	public void withdrawMoney(String[] customerdetails)
	{
		
		
		 int id=0;
			try {
	           con=EbCustomerDao.getConnection();
				
				Statement stmt=con.createStatement(); 
				String sql="update customers_evry set Balance=Balance-"+customerdetails[1]+" where Account_No='"+customerdetails[0]+"'";
				
				System.out.println(sql);
				if(stmt.executeUpdate(sql)!=1)
					System.out.println("Sorry !. Something went wrong . plesae try again");
				else {
					
					con=EbCustomerDao.getConnection();
					
					stmt=con.createStatement(); 
				sql="select * from customers_evry  where Account_No='"+customerdetails[0]+"'";
				ResultSet rs=stmt.executeQuery(sql);
				
				 while(rs.next()){
			         //Retrieve by column name
			        id  = rs.getInt("Balance");
			         
			         
				   }
				
				 System.out.println("Thanks for using netbanking . your account "+customerdetails[0]+" has been debited by "+customerdetails[1]+" and the current balance is :"+id);
				 
				 
				 
				 }
			}
			catch(Exception e){ System.out.println(e);} 
			
		
	}
	
	
	public void getAccountDetails(String[] customerdetails)
	{
		
		int account_no=0,balance=0;
		try {
	           con=EbCustomerDao.getConnection();
				
				Statement stmt=con.createStatement(); 
				String sql="select Account_No,Balance from customers_evry where First_Name='"+customerdetails[0]+"' and Last_Name='"+customerdetails[1]+"'";
				
				System.out.println(sql);
                resultset=stmt.executeQuery(sql);
                while(resultset.next())
                {
                	account_no=resultset.getInt("Account_No");
                	balance=resultset.getInt("Balance");
                	System.out.println("Account No :"+account_no);
                	System.out.println("Balnce :"+balance);
                }
		}
		
		catch(Exception e){ System.out.println(e);} 
		
	}
	
	public void getCustomerDetails(String[] customerdetails)
	{
		
		try {
	           con=EbCustomerDao.getConnection();
				
				Statement stmt=con.createStatement(); 
				String sql="select * from customers_evry where Account_No='"+customerdetails[0]+"'";
				
				System.out.println(sql);
           resultset=stmt.executeQuery(sql);
           while(resultset.next())
           {
             	System.out.println("Id: "+resultset.getInt("Customer_id"));
             	System.out.println("First Name: "+resultset.getString("First_Name"));
             	System.out.println("Last Name: "+resultset.getString("Last_Name"));
             	System.out.println("Age: "+resultset.getInt("Age"));
             	System.out.println("City: "+resultset.getString("City"));
             	System.out.println("Country: "+resultset.getString("Country"));
             	System.out.println("Mobile No: "+resultset.getInt("Mobile_No"));
             	System.out.println("Email Id: "+resultset.getString("Emai_id"));
             	System.out.println("Account No: "+resultset.getInt("Account_No"));
             	System.out.println("Balance: "+resultset.getInt("Balance"));
             	
             }
		}
		
		catch(Exception e){ System.out.println(e);} 
		
	}
	
	public void getLoan(String[] customerdetails)
	{
		System.out.println(" Loan santion is in process and it would take 1 working day  . we would inform you once it's done ");
	}
	
	
	}
	


