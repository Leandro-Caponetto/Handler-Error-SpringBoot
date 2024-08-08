package com.leandro.error.errors.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leandro.error.errors.models.domain.User;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private List<User> users;

    @Override
    public List<User> findAll() {

        return users;
    }

    @Override
    public Optional<User> findById(Long id) {

        // User user = null;
        // for (User u : users) {
        // if (u.getId().equals(id)) {
        // user = u;
        // break;
        // }
        // }

        Optional<User> user = users.stream().filter(usr -> usr.getId().equals(id)).findFirst();

        // return Optional.ofNullable(user);

        return user;
    }

}
