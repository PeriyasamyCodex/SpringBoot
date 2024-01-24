package com.spboot.retirement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spboot.retirement.beans.ContactUsDetails;
import com.spboot.retirement.beans.RetirementModules;
import com.spboot.retirement.repository.RetirementModulesRepo;

@Service
public class RetirementModulesService {

	@Autowired
	RetirementModulesRepo retirementModulesRepo;

	@Autowired
	ContactUsServiceProxy contactUsServiceProxy;

	public List<RetirementModules> getAllModules() {

		List<RetirementModules> retirementModulesList = retirementModulesRepo.findAll();

		for (RetirementModules retirementModules : retirementModulesList) {

			ContactUsDetails contactUsDetails = contactUsServiceProxy.getContactInfo(retirementModules.getContactId());

			if (contactUsDetails != null) {
				
				System.out.println("Hurrreyyy!! Got Contact Details"+contactUsDetails);
				retirementModules.setContactUsDetails(contactUsDetails);

			}

		}

		return retirementModulesList;

	}

}
