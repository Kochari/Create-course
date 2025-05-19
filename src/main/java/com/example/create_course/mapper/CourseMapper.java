package com.example.create_course.mapper;

import com.example.create_course.dto.request.CourseDetailRequest;
import com.example.create_course.dto.request.CourseRequest;
import com.example.create_course.dto.response.CourseResponse;
import com.example.create_course.entity.Course;
import com.example.create_course.entity.CourseDetail;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring", uses = {
        CourseModuleMapper.class,
        CourseDetailMapper.class,
        TrainerMapper.class,
        CategoryMapper.class,
        LevelMapper.class
})
public interface CourseMapper
 {
  Course mapFrom(CourseRequest request);

  CourseResponse mapTo(Course course);

//  @Mapping(target = "id", ignore = true)
  //void updateFrom(CourseRequest request, @MappingTarget Course course);
 }

