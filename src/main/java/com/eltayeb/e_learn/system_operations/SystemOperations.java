package com.eltayeb.e_learn.system_operations;

import com.eltayeb.e_learn.article.Article;
import com.eltayeb.e_learn.category.Category;
import com.eltayeb.e_learn.course.Course;
import com.eltayeb.e_learn.payment.Payment;
import com.eltayeb.e_learn.user.User;
import com.eltayeb.e_learn.video.Video;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class SystemOperations {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @ManyToOne
    @JoinColumn(name = "userId", nullable = false)
    private User user;
    @ManyToOne
    @JoinColumn(name = "courseId" , nullable = false)
    private Course course;
    @ManyToOne
    @JoinColumn(name = "videoId" , nullable = false)
    private Video video;
    @ManyToOne
    @JoinColumn(name = "categoryId", nullable = false)
    private Category category;
    @ManyToOne
    @JoinColumn(name = "articleId", nullable = false)
    private Article article;
    @ManyToOne
    @JoinColumn(name = "paymentId", nullable = false)
    private Payment payment;
    private String details;
    private LocalDateTime createdAt;

}
