package com.example.create_course.service.impl;

import com.example.create_course.dto.request.CourseRequest;
import com.example.create_course.entity.*;
import com.example.create_course.mapper.CourseMapper;
import com.example.create_course.repository.*;
import com.example.create_course.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseServiceImpl implements CourseService {
   private final CourseRepository courseRepository;
    private final  CourseMapper courseMapper;
    private final LevelRepository levelRepository;
    private final TrainerRepository trainerRepository;
    private final CategoryRepository categoryRepository;


    @Override
    public void save(CourseRequest courseRequest) {
        Course course = courseMapper.mapFrom(courseRequest);
        Level level = levelRepository.findById(courseRequest.getLevelId()).orElse(null);
        course.setLevel(level);
        List<Long> trainerIds = courseRequest.getTrainerIds();
        List<Trainer> trainers = trainerRepository.findAllById(trainerIds);
        course.setTrainers(trainers);
        Category category = categoryRepository.findById(courseRequest.getCategoryId()).orElse(null);
        course.setCategory(category);

        courseRepository.save(course);
    }

    @Override
    public void deleteById(Long id) {
        courseRepository.deleteById(id);
    }

    @Override
    public Course getById(Long id) {
       return courseRepository.findById(id).get();
    }
}
