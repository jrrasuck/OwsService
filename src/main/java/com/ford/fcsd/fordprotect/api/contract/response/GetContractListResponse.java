package com.ford.fcsd.fordprotect.api.contract.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.ford.fcsd.fordprotect.api.contract.ConnectionStatus;
import com.ford.fcsd.fordprotect.api.contract.ContractCoverageList;
import com.ford.fcsd.fordprotect.api.contract.ServiceStatus;

@JsonPropertyOrder({ "ConnectionStatus", "ServiceStatus", "ContractCoverageList" })
public class GetContractListResponse {
	
	@JsonProperty("ConnectionStatus")
	private ConnectionStatus connectionStatus;
	
	@JsonProperty("ContractCoverageList")
	private ContractCoverageList contractCoverageList;
	
	@JsonProperty("ServiceStatus")
	private ServiceStatus serviceStatus;

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

	public ServiceStatus getServiceStatus() {
		return serviceStatus;
	}

	public void setServiceStatus(ServiceStatus serviceStatus) {
		this.serviceStatus = serviceStatus;
	}
	
}