package teamnosleep.ebtrescue.EBT.Rescue.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import teamnosleep.ebtrescue.EBT.Rescue.data.Store;
import teamnosleep.ebtrescue.EBT.Rescue.services.StoreService;

import java.util.List;

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

//	@GetMapping("/stores")
//	public List<Store> getStores() {
//		return storeService.getStores();
//	}
	
	@GetMapping("/stores/{id}")
	public Store getStoreID(@PathVariable int id) {
		return storeService.getStoreById(id).get();
	}
	
	@GetMapping("/nearestStores")
	public List<Store> getNearestStore(@RequestParam(value = "latitude") double latitude,
										@RequestParam(value = "longitude") double longitude,
									    @RequestParam(value = "distance") double distance,
									    @RequestParam(value = "limit", required = false, defaultValue = "5") int limit) {
		return storeService.findStoresByDistance(latitude, longitude, distance, limit);
	}
}
