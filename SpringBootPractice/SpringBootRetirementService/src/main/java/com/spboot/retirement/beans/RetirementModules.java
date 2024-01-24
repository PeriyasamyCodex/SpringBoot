/**
 * 
 */
package com.spboot.retirement.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * @author 717684
 *
 */
@Entity
@Table(name="RETIREMENTMODULES")
@SequenceGenerator(name="RETIRE_SEQ",sequenceName="RETIRE_SEQ")
public class RetirementModules {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="RETIRE_SEQ")
	private int moduleId;
	private String moduleName;
	private String moduleDesc;
	private String moduleAvailability;
	
	private int contactId;
	
	@Transient
	private ContactUsDetails contactUsDetails; 
	
	
	
	
	
	
	/**
	 * @return the contactId
	 */
	public int getContactId() {
		return contactId;
	}
	/**
	 * @param contactId the contactId to set
	 */
	public void setContactId(int contactId) {
		this.contactId = contactId;
	}
	/**
	 * @return the contactUsDetails
	 */
	public ContactUsDetails getContactUsDetails() {
		return contactUsDetails;
	}
	/**
	 * @param contactUsDetails the contactUsDetails to set
	 */
	public void setContactUsDetails(ContactUsDetails contactUsDetails) {
		this.contactUsDetails = contactUsDetails;
	}
	/**
	 * @return the moduleId
	 */
	public int getModuleId() {
		return moduleId;
	}
	/**
	 * @param moduleId the moduleId to set
	 */
	public void setModuleId(int moduleId) {
		this.moduleId = moduleId;
	}
	/**
	 * @return the moduleName
	 */
	public String getModuleName() {
		return moduleName;
	}
	/**
	 * @param moduleName the moduleName to set
	 */
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	/**
	 * @return the moduleDesc
	 */
	public String getModuleDesc() {
		return moduleDesc;
	}
	/**
	 * @param moduleDesc the moduleDesc to set
	 */
	public void setModuleDesc(String moduleDesc) {
		this.moduleDesc = moduleDesc;
	}
	/**
	 * @return the moduleAvailability
	 */
	public String getModuleAvailability() {
		return moduleAvailability;
	}
	/**
	 * @param moduleAvailability the moduleAvailability to set
	 */
	public void setModuleAvailability(String moduleAvailability) {
		this.moduleAvailability = moduleAvailability;
	}
	
	
	
	
	

}
