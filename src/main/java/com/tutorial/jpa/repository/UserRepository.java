package com.tutorial.jpa.repository;

import com.tutorial.jpa.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
    public List<Users> findByUsername(String username);
}
