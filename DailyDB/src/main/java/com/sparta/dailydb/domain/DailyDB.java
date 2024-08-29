package com.sparta.dailydb.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Table(name = "dailydb")
@NoArgsConstructor
public class DailyDB {
    //기본 생성자
    public DailyDB(){}

    //기본키 : 작성 유저 이름
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "creator_id")
    private DailyUser creator;

    // 할일 제목
    @Column(nullable = false, length = 20 )
    private String ActTitle;

    // 할일 내용
    @Column(nullable = true , length = 200)
    private String ActStory;

    //작성일
    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    //수정일
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate() {
        updatedAt = LocalDateTime.now();
    }

    public void update(String title, String story) {
        if (title != null) {
            this.ActTitle = title;
        }
        if (story != null) {
            this.ActStory = story;
        }
    }

    @ManyToMany
    @JoinTable(name = "daily_users",
            joinColumns = @JoinColumn(name = "daily_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id"))
    private List<DailyDB> dailyDB = new ArrayList<>();

    @OneToMany(mappedBy = "schedule", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DailyDBContent> contents = new ArrayList<>();


}
