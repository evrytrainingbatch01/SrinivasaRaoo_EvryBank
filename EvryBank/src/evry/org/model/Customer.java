package evry.org.model;

import java.util.Random;

import evry.org.service.CustomerTransactions;

public class Customer{
	
	private int customer_id=Customer.random();
	private String fist_name;
	private String last_name;
	private int age;
	private String city;
	private String country;
	private int mobile_no;
	private String email_id;
	private Account ac;

	
	
	public Customer(String fist_name, String last_name, int age, String city, String country, int mobile_no,
			String email_id, Account ac) {
		super();
		this.fist_name = fist_name;
		this.last_name = last_name;
		this.age = age;
		this.city = city;
		this.country = country;
		this.mobile_no = mobile_no;
		this.email_id = email_id;
		this.ac = ac;
	}

	
	public int getCustomer_id() {
		return customer_id;
	}



	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}



	public String getFist_name() {
		return fist_name;
	}



	public void setFist_name(String fist_name) {
		this.fist_name = fist_name;
	}



	public String getLast_name() {
		return last_name;
	}



	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getCountry() {
		return country;
	}



	public void setCountry(String country) {
		this.country = country;
	}



	public int getMobile_no() {
		return mobile_no;
	}



	public void setMobile_no(int mobile_no) {
		this.mobile_no = mobile_no;
	}



	public String getEmail_id() {
		return email_id;
	}



	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}



	public Account getAc() {
		return ac;
	}



	public void setAc(Account ac) {
		this.ac = ac;
	}
	
	
	
	
	public static int random()
	{
		
Random ran=new Random();
return ran.nextInt(1000);
		
		
	}
	

}
