package com.spboot.tryouts.util;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Component;

@Component
public class MyCacheEvict {
	
	@CacheEvict(cacheNames="employeecache",allEntries=true)
	public void evictAllEmployeeCache() {
		
		
	}
	
	
	@CacheEvict(cacheNames="customercache",allEntries=true)
	public void evictAllCustomerCache() {
		
		
	}
	

}
