package com.example.create_course.dto.response;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TrainerResponse {
    String name;
    String surname;
    String email;
    String about;
}
