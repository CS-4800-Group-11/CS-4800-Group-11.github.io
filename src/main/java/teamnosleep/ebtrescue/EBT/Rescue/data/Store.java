package teamnosleep.ebtrescue.EBT.Rescue.data;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="stores")
public class Store implements Serializable {
	
	@Id private Integer id;
	private String storeName;
	private String address;
	private String addressLine2;
	private String city;
    private String state;
    private String zip5;
    private String zip4;
    private String county;
    private Double longitude;
    private Double latitude;
}
