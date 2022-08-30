package com.tokenlab.eventcalendar.controller;

import com.tokenlab.eventcalendar.entity.form.LoginForm;
import com.tokenlab.eventcalendar.exception.AlreadyRegisteredException;
import com.tokenlab.eventcalendar.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/register")
    public ResponseEntity register(@RequestBody LoginForm form){
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
