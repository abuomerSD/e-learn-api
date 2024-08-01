package com.eltayeb.e_learn.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {
    @Autowired
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    List<User> findAll() {
        return userService.findAll();
    }

    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    User save(User user) {
        return userService.save(user);
    }
}
