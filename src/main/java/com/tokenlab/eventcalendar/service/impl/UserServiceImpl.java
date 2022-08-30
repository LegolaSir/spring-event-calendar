package com.tokenlab.eventcalendar.service.impl;

import com.tokenlab.eventcalendar.entity.User;
import com.tokenlab.eventcalendar.entity.form.LoginForm;
import com.tokenlab.eventcalendar.exception.AlreadyRegisteredException;
import com.tokenlab.eventcalendar.repository.UserRepository;
import com.tokenlab.eventcalendar.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder encoder;

    @Override
    public void register(LoginForm form) throws AlreadyRegisteredException {
        if(userRepository.findById(form.getUsername()).isPresent())
            throw new AlreadyRegisteredException("USERNAME ALREADY REGISTERED, CHANGE IT.");

        User user = new User();
        user.setUsername(form.getUsername());
        user.setPassword(encoder.encode(form.getPassword()));

        userRepository.save(user);
    }
}
