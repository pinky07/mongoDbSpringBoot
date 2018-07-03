package informatech.intellicentrics.com.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import informatech.intellicentrics.com.document.Users;
import informatech.intellicentrics.com.repository.UserRepository;

@RestController
@RequestMapping("/rest/users")
public class UsersResource {
	private UserRepository userRepository;

    public UsersResource(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/all")
    public List<Users> getAll() {
        return userRepository.findAll();
    }
}
