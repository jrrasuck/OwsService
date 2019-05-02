package com.ford.fcsd.fordprotect.api.contract;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ServiceStatus {
	
	@JsonProperty("StatusCode")
	private String statusCode;
	
	@JsonProperty("StatusMessage")
	private String statusMessage;

}
