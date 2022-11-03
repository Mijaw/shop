package com.michal.shop.service.impl;

import com.michal.shop.model.dao.Product;
import com.michal.shop.repository.ProductRepository;
import com.michal.shop.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    @Transactional
    public Product update(Product product, Long id) {
        Product productDb=getById(id);
        productDb.setName(product.getName());
        productDb.setPrice(product.getPrice());
        return productDb;
    }

    @Override
    public void delete(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public Product getById(Long id) {
        return productRepository.getReferenceById(id);
    }

    @Override
    public Page<Product> getPage(Pageable pageable) {
        return productRepository.findAll(pageable);
    }


}
