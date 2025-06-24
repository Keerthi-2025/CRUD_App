package com.fullstack.fullproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import  com.fullstack.fullproject.model.User; // this is should be written else it gives error

public interface UserRepository extends JpaRepository<User,Long> {
}
