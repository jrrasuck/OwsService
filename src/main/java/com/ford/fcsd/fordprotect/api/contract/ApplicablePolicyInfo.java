package com.ford.fcsd.fordprotect.api.contract;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ApplicablePolicyInfo {
	
	@JsonProperty("VIN")
	private String vin;
	
	@JsonProperty("Country")
	private String country;
	
	@JsonProperty("State")
	private String state;
	
	@JsonProperty("PolicyId")
	private Integer policyId;
	
	@JsonProperty("ProductInfo")
	private ProductInfo productInfo;

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getPolicyId() {
		return policyId;
	}

	public void setPolicyId(Integer policyId) {
		this.policyId = policyId;
	}

	public ProductInfo getProductInfo() {
		return productInfo;
	}

	public void setProductInfo(ProductInfo productInfo) {
		this.productInfo = productInfo;
	}
	
}
