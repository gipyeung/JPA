package com.sparta.dailydb.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class DailyUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String email;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    @OneToMany(mappedBy = "creator")
    private List<DailyDB> createdSchedules = new ArrayList<>();

    @ManyToMany(mappedBy = "assignees")
    private List<DailyDB> assignedSchedules = new ArrayList<>();

}
