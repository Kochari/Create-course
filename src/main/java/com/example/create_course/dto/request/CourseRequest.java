package com.example.create_course.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CourseRequest {
    @Size(max = 24, message = "Course name must not exceed 24 characters.")
    @NotBlank(message = "Course name must not be blank")
    String name;
    @Size(max = 255, message = "Course description must not exceed 255 characters.")
    @NotBlank(message = "Course description must not be blank")
    String description;
    @Size(max = 20, message = "The number of Students count can not exceed 20.")
    @NotBlank(message = "Course Students count must not be blank")
    int studentsCount;
    @NotBlank(message = "Course duration must be entered in months")
    byte duration;
    @NotBlank(message = "Course Module Count must not be blank")
    int moduleCount;
    @NotBlank(message = "Course Lesson Count must not be blank")
    int lessonCount;
    @Size(min = 0, message = "Exam count of Course cannot less than 0.")
    @NotBlank(message = "Course Exam Count must not be blank")
    int examCount;
    double monthlyPayment;
    double fullPayment;
    @NotNull(message = "Course Final Project must not be NULL!")
    boolean finalProject;
    @NotNull(message = "Course Certificate must not be NULL!")
    boolean certificate;
    CourseDetailRequest detail;
    List<CourseModuleRequest> modules;
    @NotEmpty(message = "Course Language Level must not be empty!")
    Long levelId;
    List<Long> trainerIds;
    @NotEmpty(message = "Course Category must not be empty!")
    Long categoryId;
}
