package com.example.create_course.mapper;

import com.example.create_course.dto.response.CategoryResponse;
import com.example.create_course.entity.Category;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    CategoryResponse map(Category category);
}