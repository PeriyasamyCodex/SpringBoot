package com.spboot.tryouts.repository;



import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spboot.tryouts.bean.Employee;

@Repository
@Transactional
public interface EmployeeRepo extends CrudRepository<Employee, Integer>{

}
