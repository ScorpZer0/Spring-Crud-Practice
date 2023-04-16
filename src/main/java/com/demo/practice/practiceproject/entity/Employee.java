package com.demo.practice.practiceproject.entity;

import jakarta.annotation.PostConstruct;
import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor(force = true)
@Data
public class Employee {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NonNull private String firstName;
    @NonNull private String lastName;
    @NonNull private String email;
    @NonNull private String password;
    @ManyToOne @JoinColumn
    @NonNull private Role role;
}
