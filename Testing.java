package Test;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static org.assertj.core.api.Assertions.*;
import static org.hamcrest.Matchers.*;

import java.util.concurrent.TimeUnit;

import org.json.simple.JSONObject;

import static io.restassured.RestAssured.*;

public class Testing {

	@Test
void Api_Test1() {	
	
		given()
	 	.get("http://localhost:3000/")
	.then()
		.assertThat().body(containsString("name"))
		.assertThat().body(containsString("display-name"))
		.assertThat().body(containsString("host"))
		.assertThat().cookie("metabase.DEVICE")
		.header("Content-Type","text/html;charset=utf-8")
		.header("Content-Encoding","gzip")
		.statusCode(200)
		.statusLine("HTTP/1.1 200 OK")
		.log().all();
	
}
	@Test
void test_01() {
		given()
	 		.get("http://reqres.in/api/users/")
	 	.then()
	 	 	.statusCode(200)
	 	 	.body("data.id[1]",equalTo(2))
	 	 	.body("data.first_name",hasItems("George"))
			.statusLine("HTTP/1.1 200 OK")
			.header("Content-Type","application/json; charset=utf-8");
	}
}
