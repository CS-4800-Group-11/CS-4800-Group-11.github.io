package teamnosleep.ebtrescue.EBT.Rescue.data;

import lombok.Data;
import org.hibernate.mapping.PrimaryKey;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.io.Serializable;

@Data
@IdClass(PrimaryKey.class)
@Entity
public class User implements Serializable {
    private String firstName;
    private String lastName;
    @Id private String fullName;
    private String location;
    @Id private String username;
    private String password;
    private Integer age;
}
