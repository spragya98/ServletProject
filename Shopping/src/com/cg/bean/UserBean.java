package com.cg.bean;
/** 
* @author pragya
* @date 27-Mar-2020
@time 2:45:43 pm
*/
public class UserBean {

	private String name;
	private String userid;
	private String password;
	private String city;
	private String email;
	private String mobile;
	
	public UserBean() {
		// TODO Auto-generated constructor stub
	}
	

	public UserBean(String name, String userid, String password, String city, String email, String mobile) {
		super();
		this.name = name;
		this.userid = userid;
		this.password = password;
		this.city = city;
		this.email = email;
		this.mobile = mobile;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	
}
