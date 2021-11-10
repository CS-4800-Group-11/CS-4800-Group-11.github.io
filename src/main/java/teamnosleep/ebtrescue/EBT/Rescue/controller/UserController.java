package teamnosleep.ebtrescue.EBT.Rescue.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import teamnosleep.ebtrescue.EBT.Rescue.data.User;
import teamnosleep.ebtrescue.EBT.Rescue.services.UserService;

@RestController
public class UserController {
    @Autowired private UserService userService;

    @GetMapping(value = "/AllUsers", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping(value = "/SpecificUser", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity findSpecificUser(@RequestParam String firstName, String lastName, String userName) {
        return ResponseEntity.ok(userService.findSpecificUser(firstName, lastName, userName));
    }
}
