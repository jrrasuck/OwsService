package com.ford.fcsd.fordprotect.api.contract;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TransactionInfo {

	@JsonProperty("ContractStatus")
	private String ContractStatus;
	
	@JsonProperty("EffDate")
	private String effDate;
	
	@JsonProperty("EffDistance")
	private Long effDistance;
	
	@JsonProperty("CreateTime")
	private String createTime;
	
	@JsonProperty("PACode")
	private String paCode;
	
	@JsonProperty("SubPACode")
	private String subPaCode;

	public String getContractStatus() {
		return ContractStatus;
	}

	public void setContractStatus(String contractStatus) {
		ContractStatus = contractStatus;
	}

	public String getEffDate() {
		return effDate;
	}

	public void setEffDate(String effDate) {
		this.effDate = effDate;
	}

	public Long getEffDistance() {
		return effDistance;
	}

	public void setEffDistance(Long effDistance) {
		this.effDistance = effDistance;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getPaCode() {
		return paCode;
	}

	public void setPaCode(String paCode) {
		this.paCode = paCode;
	}

	public String getSubPaCode() {
		return subPaCode;
	}

	public void setSubPaCode(String subPaCode) {
		this.subPaCode = subPaCode;
	}
	
}
