package restAssuredTests;

import org.junit.Assert;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class createBoards {

	String APIKey = "72996007b0ec2a3edbcf73cbe18efda2";
	String oATHtoken = "ATTAb323cdcb71c48d67c24221966231851f28c4d3bfd88153f79fe6d8b255d66db2DB3CF72E";
	String boardName = "restAssuredBoard";
	
	@Test
	public void createBoard() {
		
		// set the base URL
		RestAssured.baseURI = "https://api.trello.com/1/boards";

		// create request object
		RequestSpecification httpRequest = RestAssured.given();
		
		httpRequest.header("Content-Type", "application/json");
		
		Response myResponse = httpRequest.post(RestAssured.baseURI+"/?name="+boardName+"&key="+ APIKey +"&token="+oATHtoken);
		
		int statusCode = myResponse.getStatusCode();
		
		Assert.assertEquals(200, statusCode);
		System.out.println("The test passed and board was created "+ statusCode);
		
	}
	
}
