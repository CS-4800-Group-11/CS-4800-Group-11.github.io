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
public class Store implements Serializable {
    private String storeName;
    @Id private String address;
    private String addressLine2;
    private String city;
    private String state;
    private String zip5;
    private String zip4;
    private String county;
    @Id private Double longitude;
    @Id private Double latitude;
}
