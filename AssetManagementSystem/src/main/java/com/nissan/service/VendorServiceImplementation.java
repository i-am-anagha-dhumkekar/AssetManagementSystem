package com.nissan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nissan.dao.VendorDAO;
import com.nissan.model.Vendor;

@Service
public class VendorServiceImplementation implements VendorService{
	@Autowired
	VendorDAO vendorDAO;
	@Override
	public List<Vendor> getAllVendors() {
		return vendorDAO.findAll();
	}

	@Override
	public Vendor searchVendor(Integer id) {
		return vendorDAO.findById(id).get();
	}

	@Override
	public Vendor addVendor(Vendor vendor) {

		return vendorDAO.save(vendor);
	}

	@Override
	public Vendor updateVendor(Vendor vendor, Integer id) {
	
		return vendorDAO.save(vendor);
	}

	@Override
	public void delete(Integer id) {
		vendorDAO.deleteById(id);
	}

}
