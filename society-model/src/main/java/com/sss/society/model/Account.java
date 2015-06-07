package com.sss.society.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@org.hibernate.annotations.Entity
@Table(name="Account")
public class Account 
{
	@Id
	@GeneratedValue(generator="native")
	private Long id;
	@Column(name="AccountId")
	private String accountId;
	
	@Column(name="AccountName")
	private String accountName;
	@Column(name="AccountType")
	private int accountType;
	
	@OneToMany(mappedBy="account")
	private List<Customer> customers;
	private Entity entity;
	private AuditInfo auditInfo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public int getAccountType() {
		return accountType;
	}

	public void setAccountType(int accountType) {
		this.accountType = accountType;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	public AuditInfo getAuditInfo() {
		return auditInfo;
	}

	public void setAuditInfo(AuditInfo auditInfo) {
		this.auditInfo = auditInfo;
	}

}
