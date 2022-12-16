package com.nissan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

@Entity
@Table(name="vendor")
public class Vendor {
	//instance variable / fields of columns
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer vendorId;
	@NotNull
	@Size(min=2,max=100)
	private String vendorName;
	@NotNull
	@Size(min=5,max=40)
	private String vendorType;
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	private DateTime fromVendorDate;
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	private DateTime toVendorDate;
	private Integer assetId;
	@NotNull
	@Size(min=6,max=200)
	private String vendorAddress;
	@JoinColumn(name="assetId",insertable=false,updatable=false)
	@ManyToOne
	private AssetType assetType;
	//default constructor
	public Vendor() {
		super();
		// TODO Auto-generated constructor stub
	}
	//parameterized constructor
	public Vendor(Integer vendorId, @NotNull @Size(min = 6, max = 100) String vendorName,
			@NotNull @Size(min = 6, max = 40) String vendorType, DateTime fromVendorDate, DateTime toVendorDate,
			Integer assetId, @NotNull @Size(min = 6, max = 200) String vendorAddress) {
		super();
		this.vendorId = vendorId;
		this.vendorName = vendorName;
		this.vendorType = vendorType;
		this.fromVendorDate = fromVendorDate;
		this.toVendorDate = toVendorDate;
		this.assetId = assetId;
		this.vendorAddress = vendorAddress;
	}
	//getters and setters
	public Integer getVendorId() {
		return vendorId;
	}
	public void setVendorId(Integer vendorId) {
		this.vendorId = vendorId;
	}
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	public String getVendorType() {
		return vendorType;
	}
	public void setVendorType(String vendorType) {
		this.vendorType = vendorType;
	}
	public DateTime getFromVendorDate() {
		return fromVendorDate;
	}
	public void setFromVendorDate(DateTime fromVendorDate) {
		this.fromVendorDate = fromVendorDate;
	}
	public DateTime getToVendorDate() {
		return toVendorDate;
	}
	public void setToVendorDate(DateTime toVendorDate) {
		this.toVendorDate = toVendorDate;
	}
	public Integer getAssetId() {
		return assetId;
	}
	public void setAssetId(Integer assetId) {
		this.assetId = assetId;
	}
	public String getVendorAddress() {
		return vendorAddress;
	}
	public void setVendorAddress(String vendorAddress) {
		this.vendorAddress = vendorAddress;
	}
	//to String
	@Override
	public String toString() {
		return "Vendor [vendorId=" + vendorId + ", vendorName=" + vendorName + ", vendorType=" + vendorType
				+ ", fromVendorDate=" + fromVendorDate + ", toVendorDate=" + toVendorDate + ", assetId=" + assetId
				+ ", vendorAddress=" + vendorAddress + "]";
	}
	
	
}
