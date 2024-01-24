package com.spboot.tryouts.repository;



import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spboot.tryouts.bean.Customer;

@Repository
@Transactional
public interface CustomerRepo extends CrudRepository<Customer, Integer>{

}
