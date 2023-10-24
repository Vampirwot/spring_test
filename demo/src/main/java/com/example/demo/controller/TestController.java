package com.example.demo.controller;

import com.example.demo.entity.Task;
import com.example.demo.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    private final UserRepository repository;


    public TestController(UserRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public Task test(@RequestParam String name) {
        return repository.findUserByName(name).getTasks().get(0);
    }

}
