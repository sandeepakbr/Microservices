package com.microservices.account.entity;

import java.io.Serializable;

import org.hibernate.annotations.GenericGenerator;

import com.microservices.account.shared.Auditable;

import jakarta.persistence.AttributeNode;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name="tbl_account")
public class Account extends Auditable<String> implements Serializable{
   
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(generator = "acc-uuid")
	@GenericGenerator(name = "acc-uuid", strategy = "uuid")
	@Column(name="ACC_ID", unique = true, nullable = false)
	private String accountId;
	@Column(name="ACC_TYPE")
	private String accountType;
	@Column(name="ACC_HOLD_NAME")
	private String accountHolderName;
	@Column(name="ACC_NUM")
	private String accountNumber;
	@Column(name="ACC_BAL")
	private Long accountBalance;
	@Column(name="CUSTOMER_ID")
	private String customerId;
	
	private Customer customer;
	
	
	@ManyToOne(targetEntity=Customer.class, fetch=FetchType.LAZY)
	@JoinColumn(name = "CUSTOMER_ID", nullable = false)
	public Customer getCustomer() {
		return customer;
	}

	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public Long getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(Long accountBalance) {
		this.accountBalance = accountBalance;
	}
	
}
