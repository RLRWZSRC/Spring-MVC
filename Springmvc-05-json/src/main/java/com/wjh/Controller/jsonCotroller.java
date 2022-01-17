package com.wjh.Controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wjh.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.LinkedList;

@Controller
public class jsonCotroller {
//    如果出现json乱码请在配置文件配置过滤
//    @RequestMapping(value = "/j1/t1",produces = "application/json;charset=utf-8")

    @RequestMapping(value = "/j1/t1")
    @ResponseBody
    public  String test1() throws JsonProcessingException{
        ObjectMapper mapper = new ObjectMapper();
        String str= mapper.writeValueAsString(new User("wjh",3,"男"));
        return str;
    }

    @RequestMapping(value = "/j1/t2")
    @ResponseBody
    public  String test2() throws JsonProcessingException{
        ObjectMapper mapper = new ObjectMapper();
        LinkedList linkedList = new LinkedList();
        linkedList.add(new User("wjh",3,"男"));
        linkedList.add(new User("wjh",3,"男"));
        linkedList.add(new User("wjh",3,"男"));
        linkedList.add(new User("wjh",3,"男"));
        linkedList.add(new User("wjh",3,"男"));
        String str= mapper.writeValueAsString(linkedList);
        return str;
    }

}
