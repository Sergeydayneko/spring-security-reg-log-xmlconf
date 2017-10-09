package ru.dayneko.security.service;

import ru.dayneko.security.model.User;

/**
 * Service class for {@link ru.dayneko.security.model.User}
 *
 */

public interface UserService {

    void save(User user);

    User findByUsername(String username);
}
