package com.nissan.dao;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.nissan.model.Vendor;

public interface VendorDAO extends JpaRepositoryImplementation<Vendor, Integer> {

}
