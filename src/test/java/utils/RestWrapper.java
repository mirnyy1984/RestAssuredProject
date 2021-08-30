package utils;

import io.restassured.http.Cookie;
import io.restassured.http.Cookies;
import io.restassured.specification.RequestSpecification;
import utils.services.UserService;

import static io.restassured.RestAssured.given;

public class RestWrapper {

    private static final String BASE_URL = "http://localhost:3000/";
    private Cookies cookies;

    public UserService user;

    public RestWrapper(Cookies cookies) {
        this.cookies = cookies;

        user = new UserService(cookies);
    }
}
