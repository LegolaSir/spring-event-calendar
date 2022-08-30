package com.tokenlab.eventcalendar.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_users")
@Data
public class User {
    @Id
    private String username;

    @Column(length = 100, nullable = false)
    private String password;
}
