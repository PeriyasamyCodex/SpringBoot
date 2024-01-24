package com.spboot.retirement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spboot.retirement.beans.RetirementModules;
import com.spboot.retirement.service.RetirementModulesService;

@RestController
public class RetirementModulesController {

	@Autowired
	private RetirementModulesService retirementService;

	@RequestMapping(value = "/listModules",method=RequestMethod.GET)
	public List<RetirementModules> getAllModules() {

		return retirementService.getAllModules();

	}

}
