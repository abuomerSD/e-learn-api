package com.eltayeb.e_learn.video;

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
public class Video {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String title;
    @ManyToOne
    @JoinColumn(name = "courseId", nullable = false)
    private Course course;
    private long lengthInSecs;
    private long size;
    private LocalDateTime createdAt;
    @OneToMany
    private Set<SystemOperations> systemOperations;
}
