package com.example.project.controller;

import com.example.project.Common.GlobalExceptionHandling;
import com.example.project.model.User;
import com.example.project.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    public UserController() {
    }

    @GetMapping({"/emp"})
    public List<User> Allemp() {
        return this.userService.getAllemp();
    }

    @GetMapping({"emp/{id}"})
    public User getId(@PathVariable("id") int id) throws GlobalExceptionHandling {
        return this.userService.getempById(id);
    }

    @PostMapping({"/emp"})
    public void addEmp(@RequestBody User emp) {
        this.userService.addEmp(emp);
    }

    @PutMapping({"emp/{id}"})
    public void updateEmp(@RequestBody User emp, @PathVariable("id") int id) {
        this.userService.updateEmp(emp, id);
    }

    @DeleteMapping({"emp/{id}"})
    public void deleteEmp(@PathVariable("id") int id) {
        this.userService.deleteEmp(id);
    }
}
