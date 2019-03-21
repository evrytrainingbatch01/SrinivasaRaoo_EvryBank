package evry.org.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import evry.org.service.EbCustomer;

public class EbLoginVerifyDao {
	
	public static Connection con;
	public static ResultSet resultset;
	public  static EbCustomer ebcustomer=new EbCustomer();
	
	public static Connection getConnection() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/evry_db","root","Mysql56&");
		
		}
		catch(Exception e){ System.out.println(e);} 
		
		return con;
		
		
		
	}
	
	
public boolean verifyLogin(String[] logindetails) {
	
	boolean validity=false;
	try {
		con=EbCustomerDao.getConnection();
			
			Statement stmt=con.createStatement(); 
			String sql="select * from  userdetails where Username='"+logindetails[0]+"' and Password='"+logindetails[1]+"'";
			
			System.out.println(sql);
             resultset=stmt.executeQuery(sql);
             
       if(resultset.next())
      	   {
    	   
    	   if(resultset.getString("Role").equals("user"))
    	   {
    		   validity=true;
    	   }
    	   else if(resultset.getString("Role").equals("admin"))
          		     {
         		    	 validity=true;
          		     }
  
 
         	   }
          
           con.close();
           
          
			}
		
		catch(Exception e){ System.out.println(e);}  
	 
	 return validity;
	}


}
