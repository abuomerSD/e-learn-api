package com.eltayeb.e_learn.user_courses;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
//@Entity
public class UserCourses {
//    @Id
//    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID userId;
    private UUID courseId;
}
