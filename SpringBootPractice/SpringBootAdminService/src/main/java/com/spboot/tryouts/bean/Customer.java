package com.spboot.tryouts.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "CUSTOMER")
@SequenceGenerator(name="CUST_SEQ",initialValue=3,allocationSize=100)
public class Customer {

	@Id
	@NotNull
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="CUST_SEQ")
	private int custId;

	private String custFirstName;

	private String custLastName;

	@DateTimeFormat(pattern = "DD/MM/yyyy")
	private Date custDateOfBirth;

	private String custBloodGroup;

	private String custAddress;

	@Email
	private String custEmail;

	private String custPhone;

	/**
	 * @return the custId
	 */
	public int getCustId() {
		return custId;
	}

	/**
	 * @param custId the custId to set
	 */
	public void setCustId(int custId) {
		this.custId = custId;
	}

	/**
	 * @return the custFirstName
	 */
	public String getCustFirstName() {
		return custFirstName;
	}

	/**
	 * @param custFirstName the custFirstName to set
	 */
	public void setCustFirstName(String custFirstName) {
		this.custFirstName = custFirstName;
	}

	/**
	 * @return the custLastName
	 */
	public String getCustLastName() {
		return custLastName;
	}

	/**
	 * @param custLastName the custLastName to set
	 */
	public void setCustLastName(String custLastName) {
		this.custLastName = custLastName;
	}

	/**
	 * @return the custDateOfBirth
	 */
	public Date getCustDateOfBirth() {
		return custDateOfBirth;
	}

	/**
	 * @param custDateOfBirth the custDateOfBirth to set
	 */
	public void setCustDateOfBirth(Date custDateOfBirth) {
		this.custDateOfBirth = custDateOfBirth;
	}

	/**
	 * @return the custBloodGroup
	 */
	public String getCustBloodGroup() {
		return custBloodGroup;
	}

	/**
	 * @param custBloodGroup the custBloodGroup to set
	 */
	public void setCustBloodGroup(String custBloodGroup) {
		this.custBloodGroup = custBloodGroup;
	}

	/**
	 * @return the custAddress
	 */
	public String getCustAddress() {
		return custAddress;
	}

	/**
	 * @param custAddress the custAddress to set
	 */
	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}

	/**
	 * @return the custEmail
	 */
	public String getCustEmail() {
		return custEmail;
	}

	/**
	 * @param custEmail the custEmail to set
	 */
	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}

	/**
	 * @return the custPhone
	 */
	public String getCustPhone() {
		return custPhone;
	}

	/**
	 * @param custPhone the custPhone to set
	 */
	public void setCustPhone(String custPhone) {
		this.custPhone = custPhone;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custFirstName=" + custFirstName + ", custLastName=" + custLastName
				+ ", custDateOfBirth=" + custDateOfBirth + ", custBloodGroup=" + custBloodGroup + ", custAddress="
				+ custAddress + ", custEmail=" + custEmail + ", custPhone=" + custPhone + "]";
	}

}
