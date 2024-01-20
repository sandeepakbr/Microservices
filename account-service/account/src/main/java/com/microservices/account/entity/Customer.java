package com.microservices.account.entity;

import java.io.Serializable;
import java.util.Set;

import com.microservices.account.shared.Auditable;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_customer")
public class Customer extends Auditable<String> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="CUSTOMER_ID")
	private String customerId;
	@Column(name="CUSTOMER_NAME")
	private String customerName;
	@Column(name="CUSTOMER_EMAIL")
	private String customerEmail;
	@Column(name="CUSTOMER_ADDRESS")
	private String customerAddress;
	
	 @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "customer", targetEntity = Account.class, orphanRemoval = true)
	private Set<Account> account;
	

	
	public Set<Account> getAccount() {
		return account;
	}
	public void setAccount(Set<Account> account) {
		this.account = account;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

}
