package evry.org.model;

import evry.org.service.AdminTransactions;

public class Admin{
	
	private String fist_name;
	private String last_name;
	private int age;
	private String city;
	private String country;
	private int mobile_no;
	private String email_id;
	
	public Admin(String fist_name, String last_name, int age, String city, String country, int mobile_no,
			String email_id) {
		super();
		this.fist_name = fist_name;
		this.last_name = last_name;
		this.age = age;
		this.city = city;
		this.country = country;
		this.mobile_no = mobile_no;
		this.email_id = email_id;
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
	
	

}
