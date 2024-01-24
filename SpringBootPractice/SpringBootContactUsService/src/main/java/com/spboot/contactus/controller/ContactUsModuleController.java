package com.spboot.contactus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spboot.contactus.beans.ContactUsDetails;
import com.spboot.contactus.service.ContactUsModuleService;

@RestController
public class ContactUsModuleController {

	@Autowired
	private ContactUsModuleService contactUsModuleService;
	
	@RequestMapping(value="/listContacts")
	public List<ContactUsDetails> getAllContacts() {
		
		return contactUsModuleService.getAllContacts();
		
	}
	
	@RequestMapping(value="/getContact")
	public ContactUsDetails getContactsById(@RequestParam int contactId) {
		
		return contactUsModuleService.getContactsById(contactId);
		
	}
	
	
}
