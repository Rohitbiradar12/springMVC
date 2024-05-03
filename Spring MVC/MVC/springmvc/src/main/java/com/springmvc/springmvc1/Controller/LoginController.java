package com.springmvc.springmvc1.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class LoginController {

   @GetMapping("/login")
   public String home(Model model){
    model.addAttribute("name","PRO-COLLAB");
    System.out.println("THIS IS MY LOGIN PAGE");
    return "views/login";
   }
}