/**
 * 
 */
package com.spboot.contactus.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spboot.contactus.beans.ContactUsDetails;

/**
 * @author 717684
 *
 */
@Repository
@Transactional
public interface ContactUsModuleRepo extends JpaRepository<ContactUsDetails, Integer>{

}
