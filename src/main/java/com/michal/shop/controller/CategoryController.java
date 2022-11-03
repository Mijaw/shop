package com.michal.shop.controller;

import com.michal.shop.mapper.CategoryMapper;
import com.michal.shop.model.dao.Category;
import com.michal.shop.model.dto.CategoryDto;
import com.michal.shop.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/vi/categories")
@RequiredArgsConstructor
public class CategoryController {
    private final CategoryService categoryService;
    private final CategoryMapper categoryMapper;
    @GetMapping("/{id}")
    public CategoryDto getCategoryById(@PathVariable Long id){
        return categoryMapper.daoToDto(categoryService.getById(id));
    }
    @PostMapping
    public CategoryDto saveCategory(@RequestBody CategoryDto category){
        return categoryMapper.daoToDto(categoryService.save(categoryMapper.dtoToDao(category)));
    }
    @PutMapping("/{id}")
    public CategoryDto updateCategory(@RequestBody CategoryDto category,@PathVariable Long id){
        return categoryMapper.daoToDto(categoryService.update(categoryMapper.dtoToDao(category),id));
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        categoryService.delete(id);
    }
}
