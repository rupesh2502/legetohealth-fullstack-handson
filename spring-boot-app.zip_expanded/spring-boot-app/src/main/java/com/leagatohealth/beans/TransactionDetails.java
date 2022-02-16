package com.leagatohealth.beans;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class TransactionDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long transactionId;
	private String referenceNo;
	private Long accNo;
	@Enumerated(EnumType.STRING)
	private TransactionType transType;
	
	@CreationTimestamp
	private Timestamp transDateTime;

	private Long bankId;
	private String ifsc;

	public TransactionDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TransactionDetails(String referenceNo, Long accNo, TransactionType transType,
			Long bankId, String ifsc) {
		super();
		this.referenceNo = referenceNo;
		this.accNo = accNo;
		this.transType = transType;
		this.transDateTime = transDateTime;
		this.bankId = bankId;
		this.ifsc = ifsc;
	}

	public String getReferenceNo() {
		return referenceNo;
	}

	public void setReferenceNo(String referenceNo) {
		this.referenceNo = referenceNo;
	}

	public Long getAccNo() {
		return accNo;
	}

	public void setAccNo(Long accNo) {
		this.accNo = accNo;
	}

	public TransactionType getTransType() {
		return transType;
	}

	public void setTransType(TransactionType transType) {
		this.transType = transType;
	}

	public Date getTransDateTime() {
		return transDateTime;
	}

	public void setTransDateTime(Date transDateTime) {
		this.transDateTime = (Timestamp) transDateTime;
	}

	public Long getBankId() {
		return bankId;
	}

	public void setBankId(Long bankId) {
		this.bankId = bankId;
	}

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	public Long getTransactionId() {
		return transactionId;
	}

	@Override
	public String toString() {
		return "TransactionDetails [transactionId=" + transactionId + ", referenceNo=" + referenceNo + ", accNo="
				+ accNo + ", transType=" + transType + ", transDateTime=" + transDateTime + ", bankId=" + bankId
				+ ", ifsc=" + ifsc + "]";
	}

}
