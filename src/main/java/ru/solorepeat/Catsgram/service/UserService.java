package ru.solorepeat.Catsgram.service;

import org.springframework.stereotype.Service;
import ru.solorepeat.Catsgram.dao.UserDao;
import ru.solorepeat.Catsgram.model.User;

import java.util.Optional;

@Service
public class UserService {
    private final UserDao userDao;

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public Optional<User> findUserById(String id) {
        return userDao.findUserById(id);
    }
}