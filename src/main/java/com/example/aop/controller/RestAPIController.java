package com.example.aop.controller;

import com.example.aop.annotation.Decode;
import com.example.aop.annotation.Timer;
import com.example.aop.dto.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class RestAPIController {

    @GetMapping("/get/{id}")
    public String get(@PathVariable Long id, @RequestParam String name){
//        System.out.println("Get method");
//        System.out.println("Get method: " + id);
//        System.out.println("Get method: " + name);
        return id + " " + name;
    }

    @PostMapping("/post")
    public User post(@RequestBody User user){
//        System.out.println("Post method: " + user);
        return user;
    }

    @Decode
    @PutMapping("/put")
    public User put(@RequestBody User user){
//        System.out.println("put");
//        System.out.println(user);
        return user;
    }

    @Timer
    @DeleteMapping("/delete")
    public void delete() throws InterruptedException {
        Thread.sleep(1000 * 2);
    }
}
