package teamnosleep.ebtrescue.EBT.Rescue.repositories;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import teamnosleep.ebtrescue.EBT.Rescue.data.Store;

import java.util.List;

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

    static Specification<Store> idEqualTo (int id) {
        return (store, eq, cb) -> cb.equal(store.get("id"), id);
    }

    String HAVERSINE_FORMULA = "(3959 * acos(cos(radians(:latitude)) * cos(radians(S.latitude)) * cos(radians(S.longitude) - radians(:longitude)) + sin(radians(:latitude)) * sin(radians(S.latitude))))";

    @Query(nativeQuery = true, value = "SELECT *, " + HAVERSINE_FORMULA + " AS distance FROM stores as S HAVING distance < :distance ORDER BY distance ASC LIMIT 0, :limit")
    List<Store> findStoresByDistance(@Param("latitude") double latitude, @Param("longitude") double longitude, @Param("distance") double distance, @Param("limit") int limit);
}