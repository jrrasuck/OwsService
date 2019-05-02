package com.ford.fcsd.fordprotect.api.contract.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NoContractsFoundRootResponse {
	
	@JsonProperty("GetContractListResponse")
	private GetContractListResponse contractListResponse;

	public GetContractListResponse getContractListResponse() {
		return contractListResponse;
	}

	public void setContractListResponse(GetContractListResponse contractListResponse) {
		this.contractListResponse = contractListResponse;
	}
	
}