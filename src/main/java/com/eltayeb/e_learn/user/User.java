package com.eltayeb.e_learn.user;

import com.eltayeb.e_learn.course.Course;
import com.eltayeb.e_learn.payment.Payment;
import com.eltayeb.e_learn.system_operations.SystemOperations;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String username;
    private String password;
    private String role;
    @CreationTimestamp
    private LocalDateTime createdAt;
    @OneToMany
    private Set<SystemOperations> systemOperations;
    @ManyToMany()
//    @JoinColumn(name = "courseId", nullable = true)
    private Set<Course> courses;
    @OneToOne
    private Payment payment;
}
