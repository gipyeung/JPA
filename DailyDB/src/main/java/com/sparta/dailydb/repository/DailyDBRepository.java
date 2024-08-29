package com.sparta.dailydb.repository;


import com.sparta.dailydb.domain.DailyDB;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DailyDBRepository extends JpaRepository<DailyDB, Long> {
    Page<DailyDB> findAll(Pageable pageable);
}

