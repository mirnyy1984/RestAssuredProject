package pojos;

import lombok.Data;

@Data
public class CreateUserResponse extends UserRequest{
    @Override
    public String toString() {
        return "UserRequest{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
