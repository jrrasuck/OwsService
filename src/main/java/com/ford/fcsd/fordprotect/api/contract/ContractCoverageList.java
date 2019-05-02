package com.ford.fcsd.fordprotect.api.contract;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ContractCoverageList {
	
	@JsonProperty("ApplicablePolicyInfo")
	private List<ApplicablePolicyInfo> listApplicablePolicyInfo;

	public List<ApplicablePolicyInfo> getListApplicablePolicyInfo() {
		return listApplicablePolicyInfo;
	}

	public void setListApplicablePolicyInfo(List<ApplicablePolicyInfo> listApplicablePolicyInfo) {
		this.listApplicablePolicyInfo = listApplicablePolicyInfo;
	}
	
}
