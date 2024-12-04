package ru.solorepeat.Catsgram.dao;

import ru.solorepeat.Catsgram.model.User;

import java.util.Optional;

public interface UserDao {

    Optional<User> findUserById(String id);

}
