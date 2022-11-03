package com.michal.shop.mapper;

import com.michal.shop.model.dao.Product;
import com.michal.shop.model.dto.ProductDto;

public interface ProductMapper {
    ProductDto daoToDto(Product product);
    Product dtoToDao(ProductDto productDto);
}
