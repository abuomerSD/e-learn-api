package com.eltayeb.e_learn.article;

import com.eltayeb.e_learn.course.Course;
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
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String title;
    private String body;
    @ManyToOne
    @JoinColumn(name = "courseId", nullable = false)
    private Course course;
    private LocalDateTime createdAt;
    @OneToMany
    private Set<SystemOperations> systemOperations;
}
