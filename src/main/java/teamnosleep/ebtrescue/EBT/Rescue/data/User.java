package teamnosleep.ebtrescue.EBT.Rescue.data;

import lombok.Data;

@Data
public class User {
    private String fullName;
    private String location;
    private String username;
    private String password;
    private Integer age;
}
