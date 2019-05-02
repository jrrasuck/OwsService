package com.ford.fcsd.fordprotect.api.contract;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductInfo {
	
	@JsonProperty("ContractId")
	private Integer contractId;
	
	@JsonProperty("ProductName")
	private String productName;
	
	@JsonProperty("ProductStartDate")
	private String productStartDate;
	
	@JsonProperty("ProductEndDate")
	private String productEndDate;
	
	@JsonProperty("ProductTerm")
	private Integer productTerm;
	
	@JsonProperty("ProductDistance")
	private Long productDistance;
	
	@JsonProperty("DeductibleAmount")
	private Float deductibleAmount;
	
	@JsonProperty("TackOnAdjustedDate")
	private String tackOnAdjustedDate;
	
	@JsonProperty("TackOnAdjustedDistance")
	private Long tackOnAdjustedDistance;
	
	@JsonProperty("FleetInfo")
	private FleetInfo fleetInfo;
	
	@JsonProperty("ComponentInfo")
	private List<ComponentInfo> listComponentInfo;
	
	@JsonProperty("TransactionInfo")
	private List<TransactionInfo> listTransactionInfo;
	
	public Integer getContractId() {
		return contractId;
	}

	public void setContractId(Integer contractId) {
		this.contractId = contractId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductStartDate() {
		return productStartDate;
	}

	public void setProductStartDate(String productStartDate) {
		this.productStartDate = productStartDate;
	}

	public String getProductEndDate() {
		return productEndDate;
	}

	public void setProductEndDate(String productEndDate) {
		this.productEndDate = productEndDate;
	}

	public Integer getProductTerm() {
		return productTerm;
	}

	public void setProductTerm(Integer productTerm) {
		this.productTerm = productTerm;
	}

	public Long getProductDistance() {
		return productDistance;
	}

	public void setProductDistance(Long productDistance) {
		this.productDistance = productDistance;
	}

	public Float getDeductibleAmount() {
		return deductibleAmount;
	}

	public void setDeductibleAmount(Float deductibleAmount) {
		this.deductibleAmount = deductibleAmount;
	}

	public String getTackOnAdjustedDate() {
		return tackOnAdjustedDate;
	}

	public void setTackOnAdjustedDate(String tackOnAdjustedDate) {
		this.tackOnAdjustedDate = tackOnAdjustedDate;
	}

	public Long getTackOnAdjustedDistance() {
		return tackOnAdjustedDistance;
	}

	public void setTackOnAdjustedDistance(Long tackOnAdjustedDistance) {
		this.tackOnAdjustedDistance = tackOnAdjustedDistance;
	}

	public FleetInfo getFleetInfo() {
		return fleetInfo;
	}

	public void setFleetInfo(FleetInfo fleetInfo) {
		this.fleetInfo = fleetInfo;
	}

	public List<ComponentInfo> getListComponentInfo() {
		return listComponentInfo;
	}

	public void setListComponentInfo(List<ComponentInfo> listComponentInfo) {
		this.listComponentInfo = listComponentInfo;
	}

	public List<TransactionInfo> getListTransactionInfo() {
		return listTransactionInfo;
	}

	public void setListTransactionInfo(List<TransactionInfo> listTransactionInfo) {
		this.listTransactionInfo = listTransactionInfo;
	}
	
	/*
	 * nota item
	 * 1 1
	 * 1 2
	 * 1 3
	 * 2 1
	 * 2 2
	 * 2 3
	 */
	
}
