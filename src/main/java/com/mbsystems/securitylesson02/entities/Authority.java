package com.mbsystems.securitylesson02.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "authorities")
@Getter
@Setter
public class Authority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)

    private String  name;

    @ManyToMany( mappedBy = "authorities")
    private Set<Users> usersSet;
}
