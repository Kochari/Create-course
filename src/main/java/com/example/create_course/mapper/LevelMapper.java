package com.example.create_course.mapper;

import com.example.create_course.dto.response.LevelResponse;
import com.example.create_course.entity.Level;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LevelMapper {
    LevelResponse map(Level level);
}
