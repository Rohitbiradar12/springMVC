package com.springmvc.springmvc1.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.springmvc1.Models.User;
import com.springmvc.springmvc1.Service.UserService;

@Controller
public class RegisterController {

     @Autowired
    private UserService userService;

    @ModelAttribute
    public void  handle(){
        System.out.println("entered successfully");
    }
    
    
    @GetMapping("/register")
    public String register(){
       
        return "forms/register";
    }

      
    @PostMapping("forms/processform")
    public String reqHandler(@ModelAttribute User user,Model model){
    System.out.println(user);
    if (user.getEmail().isEmpty() || user.getUsername().isEmpty() || user.getPassword().isEmpty()) {
        return "redirect:/register";
    }
    this.userService.createUser(user);


    return "views/success";
    }
        
    }
    

