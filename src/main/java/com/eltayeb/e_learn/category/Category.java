package com.eltayeb.e_learn.category;

import com.eltayeb.e_learn.course.Course;
import com.eltayeb.e_learn.system_operations.SystemOperations;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String title;
    private LocalDateTime createdAt;
    @OneToMany
    private Set<Course> courses;
    @OneToMany
    private Set<SystemOperations> systemOperations;
}
