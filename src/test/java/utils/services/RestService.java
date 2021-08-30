package utils.services;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.http.Cookies;
import io.restassured.specification.RequestSpecification;

public abstract class RestService {

    private static final String BASE_URL = "http://localhost:3000/";
    protected Cookies cookies;
    protected RequestSpecification REQ_SPEC;

    protected abstract String getPath();

    public RestService(Cookies cookies) {
        this.cookies = cookies;

        REQ_SPEC = new RequestSpecBuilder()
                .addCookies(cookies)
                .setBaseUri(BASE_URL)
                .setBasePath(getPath())
                .setContentType(ContentType.JSON)
                .build();
    }
}
