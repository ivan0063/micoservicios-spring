package com.ivan0063.test.micoservice.products.service;

import com.ivan0063.test.micoservice.products.entity.Product;
import com.ivan0063.test.micoservice.products.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product findById(Integer id) throws EntityNotFoundException {
        return productRepository.findById(id)
                .orElseThrow(EntityNotFoundException::new);
    }
}
