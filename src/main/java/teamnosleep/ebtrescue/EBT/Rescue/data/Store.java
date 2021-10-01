package teamnosleep.ebtrescue.EBT.Rescue.data;

import lombok.Data;

@Data
public class Store {
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
