package com.michal.shop.mapper.impl;

import com.michal.shop.mapper.CategoryMapper;
import com.michal.shop.model.dao.Category;
import com.michal.shop.model.dto.CategoryDto;
import org.springframework.stereotype.Component;

@Component
public class CategoryMapperImpl implements CategoryMapper {
    @Override
    public CategoryDto daoToDto(Category category) {
        return CategoryDto.builder()
                .id(category.getId())
                .name(category.getName())
                .build();
    }

    @Override
    public Category dtoToDao(CategoryDto categoryDto) {
        return Category.builder()
                .id(categoryDto.getId())
                .name(categoryDto.getName())
                .build();
    }
}
