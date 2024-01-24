package com.spboot.retirement.service;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spboot.retirement.beans.ContactUsDetails;

@FeignClient(name="spring-boot-contactus-service")
@RibbonClient(name="spring-boot-contactus-service")
public interface ContactUsServiceProxy {
	
	@RequestMapping(value="/getContact")
	public ContactUsDetails getContactInfo(@RequestParam int contactId);

}
