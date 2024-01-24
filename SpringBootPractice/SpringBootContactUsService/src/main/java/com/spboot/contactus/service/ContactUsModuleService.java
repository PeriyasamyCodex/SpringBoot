package com.spboot.contactus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spboot.contactus.beans.ContactUsDetails;
import com.spboot.contactus.repository.ContactUsModuleRepo;

@Service
public class ContactUsModuleService {
	
	@Autowired
	private ContactUsModuleRepo contactUsModuleRepo;
	
	public List<ContactUsDetails> getAllContacts() {
		
		return contactUsModuleRepo.findAll();
	}

	public ContactUsDetails getContactsById(int contactId) {
		
		return contactUsModuleRepo.findById(contactId).get();
	}

}
