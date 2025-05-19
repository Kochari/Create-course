package com.example.create_course.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity
@Data
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(schema = "course")
public class CourseDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @ElementCollection
    List<String> advantage;
    @ElementCollection
    List<String> audience;
    @ElementCollection
    List<String> requirement;
    @ElementCollection
    List<String> learning;
    @OneToOne
    Course course;
}
