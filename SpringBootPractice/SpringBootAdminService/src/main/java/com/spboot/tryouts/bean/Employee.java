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
@Table(name="EMPLOYEE")
@SequenceGenerator(name="EMP_SEQ",initialValue=3,allocationSize=100)
public class Employee {

	@Id
	@NotNull
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="EMP_SEQ")
	private int empId;

	private String empFirstName;

	private String empLastName;

	@DateTimeFormat(pattern="DD/MM/yyyy")
	private Date empDateOfBirth;

	private String empBloodGroup;

	private String empAddress;

	@Email
	private String empEmail;
	
	private String empPhone;

	/**
	 * @return the empId
	 */
	public int getEmpId() {
		return empId;
	}

	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	/**
	 * @return the empFirstName
	 */
	public String getEmpFirstName() {
		return empFirstName;
	}

	/**
	 * @param empFirstName the empFirstName to set
	 */
	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}

	/**
	 * @return the empLastName
	 */
	public String getEmpLastName() {
		return empLastName;
	}

	/**
	 * @param empLastName the empLastName to set
	 */
	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}

	/**
	 * @return the empDateOfBirth
	 */
	public Date getEmpDateOfBirth() {
		return empDateOfBirth;
	}

	/**
	 * @param empDateOfBirth the empDateOfBirth to set
	 */
	public void setEmpDateOfBirth(Date empDateOfBirth) {
		this.empDateOfBirth = empDateOfBirth;
	}

	/**
	 * @return the empBloodGroup
	 */
	public String getEmpBloodGroup() {
		return empBloodGroup;
	}

	/**
	 * @param empBloodGroup the empBloodGroup to set
	 */
	public void setEmpBloodGroup(String empBloodGroup) {
		this.empBloodGroup = empBloodGroup;
	}

	/**
	 * @return the empAddress
	 */
	public String getEmpAddress() {
		return empAddress;
	}

	/**
	 * @param empAddress the empAddress to set
	 */
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	/**
	 * @return the empEmail
	 */
	public String getEmpEmail() {
		return empEmail;
	}

	/**
	 * @param empEmail the empEmail to set
	 */
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	/**
	 * @return the empPhone
	 */
	public String getEmpPhone() {
		return empPhone;
	}

	/**
	 * @param empPhone the empPhone to set
	 */
	public void setEmpPhone(String empPhone) {
		this.empPhone = empPhone;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empFirstName=" + empFirstName + ", empLastName=" + empLastName
				+ ", empDateOfBirth=" + empDateOfBirth + ", empBloodGroup=" + empBloodGroup + ", empAddress="
				+ empAddress + ", empEmail=" + empEmail + ", empPhone=" + empPhone + "]";
	}

}
