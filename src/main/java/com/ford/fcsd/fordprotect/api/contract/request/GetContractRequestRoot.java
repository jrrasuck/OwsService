package com.ford.fcsd.fordprotect.api.contract.request;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetContractRequestRoot {
	
	@Valid
	@JsonProperty("GetContractListRequest")
	private GetContractListRequest contractListRequest;
	
	@JsonProperty("GetContractCoverageRequest")
	private GetContractCoverageRequest contractCoverageRequest;
	
	public GetContractListRequest getContractListRequest() {
		return contractListRequest;
	}

	public void setContractListRequest(GetContractListRequest contractListRequest) {
		this.contractListRequest = contractListRequest;
	}

	public GetContractCoverageRequest getContractCoverageRequest() {
		return contractCoverageRequest;
	}

	public void setContractCoverageRequest(GetContractCoverageRequest contractCoverageRequest) {
		this.contractCoverageRequest = contractCoverageRequest;
	}

	@Override
	public String toString() {
		return "GetContractRequestRoot [contractListRequest=" + contractListRequest + ", contractCoverageRequest="
				+ contractCoverageRequest + "]";
	}

}
