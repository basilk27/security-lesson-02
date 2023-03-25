package com.mbsystems.securitylesson02.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "users")
@Getter
@Setter
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @ManyToMany( fetch = FetchType.EAGER )
    @JoinTable( name = "user_authorities",
                joinColumns = @JoinColumn( name = "userid"),
                inverseJoinColumns = @JoinColumn( name = "authid"))
    private Set<Authority> authorities;
}
