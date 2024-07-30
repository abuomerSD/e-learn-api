package com.eltayeb.e_learn.course;

import com.eltayeb.e_learn.category.Category;
import com.eltayeb.e_learn.user.User;
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
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String title;
//    private UUID categoryId;
    private double price;
    private long videosLengthInSeconds;
    private String level;
    private double rate;
    private long durationInDays;
    private LocalDateTime createdAt;
    @ManyToOne
    @JoinColumn(name = "categoryId", nullable = true)
    private Category category;
    @OneToMany
    private Set<User> user;
}
