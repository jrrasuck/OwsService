package com.ford.fcsd.fordprotect.application.contract;

import static org.hamcrest.CoreMatchers.equalTo;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

import io.restassured.RestAssured;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
public class ContractControllerTest {

	@LocalServerPort
	private int serverPort;
	
	@Before
	public void setup() {
		RestAssured.port = serverPort;
	}
	
	@Test
	public void testApplicationNameVazio() {
		
		String json = "{\n" + 
				"   \"GetContractListRequest\": {\n" + 
				"      \"ApplicationName\": \"\",\n" + 
				"      \"VIN\": \"3FADP4BE0GM100030\",\n" + 
				"      \"RODate\": \"2016-12-01\",\n" + 
				"      \"AOR\": \"SA\",\n" + 
				"      \"Country\": \"BRA\"\n" + 
				"   }\n" + 
				"}";
		
		RestAssured.given().body(json).contentType("application/json")
		.when()
			.post("/api/contracts/")
		.then()
			.statusCode(400)
        	.assertThat()
        	.body("messageNotTranslated"
        			, equalTo("contractListRequest.applicationName_NotEmpty"));
		
	}
	
	@Test
	public void testRoDateVazio() {
		
		String json = "{\n" + 
				"   \"GetContractListRequest\": {\n" + 
				"      \"ApplicationName\": \"OWS\",\n" + 
				"      \"VIN\": \"3FADP4BE0GM100030\",\n" + 
				"      \"RODate\": \"\",\n" + 
				"      \"AOR\": \"SA\",\n" + 
				"      \"Country\": \"BRA\"\n" + 
				"   }\n" + 
				"}";
		
		RestAssured.given().body(json).contentType("application/json")
		.when()
			.post("/api/contracts/")
		.then()
			.statusCode(400)
        	.assertThat()
        	.body("messageNotTranslated"
        			, equalTo("contractListRequest.roDate_NotNull"));
		
	}
	
	@Test
	public void testVinDiferenteDe17Caracteres() {
		
		//3FADP4BE0GM100030
		String json = "{\n" + 
				"   \"GetContractListRequest\": {\n" + 
				"      \"ApplicationName\": \"OWS\",\n" + 
				"      \"VIN\": \"3FADP4BE0GM10003\",\n" + 
				"      \"RODate\": \"\",\n" + 
				"      \"AOR\": \"SA\",\n" + 
				"      \"Country\": \"BRA\"\n" + 
				"   }\n" + 
				"}";
		
		RestAssured.given().body(json).contentType("application/json")
		.when()
			.post("/api/contracts/")
		.then()
			.statusCode(400)
        	.assertThat()
        	.body("messageNotTranslated"
        			, equalTo("contractListRequest.vin_Size"));
		
	}
	
}
