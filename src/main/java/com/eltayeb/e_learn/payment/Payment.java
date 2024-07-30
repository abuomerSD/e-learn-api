package com.eltayeb.e_learn.payment;

import com.eltayeb.e_learn.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private UUID userId;
    private double value;
    private LocalDateTime createdAt;
    @OneToOne
    @JoinColumn(name = "userId", nullable = true)
    private User user;
}
