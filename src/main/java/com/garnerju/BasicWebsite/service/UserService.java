package com.garnerju.BasicWebsite.service;

import com.garnerju.BasicWebsite.models.User;
import com.garnerju.BasicWebsite.repositories.UserRepository;
import com.garnerju.BasicWebsite.utils.PassEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;

@Service
public class UserService {

    @Autowired
    DataSource dataSource;

    @Autowired
    UserRepository repo;

    @Autowired
    PassEncoder encoder;

    public User createUser(User newUser) {
        newUser.setPassword(encoder.encodeUserPassword(newUser.getPassword()));
        return repo.save(newUser);
    }
}
