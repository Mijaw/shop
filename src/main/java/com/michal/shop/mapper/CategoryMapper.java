package com.michal.shop.mapper;

import com.michal.shop.model.dao.Category;
import com.michal.shop.model.dto.CategoryDto;

public interface CategoryMapper {
    CategoryDto daoToDto(Category category);
    Category dtoToDao(CategoryDto categoryDto);
}
