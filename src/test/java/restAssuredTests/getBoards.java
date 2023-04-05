package restAssuredTests;

import org.junit.Assert;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class getBoards {

	String APIKey = "72996007b0ec2a3edbcf73cbe18efda2";

	String oATHtoken = "ATTAb323cdcb71c48d67c24221966231851f28c4d3bfd88153f79fe6d8b255d66db2DB3CF72E";

	@Test
	public void getBoards() {
		
		// set the base URL
		RestAssured.baseURI = "https://api.trello.com/1/members/me/boards";

		// create request object
		RequestSpecification httpRequest = RestAssured.given();
		
		Response myResponse = httpRequest.get(RestAssured.baseURI+"?key="+APIKey+"&token="+oATHtoken);
		
		System.out.println(myResponse.prettyPrint());
		
		Assert.assertEquals(200,  myResponse.getStatusCode());
	}
}
