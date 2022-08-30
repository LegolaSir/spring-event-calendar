package com.tokenlab.eventcalendar.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_users")
@Data
public class User {
    @Id
    private String username;

    @Column(length = 100, nullable = false)
    private String password;

    @ManyToMany(fetch = FetchType.LAZY)
    private List<Event> calendar;
}
