package com.example.create_course.repository;

import com.example.create_course.entity.CourseDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDetailRepository extends JpaRepository<CourseDetail, Integer> {
}
