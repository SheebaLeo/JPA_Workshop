package com.example.jpa_workshop.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Entity
public class AppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    private String userName;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private LocalDate regDate;

    @OneToOne
    @JoinColumn
    private Details userDetails;

    public AppUser(String userName, String password) {
        this.userName = userName;
        this.password = password;
        this.regDate = LocalDate.now();
    }

    public AppUser(String userName, String password, Details userDetails) {
        this.userName = userName;
        this.password = password;
        this.regDate = LocalDate.now();
        this.userDetails = userDetails;
    }
}
