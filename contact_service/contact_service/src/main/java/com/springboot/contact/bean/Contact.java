package com.springboot.contact.bean;

public class Contact {
	
	private Long contactId;
	private String contactName;
	private String contactEmail;
	
	private Long employeeId;

	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Contact(Long contactId, String contactName, String contactEmail, Long employeeId) {
		super();
		this.contactId = contactId;
		this.contactName = contactName;
		this.contactEmail = contactEmail;
		this.employeeId = employeeId;
	}

	public Long getContactId() {
		return contactId;
	}

	public void setContactId(Long contactId) {
		this.contactId = contactId;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	@Override
	public String toString() {
		return "Contact [contactId=" + contactId + ", contactName=" + contactName + ", contactEmail=" + contactEmail
				+ ", employeeId=" + employeeId + "]";
	}
	

}
