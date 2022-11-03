package com.michal.shop.service;

import com.michal.shop.model.dao.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProductService {
    Product save(Product product);
    Product update(Product product, Long id);
    void delete(Long id);
    Product getById(Long id);
    Page<Product> getPage(Pageable pageable);
}
