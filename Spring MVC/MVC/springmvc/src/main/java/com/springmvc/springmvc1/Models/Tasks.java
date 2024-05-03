package com.springmvc.springmvc1.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Tasks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String taskName;
    

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;


    public Tasks(){
        
    }

    
    
    public Tasks(long id, String taskName, User user) {
        this.id = id;
        this.taskName = taskName;
        this.user = user;
    }



    public Tasks(long id, String taskName) {
        this.id = id;
        this.taskName = taskName;
        
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getTaskName() {
        return taskName;
    }
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public User getUser() {
        return user;
    }
    

}
