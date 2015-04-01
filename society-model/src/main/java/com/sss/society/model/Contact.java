package com.sss.society.model;

public class Contact {

	private Long contactId;
	private String contactName;
	private int contactType;
	private Customer customer;
	private Account account;
	private AuditInfo auditInfo;

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

	public int getContactType() {
		return contactType;
	}

	public void setContactType(int contactType) {
		this.contactType = contactType;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public AuditInfo getAuditInfo() {
		return auditInfo;
	}

	public void setAuditInfo(AuditInfo auditInfo) {
		this.auditInfo = auditInfo;
	}

}
