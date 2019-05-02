package com.ford.fcsd.fordprotect.api.contract.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ford.fcsd.fordprotect.api.contract.ConnectionStatus;
import com.ford.fcsd.fordprotect.api.contract.ContractCoverageList;

public class GetContractCoverageResponse {
	
	@JsonProperty("ConnectionStatus")
	private ConnectionStatus connectionStatus;
	
	@JsonProperty("ContractCoverageList")
	private ContractCoverageList contractCoverageList;

	public ConnectionStatus getConnectionStatus() {
		return connectionStatus;
	}

	public void setConnectionStatus(ConnectionStatus connectionStatus) {
		this.connectionStatus = connectionStatus;
	}

	public ContractCoverageList getContractCoverageList() {
		return contractCoverageList;
	}

	public void setContractCoverageList(ContractCoverageList contractCoverageList) {
		this.contractCoverageList = contractCoverageList;
	}
	
}
