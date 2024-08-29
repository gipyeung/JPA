package com.sparta.dailydb.repository;

import com.sparta.dailydb.domain.DailyDBContent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DailyDBContentRepository extends JpaRepository<DailyDBContent, Long> {
}
