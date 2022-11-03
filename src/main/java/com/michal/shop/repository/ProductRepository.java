package com.michal.shop.repository;

import com.michal.shop.model.dao.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
