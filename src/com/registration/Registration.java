package com.registration;

public class Registration {
	
	private String email;
	private String password;
	private String phone;
	private String address;
	private String account_number;
	private int account_balance;
	private int transaction;
	private String name;

	public Registration(){
		
		
	}
	
	public Registration(String email, String password, String name, String phone, String address) {
		this.email = email;
		this.password = password;
		this.phone = phone;
		this.address = address;
		this.name = name;
	
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public String getPhone() {
		return phone;
	}

	public String getAddress() {
		return address;
	}

	public String getAccount_number() {
		return account_number;
	}

	public int getAccount_balance() {
		return account_balance;
	}

	public int getTransaction() {
		return transaction;
	}

	public String getName() {
		return name;
	}

	
	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}

	public void setAccount_balance(int account_balance) {
		this.account_balance = account_balance;
	}

	public void setTransaction(int transaction) {
		this.transaction = transaction;
	}

	@Override
	public String toString() {
		return "Registration [email=" + email + ", password=" + password + ", phone=" + phone + ", address=" + address
				+ ", account_number=" + account_number + ", account_balance=" + account_balance + ", transaction="
				+ transaction + ", name=" + name + "]";
	}

}
