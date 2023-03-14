package dio.myfirstwebapi.controller;

import dio.myfirstwebapi.model.User;
import dio.myfirstwebapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserRepository repository;
    @GetMapping("/users")
    public List<User>getUsers() {
        return repository.findAll();
    }
}
