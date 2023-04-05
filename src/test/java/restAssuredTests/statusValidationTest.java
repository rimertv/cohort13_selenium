package restAssuredTests;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

import static org.hamcrest.Matchers.*;

public class statusValidationTest {

	String APIkey = "72996007b0ec2a3edbcf73cbe18efda2";

	String oATHtoken = "ATTAb323cdcb71c48d67c24221966231851f28c4d3bfd88153f79fe6d8b255d66db2DB3CF72E";

	@Test
	public void validateData() {

		RequestSpecification httpRequest = RestAssured.given();

		httpRequest.given().param("key", APIkey).param("token", oATHtoken)
				.get("https://api.trello.com/1/members/me/boards")
				.then()
				.statusCode(200)
				.body("name", hasItems("Cohort13_boardfromAPI", "FINAL_API_BOARD"))
				.body("id", hasItems("641cfbac0766201c678ecce5"));

	}

}
