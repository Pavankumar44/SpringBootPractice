package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.bean.User;

public interface UserRepository extends JpaRepository<User, Long>{

	List<User> findByAddress(String address);
    User findByUsername(String username);
}
