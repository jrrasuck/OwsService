package com.ford.fcsd.fordprotect.api.contract.request;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

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
public class GetContractListRequest {

	@NotEmpty
	@JsonProperty("ApplicationName")
	private String applicationName;

	@NotEmpty
	@Size(min=17, max=17)
	@JsonProperty("VIN")
	private String vin;

	@NotNull
	@JsonProperty("RODate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone="Brazil/East")
	private Date roDate;

	@NotEmpty
	@JsonProperty("AOR")
	private String aor;

	@NotEmpty
	@JsonProperty("Country")
	private String country;

}