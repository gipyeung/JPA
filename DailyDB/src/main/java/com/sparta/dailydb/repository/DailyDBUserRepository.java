package com.sparta.dailydb.repository;

import com.sparta.dailydb.domain.DailyUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DailyDBUserRepository extends JpaRepository<DailyUser, Long> {
}
