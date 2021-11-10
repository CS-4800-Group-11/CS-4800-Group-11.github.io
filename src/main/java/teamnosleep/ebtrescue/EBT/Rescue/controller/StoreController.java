package teamnosleep.ebtrescue.EBT.Rescue.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import teamnosleep.ebtrescue.EBT.Rescue.data.Store;
import teamnosleep.ebtrescue.EBT.Rescue.services.StoreService;

@RestController
public class StoreController {
    @Autowired private StoreService storeService;

    @GetMapping(value = "/AllStores", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Store> getAllStore() {
        return storeService.getAllStores();
    }

    @GetMapping(value = "/SpecificStore", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity findSpecificStore(String address, String latitude, String longitude) {
        return ResponseEntity.ok(storeService.findSpecificStore(address, latitude, longitude)); 
    }
}
