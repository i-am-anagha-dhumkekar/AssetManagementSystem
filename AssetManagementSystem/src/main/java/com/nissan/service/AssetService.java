package com.nissan.service;

import java.util.List;

import com.nissan.model.AssetDefination;

public interface AssetService {
	//get all asset defination
	List<AssetDefination> getAllAssets();
	//get asset by id / search
	AssetDefination getAssetById(Integer id);
	//add new asset 
	AssetDefination addAssest(AssetDefination asset);
	//update asset
	AssetDefination updateAsset(AssetDefination asset,Integer id);
	//delete asset
	void deleteAsset(Integer id);
}
