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

import com.nissan.model.AssetDefination;
import com.nissan.service.AssetService;

@CrossOrigin
@RestController
@RequestMapping({"api/"})
public class AssetController {
	@Autowired
	AssetService assetService;
	//get all assets
	@GetMapping("assets")
	public List<AssetDefination> getAllAssets()
	{
		return assetService.getAllAssets();
	}
	//search asset
	@GetMapping("assets/{id}")
	public AssetDefination getAssetById(@PathVariable Integer id)
	{
		return assetService.getAssetById(id);
	}
	//add asset
	@PostMapping("assets")
	public AssetDefination addAsset(@RequestBody AssetDefination asset)
	{
		return assetService.addAssest(asset);
	}
	//update asset
	@PutMapping("assets/{id}")
	public AssetDefination updateAsset(@RequestBody AssetDefination asset,@PathVariable Integer id)
	{
		return assetService.updateAsset(asset, id);
		
	}
	//delete asset
	@DeleteMapping("assets/{id}")
	public void deleteAsset(@PathVariable Integer id)
	{
		assetService.deleteAsset(id);
	}
}
