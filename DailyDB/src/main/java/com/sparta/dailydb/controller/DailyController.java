package com.sparta.dailydb.controller;

import com.sparta.dailydb.dto.DailyCreateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/daily")
@RequiredArgsConstructor
public class DailyController {
    private final

    /**
     * 수업(course) 생성
     */
    @PostMapping
    public DailyCreateRequestDto createDailyAPI(@RequestBody DailyCreateRequestDto request) {
        return DailyDBService.createCourse(request);
    }

    /**
     * 수업(course) 목록 조회
     */
    @GetMapping
    public CourseListResponseDto courseListAPI() {
        return courseService.getCourseList();
    }
}
