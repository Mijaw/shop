package com.michal.shop.mapper.impl;

import com.michal.shop.mapper.ProductMapper;
import com.michal.shop.model.dao.Product;
import com.michal.shop.model.dto.ProductDto;
import org.springframework.stereotype.Component;

@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public ProductDto daoToDto(Product product) {
        return ProductDto.builder()
                .id(product.getId())
                .name(product.getName())
                .quantity(product.getQuantity())
                .price(product.getPrice())
                .build();
    }

    @Override
    public Product dtoToDao(ProductDto productDto) {
        return Product.builder()
                .id(productDto.getId())
                .name(productDto.getName())
                .quantity(productDto.getQuantity())
                .price(productDto.getPrice())
                .build();
    }
}
