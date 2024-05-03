package com.springmvc.springmvc1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springmvc.springmvc1.Models.Tasks;

public interface TasksRepository extends JpaRepository <Tasks, Long> {
    
}
