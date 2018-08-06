package com.leanmentors.api.controller;

import com.leanmentors.api.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Map;

import static java.util.stream.Collectors.toMap;

@RestController
@RequestMapping("/api")
public class SampleController {


    @GetMapping("/greetings")
    public String hello(@RequestParam(value="name", defaultValue="World") String name){
            return "Hello "+ name;
    }


    @GetMapping("/getUser")
    public User findUser(@RequestParam(name="userName") String userName){
        return loadUsers().get(userName);
    }


    private Map<String, User> loadUsers() {
       return
               Arrays.asList(new User("khurram","Khurram", "Mahmood"),
                new User("alesha","Alesha", "Khurram"))
                       .stream()
                       .collect( toMap(user -> user.getUserName(), user -> user));
    }
}
