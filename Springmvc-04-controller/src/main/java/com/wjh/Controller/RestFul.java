package com.wjh.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RestFul {

    @GetMapping(value = "/add/{a}/{b}")
    public String test1(@PathVariable int a,@PathVariable String b, Model model){
        b=a+b;
        model.addAttribute("msg",b);
        return "test1";
    }


    @PostMapping(value ="/add/{a}/{b}")
    public String test2(@PathVariable int a,@PathVariable String b,Model model){
        b=a+b;
        model.addAttribute("msg",b);
        return "test2";
    }
    @RequestMapping("/add")
    public String test3( int a,String b,Model model){
        b=a+b;
        model.addAttribute("msg",b);
        return "test1";
    }
    @RequestMapping("/Redirect")
    public String test3(Model model){
        model.addAttribute("msg","Redirect");
        return "redirect:/hello.jsp";
    }
}
