package com.michal.shop.controller;

import com.michal.shop.mapper.ProductMapper;
import com.michal.shop.model.dao.Product;
import com.michal.shop.model.dto.ProductDto;
import com.michal.shop.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/vi/products")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;
    private final ProductMapper productMapper;

    @GetMapping("/{id}")
    public ProductDto getProductById(@PathVariable Long id) {
        return productMapper.daoToDto(productService.getById(id));
    }

    @PostMapping
    public ProductDto saveProduct(@RequestBody ProductDto product) {
        return productMapper.daoToDto(productService.save(productMapper.dtoToDao(product)));
    }

    @PutMapping("/{id}")
    public ProductDto updateProduct(@RequestBody ProductDto product, @PathVariable Long id) {
        return productMapper.daoToDto(productService.update(productMapper.dtoToDao(product), id));
    }

    @GetMapping()
    public Page<ProductDto> getProductPage(@RequestParam int page, @RequestParam int size) {
        return productService.getPage(PageRequest.of(page, size)).map(productMapper::daoToDto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        productService.delete(id);
    }
}
