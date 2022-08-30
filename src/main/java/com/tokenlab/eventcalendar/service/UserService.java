package com.tokenlab.eventcalendar.service;

import com.tokenlab.eventcalendar.entity.User;
import com.tokenlab.eventcalendar.entity.form.LoginForm;
import com.tokenlab.eventcalendar.exception.AlreadyRegisteredException;

import java.util.List;

public interface UserService {

    void register(LoginForm form) throws AlreadyRegisteredException;
}
