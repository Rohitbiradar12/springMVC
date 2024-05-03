package com.springmvc.springmvc1.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {

   @GetMapping("/")
   public String home(){
    System.out.println("THIS IS MY HOME PAGE");
    return "views/home";
   }
}
