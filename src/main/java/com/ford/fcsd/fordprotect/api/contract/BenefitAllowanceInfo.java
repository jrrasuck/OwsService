package com.ford.fcsd.fordprotect.api.contract;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BenefitAllowanceInfo {
	
	@JsonProperty("ElementType")
	private String elementType;
	
	@JsonProperty("Unit")
	private String unit;
	
	@JsonProperty("ElementAmt")
	private Float elementAmount;
	
	@JsonProperty("AmtRemaining")
	private Long amountRemaining;

	public String getElementType() {
		return elementType;
	}

	public void setElementType(String elementType) {
		this.elementType = elementType;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public Float getElementAmount() {
		return elementAmount;
	}

	public void setElementAmount(Float elementAmount) {
		this.elementAmount = elementAmount;
	}

	public Long getAmountRemaining() {
		return amountRemaining;
	}

	public void setAmountRemaining(Long amountRemaining) {
		this.amountRemaining = amountRemaining;
	}
	
}
