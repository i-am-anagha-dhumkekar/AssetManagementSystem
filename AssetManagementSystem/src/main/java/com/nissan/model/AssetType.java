package com.nissan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="assettype")
public class AssetType {
	//instance variables / table column fields
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer assetId;
	@Column(nullable=false)
	private String assetType;
	//default constructor
	public AssetType() {
		super();
		// TODO Auto-generated constructor stub
	}
	//parameterized constructor
	public AssetType(Integer assetId, String assetType) {
		super();
		this.assetId = assetId;
		this.assetType = assetType;
	}
	//getters and setters
	public Integer getAssetId() {
		return assetId;
	}
	public void setAssetId(Integer assetId) {
		this.assetId = assetId;
	}
	public String getAssetType() {
		return assetType;
	}
	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}
	//to String
	@Override
	public String toString() {
		return "AssetType [assetId=" + assetId + ", assetType=" + assetType + "]";
	}
	
	
}
