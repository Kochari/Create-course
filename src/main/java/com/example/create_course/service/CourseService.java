package com.example.create_course.service;

import com.example.create_course.dto.request.CourseRequest;
import com.example.create_course.entity.Course;
import org.springframework.stereotype.Service;

@Service
public interface CourseService {
     void save(CourseRequest courseRequest);

     void deleteById(Long id);

     Course getById(Long id);
}
