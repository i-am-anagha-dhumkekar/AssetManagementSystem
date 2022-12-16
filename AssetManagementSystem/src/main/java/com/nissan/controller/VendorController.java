package com.nissan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nissan.model.Vendor;
import com.nissan.service.VendorService;

@CrossOrigin
@RestController
@RequestMapping({"api/"})
public class VendorController {
	@Autowired
	VendorService vendorService;
	
	@GetMapping("vendors")
	public List<Vendor> getAllVendors()
	{
		return vendorService.getAllVendors();
	}
	@GetMapping("vendors/{id}")
	public Vendor searchVendor(@PathVariable Integer id)
	{
		return vendorService.searchVendor(id);
	}
	@PostMapping("vendors")
	public Vendor addvendor(@RequestBody Vendor vendor)
	{
		return vendorService.addVendor(vendor);
	}
	@PutMapping("vendors/{id}")
	public Vendor updateVendor(@RequestBody Vendor vendor,@PathVariable Integer id)
	{
		return vendorService.updateVendor(vendor, id);
	}
	@DeleteMapping("vendors/{id}")
	public void deleteVendor(@PathVariable Integer id)
	{
		vendorService.delete(id);
	}
}
