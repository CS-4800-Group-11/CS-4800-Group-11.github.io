package teamnosleep.ebtrescue.EBT.Rescue.data;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class User implements Serializable {
    private String firstName;
    private String lastName;
    private String fullName;
    private String location;
    @Id private String username;
    private String password;
    private Integer age;
}
