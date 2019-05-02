package com.ford.fcsd.fordprotect.api.contract;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FleetInfo {

	@JsonProperty("Branch")
	private Short branch;
	
	@JsonProperty("Code")
	private Short code;
	
	@JsonProperty("Unit")
	private String unit;
	
	@JsonProperty("MaxRepairAuthAmt")
	private Long maxRepairAuthAmount;

	public Short getBranch() {
		return branch;
	}

	public void setBranch(Short branch) {
		this.branch = branch;
	}

	public Short getCode() {
		return code;
	}

	public void setCode(Short code) {
		this.code = code;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public Long getMaxRepairAuthAmount() {
		return maxRepairAuthAmount;
	}

	public void setMaxRepairAuthAmount(Long maxRepairAuthAmount) {
		this.maxRepairAuthAmount = maxRepairAuthAmount;
	}
	
}
