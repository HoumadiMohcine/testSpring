package com.sqli.spring.beans;

public class Client {

	private String clientName;
	private String clientLastName;
	private String clientAddress;
	private String clientEmail;
	private String clientPhone;

	
	
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Client(String clientLastName ,String clientName, String clientAddress, String clientEmail, String clientPhone) {
		this.clientName = clientName;
		this.clientLastName = clientLastName;
		this.clientAddress = clientAddress;
		this.clientEmail = clientEmail;
		this.clientPhone = clientPhone;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getClientAddress() {
		return clientAddress;
	}

	public void setClientAddress(String clientAddress) {
		this.clientAddress = clientAddress;
	}

	public String getClientEmail() {
		return clientEmail;
	}

	public void setClientEmail(String clientEmail) {
		this.clientEmail = clientEmail;
	}

	public String getClientPhone() {
		return clientPhone;
	}

	public void setClientPhone(String clientPhone) {
		this.clientPhone = clientPhone;
	}

	public String getClientLastName() {
		return clientLastName;
	}

	public void setClientLastName(String clientLastName) {
		this.clientLastName = clientLastName;
	}
}
