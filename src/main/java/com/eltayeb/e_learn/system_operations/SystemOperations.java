package com.eltayeb.e_learn.system_operations;

import com.eltayeb.e_learn.category.Category;
import com.eltayeb.e_learn.user.User;
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
    private UUID courseId;
    private UUID videoId;
    @ManyToOne
    @JoinColumn(name = "categoryId", nullable = false)
    private Category category;
    private UUID articleId;
    private UUID paymentId;
    private String details;
    private LocalDateTime createdAt;

}
