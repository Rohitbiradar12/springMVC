package com.springmvc.springmvc1.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelpController {
    @GetMapping("/help")
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name", "get help");
        System.out.println("THIS IS HELP PAGE");
        modelAndView.setViewName("views/help");
        return modelAndView;
    }

}
    
