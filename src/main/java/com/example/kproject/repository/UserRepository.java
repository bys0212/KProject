package com.example.kproject.repository;

import com.example.kproject.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUsername(String username); // 사용자 이름으로 사용자 조회
}
