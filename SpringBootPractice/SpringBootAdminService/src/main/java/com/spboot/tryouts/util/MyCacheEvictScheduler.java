package com.spboot.tryouts.util;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MyCacheEvictScheduler {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(MyCacheEvictScheduler.class);

	@Autowired
	MyCacheEvict cacheEvict;
	
	@Scheduled(fixedDelay=60000)
	public void clearCache() {
		
		LOGGER.info("Clearing Cache....");
		
		cacheEvict.evictAllCustomerCache();
		cacheEvict.evictAllEmployeeCache();
		
		
	}
	
	
}
