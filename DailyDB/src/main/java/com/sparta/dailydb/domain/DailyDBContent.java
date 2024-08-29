package com.sparta.dailydb.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class DailyDBContent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "name_daily")
    private DailyDB dailyDB;

    @Column(nullable = false, length = 20 )
    private String content;

    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    private String author;

}
