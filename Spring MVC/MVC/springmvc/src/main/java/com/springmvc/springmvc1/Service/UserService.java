package com.springmvc.springmvc1.Service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.springmvc1.Models.User;
import com.springmvc.springmvc1.Repository.UserRepository;


@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User createUser(User user){
    return userRepository.save(user);
       
    }

   
}
