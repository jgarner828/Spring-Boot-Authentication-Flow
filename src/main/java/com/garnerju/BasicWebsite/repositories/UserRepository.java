package com.garnerju.BasicWebsite.repositories;

import com.garnerju.BasicWebsite.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
