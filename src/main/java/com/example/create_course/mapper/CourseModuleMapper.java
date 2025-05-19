package com.example.create_course.mapper;

import com.example.create_course.dto.request.CourseModuleRequest;
import com.example.create_course.dto.response.CourseModuleResponse;
import com.example.create_course.entity.CourseModule;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CourseModuleMapper {
    CourseModule mapFrom(CourseModuleRequest request);

    CourseModuleResponse mapTo(CourseModule module);
}
