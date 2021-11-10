package teamnosleep.ebtrescue.EBT.Rescue.repositories;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import teamnosleep.ebtrescue.EBT.Rescue.data.Store;

@Repository
public interface StoreRepository extends JpaRepository<Store, Long>, JpaSpecificationExecutor<Store> {
    static Specification<Store> addressEqualTo (String address) {
        return (store, eq, cb) -> cb.equal(store.get("address"), address);
    }

    static Specification<Store> latitudeEqualTo (String latitude) {
        return (store, eq, cb) -> cb.equal(store.get("latitude"), latitude);
    }

    static Specification<Store> longitudeEqualTo (String longitude) {
        return (store, eq, cb) -> cb.equal(store.get("longitude"), longitude);
    }
}
