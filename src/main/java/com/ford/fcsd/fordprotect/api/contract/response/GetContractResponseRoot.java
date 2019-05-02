package com.ford.fcsd.fordprotect.api.contract.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetContractResponseRoot {
	
	@JsonProperty("GetContractListResponse")
	private GetContractListResponse contractListResponse;
	
	@JsonProperty("GetContractCoverageResponse")
	private GetContractCoverageResponse contractCoverageResponse;

	public GetContractListResponse getContractListResponse() {
		return contractListResponse;
	}

	public void setContractListResponse(GetContractListResponse contractListResponse) {
		this.contractListResponse = contractListResponse;
	}

	public GetContractCoverageResponse getContractCoverageResponse() {
		return contractCoverageResponse;
	}

	public void setContractCoverageResponse(GetContractCoverageResponse contractCoverageResponse) {
		this.contractCoverageResponse = contractCoverageResponse;
	}
	
}
