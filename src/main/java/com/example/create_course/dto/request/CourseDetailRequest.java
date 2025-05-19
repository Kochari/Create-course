package com.example.create_course.dto.request;


import jakarta.persistence.ElementCollection;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
public class CourseDetailRequest {
    @Size(max = 255, message = "Advantage must not exceed 255 characters.")
    @NotBlank(message = "Advantage must not be blank")
    @ElementCollection
    List<String> advantage;
    @Size(max = 255, message = "Audience must not exceed 255 characters.")
    @NotBlank(message = "Audience must not be blank")
    @ElementCollection
    List<String> audience;
    @Size(max = 255, message = "Requirement must not exceed 255 characters.")
    @NotBlank(message = "Requirement must not be blank")
    @ElementCollection
    List<String> requirement;
    @Size(max = 255, message = "Learning must not exceed 255 characters.")
    @NotBlank(message = "Learning must not be blank")
    @ElementCollection
    List<String> learning;
}
