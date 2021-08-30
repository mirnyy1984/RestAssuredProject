package tests;

import io.restassured.http.Cookies;
import org.testng.annotations.Test;
import pojos.CreateUserResponse;
import pojos.UserRequest;
import utils.RestWrapper;

import java.util.List;

public class MyTests {

    @Test
    public void test_1() {
        RestWrapper api = new RestWrapper(new Cookies());

        UserRequest userRequest = new UserRequest();
        userRequest.setName("Vitos");
        userRequest.setAge(36);

        CreateUserResponse userResponse = api.user.createUser(userRequest);

       /* CreateUserResponse user = api.user.getUser(1);
        System.out.println(user.toString());*/

       /* List<CreateUserResponse> users = api.user.getUsers();

        System.out.println("size == " + users.size());
        users.forEach(user -> System.out.println("aaaa == " + user.toString()));*/


    }
}
