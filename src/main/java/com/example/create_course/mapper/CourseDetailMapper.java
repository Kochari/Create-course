package com.example.create_course.mapper;

import com.example.create_course.dto.request.CourseDetailRequest;
import com.example.create_course.dto.response.CourseDetailResponse;
import com.example.create_course.entity.CourseDetail;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CourseDetailMapper {
    CourseDetail mapFrom(CourseDetailRequest request);

    CourseDetailResponse mapTo(CourseDetail detail);
}
