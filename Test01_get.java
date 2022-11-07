import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static org.assertj.core.api.Assertions.*;
import static org.hamcrest.Matchers.*;
import java.util.concurrent.TimeUnit;
import org.json.simple.JSONObject;
import static io.restassured.RestAssured.*;

public class Test01_get {
	@Test
	void test_01() {
		JSONObject request=new JSONObject();
		
		request.put("name","ahmad");
		request.put("job","teacher");
		
		System.out.println(request);
		System.out.println(request.toJSONString());
		
		given()
		
			.header("Content-Type","application/json; charset=utf-8")
			.header("Server","cloudflare")
			.contentType(ContentType.JSON)
			.accept(ContentType.JSON)
	 		.body(request.toJSONString())
	 		
	 	.when()
	 	
	 		.put("https://reqres.in/api/users/2")
	 		
	 	.then()
	 	
	 	 	.statusCode(200)
			.statusLine("HTTP/1.1 200 OK")
			.assertThat().body(containsString("name"))
			.assertThat().body(containsString("job"))
			.log().all();
	}
	@Test
	void test_04() {
		JSONObject request=new JSONObject();
		
		request.put("name","ahmad");
		
		System.out.println(request);
		System.out.println(request.toJSONString());
		
		given()
	
			.contentType(ContentType.JSON)
			.accept(ContentType.JSON)
	 		.body(request.toJSONString())
	 		.header("Content-Encoding","gzip")
			.cookie("metabase.DEVICE")
	 		
	 	.when()
	 	
	 		.put("http://localhost:3000/")
	 		
	 	.then()
	 	
	 	 	.statusCode(200)
			.statusLine("HTTP/1.1 200 OK")
			.log().all();
	}
}
