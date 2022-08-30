package com.tokenlab.eventcalendar.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_users")
@Data
@NoArgsConstructor @AllArgsConstructor
public class User {
    @Id
    private String username;

    @Column(length = 100, nullable = false)
    private String password;

    @ManyToMany(fetch = FetchType.LAZY)
    private List<Event> calendar = new ArrayList<>();
}
