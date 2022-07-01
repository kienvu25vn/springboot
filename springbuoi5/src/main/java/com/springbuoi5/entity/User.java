package com.springbuoi5.entity;

import lombok.Data;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@Data
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "username")
    private String username;

    @Column(name = "email")
    private String email;

    @Column(name = "birthday")
    private String birthday;

    public User(Long id, String username, String email, Date birthday) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.birthday = new SimpleDateFormat("dd/MM/yyyy").format(birthday);
    }

    public User() {
    }
}
