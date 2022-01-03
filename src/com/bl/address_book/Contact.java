package com.bl.address_book;

public class Contact {
	private String firstName;
	private String email;
	private String phoneNumber;
	
	public String getfirstName() {
		return firstName;
	}
	
	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmailId(String email) {
		this.email = email;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Contact \n[\nfirstName=" + firstName + ", "
				+ "\nemail=" + email + ", "
						+ "\nphoneNumber=" + phoneNumber + "\n]";
	}
	
	
}
