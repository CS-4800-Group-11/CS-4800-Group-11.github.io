package teamnosleep.ebtrescue.EBT.Rescue.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import teamnosleep.ebtrescue.EBT.Rescue.data.Store;
import teamnosleep.ebtrescue.EBT.Rescue.repositories.StoreRepository;

import java.util.List;
import java.util.Optional;

import static teamnosleep.ebtrescue.EBT.Rescue.repositories.StoreRepository.*;

@Service
public class StoreService {
    @Autowired private StoreRepository storeRepository;

    public List<Store> getAllStores() {
        return storeRepository.findAll();
    }

    public Optional<Store> findSpecificStore(String address, String latitude, String longitude) {
        return storeRepository.findOne(
                Specification.where(addressEqualTo(address)
                        .and(latitudeEqualTo(latitude)
                        .and(longitudeEqualTo(longitude))))
        );
    }
}
