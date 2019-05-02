package com.ford.fcsd.fordprotect.api.contract;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ComponentInfo {
	
	@JsonProperty("CoverageId")
	private String coverageId;
	
	@JsonProperty("CoverageName")
	private String coverageName;
	
	@JsonProperty("CoverageStartDate")
	private String coverageStartDate;
	
	@JsonProperty("CoverageEndDate")
	private String coverageEndDate;
	
	@JsonProperty("CoverageTerm")
	private Integer coverageTerm;
	
	@JsonProperty("CoverageDistance")
	private Long coverageDistance;
	
	@JsonProperty("CoverageTermUnit")
	private String coverageTermUnit;
	
	@JsonProperty("CoverageDistanceUnit")
	private String coverageDistanceUnit;
	
	@JsonProperty("ServiceMaintenanceClaimsAllowed")
	private Integer serviceMaintenanceClaimsAllowed;
	
	@JsonProperty("PartsCoverageCode")
	private String partsCoverageCode;
	
	@JsonProperty("ChargeDeductible")
	private String chargeDeductible;
	
	@JsonProperty("BenefitAllowanceInfo")
	private BenefitAllowanceInfo benefitAllowanceInfo;
	
	public String getCoverageId() {
		return coverageId;
	}

	public void setCoverageId(String coverageId) {
		this.coverageId = coverageId;
	}

	public String getCoverageName() {
		return coverageName;
	}

	public void setCoverageName(String coverageName) {
		this.coverageName = coverageName;
	}

	public String getCoverageStartDate() {
		return coverageStartDate;
	}

	public void setCoverageStartDate(String coverageStartDate) {
		this.coverageStartDate = coverageStartDate;
	}

	public String getCoverageEndDate() {
		return coverageEndDate;
	}

	public void setCoverageEndDate(String coverageEndDate) {
		this.coverageEndDate = coverageEndDate;
	}

	public Integer getCoverageTerm() {
		return coverageTerm;
	}

	public void setCoverageTerm(Integer coverageTerm) {
		this.coverageTerm = coverageTerm;
	}

	public Long getCoverageDistance() {
		return coverageDistance;
	}

	public void setCoverageDistance(Long coverageDistance) {
		this.coverageDistance = coverageDistance;
	}

	public String getCoverageTermUnit() {
		return coverageTermUnit;
	}

	public void setCoverageTermUnit(String coverageTermUnit) {
		this.coverageTermUnit = coverageTermUnit;
	}

	public String getCoverageDistanceUnit() {
		return coverageDistanceUnit;
	}

	public void setCoverageDistanceUnit(String coverageDistanceUnit) {
		this.coverageDistanceUnit = coverageDistanceUnit;
	}

	public Integer getServiceMaintenanceClaimsAllowed() {
		return serviceMaintenanceClaimsAllowed;
	}

	public void setServiceMaintenanceClaimsAllowed(Integer serviceMaintenanceClaimsAllowed) {
		this.serviceMaintenanceClaimsAllowed = serviceMaintenanceClaimsAllowed;
	}

	public String getPartsCoverageCode() {
		return partsCoverageCode;
	}

	public void setPartsCoverageCode(String partsCoverageCode) {
		this.partsCoverageCode = partsCoverageCode;
	}

	public String getChargeDeductible() {
		return chargeDeductible;
	}

	public void setChargeDeductible(String chargeDeductible) {
		this.chargeDeductible = chargeDeductible;
	}
	
}
