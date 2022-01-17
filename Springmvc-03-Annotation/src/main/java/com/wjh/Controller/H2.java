package com.wjh.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class H2  {

    @RequestMapping("/h2")
    public String Setmsg2(Model model){
        model.addAttribute("msg","Hello SpringMVC Thymeleaf");
        return "index";
    }
}
