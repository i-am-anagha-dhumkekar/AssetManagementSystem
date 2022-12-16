package com.nissan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

@Entity
@Table(name="assetdefination")
public class AssetDefination {
	//instance variables / fields of table
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer assetDefinationId;
	@Pattern(regexp = "^[a-zA-Z]{5,25}$",
		    message = "assetDefinationName must be of 5 to 15 length with no special characters")
	private String assetDefinationName;
	private String assetDefinationClass;
	private Integer assetId;
	@JoinColumn(name="assetId",insertable=false,updatable=false)
	@ManyToOne
	private AssetType assetType;
	//default constructor
	public AssetDefination() {
		super();
		// TODO Auto-generated constructor stub
	}
	//parameterized constructor
	public AssetDefination(Integer assetDefinationId, String assetDefinationName, String assetDefinationClass,
			Integer assetId, AssetType assetType) {
		super();
		this.assetDefinationId = assetDefinationId;
		this.assetDefinationName = assetDefinationName;
		this.assetDefinationClass = assetDefinationClass;
		this.assetId = assetId;
		this.assetType = assetType;
	}
	//getters and setters
	public Integer getAssetDefinationId() {
		return assetDefinationId;
	}
	public void setAssetDefinationId(Integer assetDefinationId) {
		this.assetDefinationId = assetDefinationId;
	}
	public String getAssetDefinationName() {
		return assetDefinationName;
	}
	public void setAssetDefinationName(String assetDefinationName) {
		this.assetDefinationName = assetDefinationName;
	}
	public String getAssetDefinationClass() {
		return assetDefinationClass;
	}
	public void setAssetDefinationClass(String assetDefinationClass) {
		this.assetDefinationClass = assetDefinationClass;
	}
	public Integer getAssetId() {
		return assetId;
	}
	public void setAssetId(Integer assetId) {
		this.assetId = assetId;
	}
	public AssetType getAssetType() {
		return assetType;
	}
	public void setAssetType(AssetType assetType) {
		this.assetType = assetType;
	}
	//to String
	@Override
	public String toString() {
		return "AssetDefination [assetDefinationId=" + assetDefinationId + ", assetDefinationName="
				+ assetDefinationName + ", assetDefinationClass=" + assetDefinationClass + ", assetId=" + assetId
				+ ", assetType=" + assetType + "]";
	}
	
}
