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
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
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
    @ManyToOne
    Level level;
    @ManyToMany
    List<Trainer> trainers;
        @OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
    List<CourseModule> modules;
    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    Category category;
    @OneToOne(mappedBy = "course", cascade = CascadeType.ALL)
    CourseDetail detail;
}
