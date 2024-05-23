package com.example.backendlogin.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.backendlogin.domain.User;

public interface UserRepository extends JpaRepository<User, String>{
    Optional<User> findByEmail(String email);

}
