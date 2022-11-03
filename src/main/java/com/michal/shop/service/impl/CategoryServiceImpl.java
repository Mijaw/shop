package com.michal.shop.service.impl;

import com.michal.shop.model.dao.Category;
import com.michal.shop.repository.CategoryRepository;
import com.michal.shop.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;

    @Override
    public Category save(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    @Transactional
    public Category update(Category category, Long id) {
        Category categoryDb = getById(id);
        categoryDb.setName(category.getName());
        return categoryDb;
    }

    @Override
    public void delete(Long id) {
        categoryRepository.deleteById(id);
    }

    @Override
    public Category getById(Long id) {
        return categoryRepository.getReferenceById(id);//getById(id) - czy to to samo?
    }
}
