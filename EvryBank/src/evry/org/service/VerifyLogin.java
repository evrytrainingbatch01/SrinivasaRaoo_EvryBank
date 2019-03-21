package evry.org.service;

import java.util.Scanner;

import evry.org.dao.EbLoginVerifyDao;

public class VerifyLogin implements Login {
	
	public static EbLoginVerifyDao eblogin=new EbLoginVerifyDao();
	public static  String[] logindetails=new String[3];
	public static Scanner sc;

	@Override
	public boolean verifyLogin() {
		
		System.out.println("Please provide below details to login");
		System.out.println("1.UserName 2.Password");
		logindetails=new String[2];
		sc=new Scanner(System.in);

		for(int i=0;i<logindetails.length;i++)
		  {
			 
			logindetails[i]=sc.nextLine(); 
			 
		  }
		
		for(int i=0;i<logindetails.length;i++)
		{
		System.out.println(logindetails[i]);
			 
		}
		
	  return eblogin.verifyLogin(logindetails);
	}

}
