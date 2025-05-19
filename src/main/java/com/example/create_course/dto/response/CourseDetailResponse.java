package com.example.create_course.dto.response;

import jakarta.persistence.ElementCollection;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CourseDetailResponse {
    @ElementCollection
    List<String> advantage;
    @ElementCollection
    List<String> audience;
    @ElementCollection
    List<String> requirement;
    @ElementCollection
    List<String> learning;
}
