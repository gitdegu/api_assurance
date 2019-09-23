package getRequest;

import org.junit.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import junit.framework.Assert;

public class GetData2 {
	
	@Test
	public void testResponseCode() {
		
		int statucode=get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22").getStatusCode();
		System.out.print("Stats code is=" + statucode);
		Assert.assertEquals(statucode, 200);
	}
	@Test
	public void testBody() {
		String data=get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22").asString();
		long time=get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22").getTime();
		System.out.println("Data is=" + data);
		System.out.println("Response time=" +time);
		
	}
}
