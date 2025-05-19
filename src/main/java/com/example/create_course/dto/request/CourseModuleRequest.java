package com.example.create_course.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CourseModuleRequest {
     @Size(max = 50, message = "Course Module name must not exceed 50 characters.")
     @NotBlank(message = "Course Module name must not be blank")
     String name;
     @Size(max = 255, message = "Course Module content must not exceed 255 characters.")
     @NotBlank(message = "Course Module content must not be blank")
     String content;
}
