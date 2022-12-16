package com.nissan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nissan.dao.AssetsDAO;
import com.nissan.model.AssetDefination;

@Service
public class AssetServiceImplementation implements AssetService{
	@Autowired
	AssetsDAO assetDao;
	@Override
	public List<AssetDefination> getAllAssets() {
		return assetDao.findAll();
	}

	@Override
	public AssetDefination getAssetById(Integer id) {
		return assetDao.findById(id).get();
	}

	@Override
	public AssetDefination addAssest(AssetDefination asset) {
		return assetDao.save(asset);
	}

	@Override
	public AssetDefination updateAsset(AssetDefination asset,Integer id) {
		return assetDao.save(asset);
	}

	@Override
	public void deleteAsset(Integer id) {
		assetDao.deleteById(id);
	}

}
