package evry.org.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import evry.org.model.Customer;

public class EbCustomerDao {
	
	public static Connection con;
	
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
		
		try {
		con=EbCustomerDao.getConnection();
			
			Statement stmt=con.createStatement(); 
			String sql="insert into customers_evry(customer_id,First_Name,Last_Name,Age,City,Country,Mobile_No,Emai_id,Account_No,Balance) values('"+cu.getCustomer_id()+"','"+cu.getFist_name()+"','"+cu.getLast_name()+"','"+cu.getAge()+"','"+cu.getCity()+"','"+cu.getCountry()+"','"+cu.getMobile_no()+"','"+cu.getEmail_id()+"','"+cu.getAc().getAccount_no()+"','"+cu.getAc().getBalance()+"')";
			
			System.out.println(sql);
			System.out.println(stmt.executeUpdate(sql));
			con.close();  }
		
		catch(Exception e){ System.out.println(e);}  
		
			
}  
	
	
	public void addMoney(String[] customerdetails)
	{
		
		try {
		con=EbCustomerDao.getConnection();
		Statement stmt=con.createStatement();
		String sql="update customers_evry set Balance=Balance+"+customerdetails[2]+" where Account_No='"+customerdetails[0]+"' and Emai_id='"+customerdetails[1]+"'";
		System.out.println(sql);
		System.out.println(stmt.executeUpdate(sql));
		}
		catch(Exception e){ System.out.println(e);}  
		
	}
	
	
	}
	


