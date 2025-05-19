package com.example.create_course.controller;

import com.example.create_course.dto.request.CourseRequest;
import com.example.create_course.dto.response.CourseResponse;
import com.example.create_course.entity.Course;
import com.example.create_course.mapper.CourseMapper;
import com.example.create_course.service.CourseService;
import jakarta.validation.Valid;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@Data
public class CourseController {
    @Autowired
    private CourseService courseService;
    @Autowired
    private CourseMapper courseMapper;

    @PostMapping("/create")
    public ResponseEntity<String> createCourse(@Valid @RequestBody CourseRequest course) {
        System.out.println(course.toString());
        courseService.save(course);
        return ResponseEntity.ok("Created");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<CourseResponse> deleteCourse(@PathVariable Long id) {
        courseService.deleteById(id);
        return ResponseEntity.ok(new CourseResponse());
    }

    @GetMapping("/{id}")
    public ResponseEntity<CourseResponse> getCourse(@PathVariable Long id){
        Course course=courseService.getById(id);
        CourseResponse courses=courseMapper.mapTo(course);
        return ResponseEntity.ok(courses);
    }
}
