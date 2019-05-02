package com.ford.fcsd.fordprotect.api.contract.request;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetContractCoverageRequest {
	
	@JsonProperty("ApplicationName")
	private String applicationName;
	
	@JsonProperty("VIN")
	private String vin;
	
	@JsonProperty("RODate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone="Brazil/East")
	private Date roDate;
	
	@JsonProperty("AOR")
	private String aor;
	
	@JsonProperty("Country")
	private String country;
	
	@JsonProperty("PolicyID")
	private String policyID;
	
	@JsonProperty("ContractId")
	private String contractId;
	
	@JsonProperty("CoverageId")
    private String coverageId;

}