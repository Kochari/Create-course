package com.example.create_course.dto.response;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CourseResponse {
    String name;
    String description;
    int studentsCount;
    byte duration;
    int moduleCount;
    int lessonCount;
    int examCount;
    double monthlyPayment;
    double fullPayment;
    boolean finalProject;
    boolean certificate;
    LevelResponse level;
    List<TrainerResponse> trainers;
    List<CourseModuleResponse> modules;
    CategoryResponse category;
    CourseDetailResponse detail;
}
