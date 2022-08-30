package com.tokenlab.eventcalendar.controller;

import com.tokenlab.eventcalendar.entity.form.LoginForm;
import com.tokenlab.eventcalendar.exception.AlreadyRegisteredException;
import com.tokenlab.eventcalendar.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/register")
    public ResponseEntity register(LoginForm form){
        try
        {
            service.register(form);
            return ResponseEntity.ok().body("REGISTERED!");
        }
        catch (AlreadyRegisteredException e)
        {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
