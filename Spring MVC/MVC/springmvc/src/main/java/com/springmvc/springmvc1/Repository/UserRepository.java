package com.springmvc.springmvc1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springmvc.springmvc1.Models.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    
}
