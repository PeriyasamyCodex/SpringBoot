package com.spboot.retirement.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spboot.retirement.beans.RetirementModules;

@Repository
@Transactional
public interface RetirementModulesRepo extends JpaRepository<RetirementModules, Integer>{

}
