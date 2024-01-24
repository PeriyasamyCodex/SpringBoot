package com.spboot.contactus.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Email;

@Entity
@Table(name="CONTACTUS")
@SequenceGenerator(name="CONTACTUS_SEQ",sequenceName="CONTACTUS_SEQ")
public class ContactUsDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="CONTACTUS_SEQ")
	private int contactUsId;
	
	private String contactUsModuleName;
	@Email
	private String contactUsModuleEmailId;
	private String contactusModulePhoneNumber;
	private String contactUsModuleAvailableStartDate;
	private String contactUsModuleAvailableEndDate;
	private String contactUsModuleAvailableStartTime;
	private String contactUsModuleAvailableEndTime;
	
	
	/**
	 * @return the contactUsId
	 */
	public int getContactUsId() {
		return contactUsId;
	}
	/**
	 * @param contactUsId the contactUsId to set
	 */
	public void setContactUsId(int contactUsId) {
		this.contactUsId = contactUsId;
	}
	/**
	 * @return the contactUsModuleName
	 */
	public String getContactUsModuleName() {
		return contactUsModuleName;
	}
	/**
	 * @param contactUsModuleName the contactUsModuleName to set
	 */
	public void setContactUsModuleName(String contactUsModuleName) {
		this.contactUsModuleName = contactUsModuleName;
	}
	/**
	 * @return the contactUsModuleEmailId
	 */
	public String getContactUsModuleEmailId() {
		return contactUsModuleEmailId;
	}
	/**
	 * @param contactUsModuleEmailId the contactUsModuleEmailId to set
	 */
	public void setContactUsModuleEmailId(String contactUsModuleEmailId) {
		this.contactUsModuleEmailId = contactUsModuleEmailId;
	}
	/**
	 * @return the contactusModulePhoneNumber
	 */
	public String getContactusModulePhoneNumber() {
		return contactusModulePhoneNumber;
	}
	/**
	 * @param contactusModulePhoneNumber the contactusModulePhoneNumber to set
	 */
	public void setContactusModulePhoneNumber(String contactusModulePhoneNumber) {
		this.contactusModulePhoneNumber = contactusModulePhoneNumber;
	}
	/**
	 * @return the contactUsModuleAvailableStartDate
	 */
	public String getContactUsModuleAvailableStartDate() {
		return contactUsModuleAvailableStartDate;
	}
	/**
	 * @param contactUsModuleAvailableStartDate the contactUsModuleAvailableStartDate to set
	 */
	public void setContactUsModuleAvailableStartDate(String contactUsModuleAvailableStartDate) {
		this.contactUsModuleAvailableStartDate = contactUsModuleAvailableStartDate;
	}
	/**
	 * @return the contactUsModuleAvailableEndDate
	 */
	public String getContactUsModuleAvailableEndDate() {
		return contactUsModuleAvailableEndDate;
	}
	/**
	 * @param contactUsModuleAvailableEndDate the contactUsModuleAvailableEndDate to set
	 */
	public void setContactUsModuleAvailableEndDate(String contactUsModuleAvailableEndDate) {
		this.contactUsModuleAvailableEndDate = contactUsModuleAvailableEndDate;
	}
	/**
	 * @return the contactUsModuleAvailableStartTime
	 */
	public String getContactUsModuleAvailableStartTime() {
		return contactUsModuleAvailableStartTime;
	}
	/**
	 * @param contactUsModuleAvailableStartTime the contactUsModuleAvailableStartTime to set
	 */
	public void setContactUsModuleAvailableStartTime(String contactUsModuleAvailableStartTime) {
		this.contactUsModuleAvailableStartTime = contactUsModuleAvailableStartTime;
	}
	/**
	 * @return the contactUsModuleAvailableEndTime
	 */
	public String getContactUsModuleAvailableEndTime() {
		return contactUsModuleAvailableEndTime;
	}
	/**
	 * @param contactUsModuleAvailableEndTime the contactUsModuleAvailableEndTime to set
	 */
	public void setContactUsModuleAvailableEndTime(String contactUsModuleAvailableEndTime) {
		this.contactUsModuleAvailableEndTime = contactUsModuleAvailableEndTime;
	}
	
	
	
	

}
