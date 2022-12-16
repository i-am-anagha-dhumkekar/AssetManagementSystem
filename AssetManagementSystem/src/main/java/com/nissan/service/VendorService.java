package com.nissan.service;

import java.util.List;

import com.nissan.model.Vendor;

public interface VendorService {
	//get all vendors
	List<Vendor> getAllVendors();
	//search vendor
	Vendor searchVendor(Integer id);
	//add vendor
	Vendor addVendor(Vendor vendor);
	//update vendor
	Vendor updateVendor(Vendor vendor,Integer id);
	//delete vendor
	void delete(Integer id);
}
