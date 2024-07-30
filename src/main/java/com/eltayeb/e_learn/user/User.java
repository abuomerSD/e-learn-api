package com.eltayeb.e_learn.user;

import com.eltayeb.e_learn.course.Course;
import com.eltayeb.e_learn.payment.Payment;
import com.eltayeb.e_learn.system_operations.SystemOperations;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String username;
    private String password;
    private String role;
    private LocalDateTime createdAt;
    @OneToMany
    private Set<SystemOperations> systemOperations;
    @ManyToOne()
    @JoinColumn(name = "userId", nullable = true)
    private Course course;
    @OneToOne
    private Payment payment;
}
