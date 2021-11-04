package teamnosleep.ebtrescue.EBT.Rescue.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import teamnosleep.ebtrescue.EBT.Rescue.data.Store;
import teamnosleep.ebtrescue.EBT.Rescue.services.StoreService;

@RestController
public class StoreController {
	
	@Autowired
	private StoreService storeService;
	
	@GetMapping("/stores")
	public List<Store> getStores() {
		return storeService.getStores();
	}
	
	@GetMapping("/stores/{id}")
	public Store getStore(@PathVariable int id) {
		return storeService.getStore(id);
	}
	
	@GetMapping("/nearestStores")
	public List<Store> getNearestStore(@RequestParam(value = "latitude") double latitude,
										@RequestParam(value = "longitude") double longitude,
									    @RequestParam(value = "distance") double distance,
									    @RequestParam(value = "limit", required = false, defaultValue = "5") int limit) {
		return storeService.findStoresByDistance(latitude, longitude, distance, limit);
	}
}
