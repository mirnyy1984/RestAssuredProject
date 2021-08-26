import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TC_001_GetRequest {

    @Test
    public void getWeatherDetails(){
       /* RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
        RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city/Hyderabad";

        RequestSpecification httpRequest = RestAssured.given();

        Response response = httpRequest.request(Method.GET, "/Hyderabad");

        String responseBody = response.getBody().asPrettyString();

        System.out.println(responseBody);
*/




    }
}
