package com.ford.fcsd.fordprotect.application.contract;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ford.fcsd.fordprotect.api.contract.ApplicablePolicyInfo;
import com.ford.fcsd.fordprotect.api.contract.ComponentInfo;
import com.ford.fcsd.fordprotect.api.contract.ConnectionStatus;
import com.ford.fcsd.fordprotect.api.contract.ContractCoverageList;
import com.ford.fcsd.fordprotect.api.contract.ProductInfo;
import com.ford.fcsd.fordprotect.api.contract.request.GetContractRequestRoot;
import com.ford.fcsd.fordprotect.api.contract.response.GetContractListResponse;
import com.ford.fcsd.fordprotect.api.contract.response.GetContractResponseRoot;
import com.ford.fcsd.fordprotect.application.exceptionhandler.VinExpectedSizeException;

@RestController
@RequestMapping(path = "/api/contracts")
public class ContractController {

	private static final Logger logger = LoggerFactory.getLogger(ContractController.class);

	@Autowired
	private ContractRepository repository;
	
	@PostMapping("/")
	public GetContractResponseRoot getContract(@RequestBody @Valid GetContractRequestRoot request) {
		
		if (request.getContractListRequest() != null) {

			logger.info("Contract List Request: " + request.getContractListRequest());
//			contractResponseRoot = repository.getContract();
			if ((request.getContractListRequest().getVin() != null) 
					&& request.getContractListRequest().getVin().length() != 17) {
				throw new VinExpectedSizeException();
			}
			return create();
		} else {

			logger.info("Contract Coverage Request: " + request.getContractCoverageRequest());
			repository.getContract();
			return null;
		}
	}
	
	private GetContractResponseRoot create() {
		
		GetContractResponseRoot contractResponseRoot = new GetContractResponseRoot();
		
		GetContractListResponse contractListResponse = new GetContractListResponse();
		
		ConnectionStatus connectionStatus = new ConnectionStatus();
		connectionStatus.setMessage("SUCCESS");
		
		ContractCoverageList contractCoverageList = new ContractCoverageList();
		
		ApplicablePolicyInfo applicablePolicyInfo = new ApplicablePolicyInfo();
		applicablePolicyInfo.setCountry("BRA");
		applicablePolicyInfo.setPolicyId(1);
		applicablePolicyInfo.setState("SP");
		applicablePolicyInfo.setVin("3FADP4BE0GM100030");
		
		ProductInfo productInfo = new ProductInfo();
		productInfo.setContractId(10);

		ComponentInfo componentInfo = new ComponentInfo();
		componentInfo.setCoverageId("ABCD");
		
		List<ComponentInfo> listComponentInfo = new ArrayList<>();
		listComponentInfo.add(componentInfo);
		
		productInfo.setListComponentInfo(listComponentInfo);
		
		applicablePolicyInfo.setProductInfo(productInfo);
		
		List<ApplicablePolicyInfo> listApplicablePolicyInfo = new ArrayList<>();
		listApplicablePolicyInfo.add(applicablePolicyInfo);
		
		contractCoverageList.setListApplicablePolicyInfo(listApplicablePolicyInfo);
		
		contractListResponse.setContractCoverageList(contractCoverageList);
		
		contractListResponse.setConnectionStatus(connectionStatus);
		
		contractResponseRoot.setContractListResponse(contractListResponse);
		
		return contractResponseRoot;
	}

}