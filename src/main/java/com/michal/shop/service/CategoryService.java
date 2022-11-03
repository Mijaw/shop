package com.michal.shop.service;

import com.michal.shop.model.dao.Category;

public interface CategoryService {
    Category save(Category category);
    Category update(Category category,Long id);
    void delete(Long id);
    Category getById(Long id);
}
