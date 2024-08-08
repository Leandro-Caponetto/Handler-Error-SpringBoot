package com.leandro.error.errors.services;

import java.util.List;
import java.util.Optional;

import com.leandro.error.errors.models.domain.User;

public interface UserService {

    List<User> findAll();

    Optional<User> findById(Long id);

}
