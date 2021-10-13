/*package teamnosleep.ebtrescue.EBT.Rescue.repositories;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import teamnosleep.ebtrescue.EBT.Rescue.data.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>, JpaSpecificationExecutor<User>{
    static Specification<User> firstNameEqualTo (String firstName) {
        return (user, eq, cb) -> cb.equal(user.get("firstName"), firstName);
    }

    static Specification<User> lastNameEqualTo (String lastName) {
        return (user, eq, cb) -> cb.equal(user.get("lastName"), lastName);
    }

    static Specification<User> usernameEqualTo (String username) {
        return (user, eq, cb) -> cb.equal(user.get("username"), username);
    }
}
*/