package teamnosleep.ebtrescue.EBT.Rescue.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import teamnosleep.ebtrescue.EBT.Rescue.data.Store;
import teamnosleep.ebtrescue.EBT.Rescue.repositories.StoreRepository;

@Service
public class StoreService {
	
	@Autowired
	private StoreRepository storeRepository;
	
	public List<Store> getStores() {
		return (List<Store>)storeRepository.findAll();
	}
	
	public Store getStore(int id) {
		return storeRepository.findById(id).get();
	}
}
