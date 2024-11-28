package ru.solorepeat.Catsgram.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import ru.solorepeat.Catsgram.model.Post;
import ru.solorepeat.Catsgram.model.User;
import ru.solorepeat.Catsgram.service.UserService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public Collection<User> findAll() {
        return userService.findAll();
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @PutMapping
    public User updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }

    @GetMapping("users/{userMail}")
    public User findUserByEmail(@PathVariable String userMail) {
        return userService.findUserByEmail(userMail);
    }

    @GetMapping("/users/{userId}/posts/list")
    public List<Post> listPosts(
            @PathVariable String userId,
            @RequestParam @DateTimeFormat(pattern = "dd.MM.yyyy") LocalDate from,
            @RequestParam @DateTimeFormat(pattern = "dd.MM.yyyy") LocalDate to
    ) {
        System.out.println("Ищем посты пользователя " + userId +
                " с даты " + from.toString() + " по дату " + to.toString());
        // ... опустим логику поиска
        // .../users/777/posts/list?from=01.01.2020&to=12.03.2020
        return new ArrayList<>();
    }

    /*
    для пользователя в запросе будет /api/foos?id=777
    но для себя для понимания что это fooId, мы используем
    @RequestParam(name = "id") String fooId


    @PostMapping("/api/foos")
    @ResponseBody
    public String addFoo(@RequestParam(name = "id") String fooId, @RequestParam String name) {
        return "ID: " + fooId + " Name: " + name;
    }
     */

}

