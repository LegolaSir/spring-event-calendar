package com.tokenlab.eventcalendar.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
public class AlreadyRegisteredException extends Throwable {
    private String message;

}
