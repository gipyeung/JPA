package com.sparta.dailydb.serivce;

import com.sparta.dailydb.domain.DailyDB;
import com.sparta.dailydb.repository.DailyDBRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DailyDBService {

    @Autowired
    private DailyDBRepository dailyRepository;

    @Transactional
    public DailyDB createSchedule(DailyDB schedule) {
        return dailyRepository.save(schedule);
    }

    @Transactional(readOnly = true)
    public DailyDB getSchedule(Long id) {
        return dailyRepository.findById(id).orElseThrow(() -> new RuntimeException("Schedule not found"));
    }

    @Transactional(readOnly = true)
    public Page<DailyDB> getAllSchedules(Pageable pageable) {
        return dailyRepository.findAll(pageable);
    }

    @Transactional
    public DailyDB updateDaily(Long id, DailyDB dailyDB) {
        DailyDB existingdaily = dailyRepository.findById(id).orElseThrow(() -> new RuntimeException("daily not found"));
        return dailyRepository.save(existingdaily);
    }

    @Transactional
    public void deleteSchedule(Long id) {
        if (dailyRepository.existsById(id)) {
            dailyRepository.deleteById(id);
        } else {
            throw new RuntimeException("Daily not found");
        }
    }
}