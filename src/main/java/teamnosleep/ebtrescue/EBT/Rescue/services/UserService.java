package teamnosleep.ebtrescue.EBT.Rescue.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import teamnosleep.ebtrescue.EBT.Rescue.data.User;
import teamnosleep.ebtrescue.EBT.Rescue.repositories.UserRepository;

import java.util.List;
import java.util.Optional;

import static teamnosleep.ebtrescue.EBT.Rescue.repositories.UserRepository.*;

@Service
public class UserService {
    @Autowired private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> findSpecificUser(String firstName, String lastName, String username) {
        return userRepository.findOne(
                Specification.where(firstNameEqualTo(firstName)
                        .and(lastNameEqualTo(lastName))
                        .and(usernameEqualTo(username)))
        );
    }
}
