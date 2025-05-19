package com.example.create_course.mapper;

import com.example.create_course.dto.response.TrainerResponse;
import com.example.create_course.entity.Trainer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TrainerMapper {
    TrainerResponse map(Trainer trainer);
}
