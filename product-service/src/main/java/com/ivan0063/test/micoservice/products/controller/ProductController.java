package com.ivan0063.test.micoservice.products.controller;

import com.ivan0063.test.micoservice.products.entity.Product;
import com.ivan0063.test.micoservice.products.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityNotFoundException;

@RestController
@RequestMapping("product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("findAll")
    public ResponseEntity findAllProducts() {
        return ResponseEntity.ok(productService.findAll());
    }

    @GetMapping("find/{id}")
    public ResponseEntity findById(@PathVariable Integer id) throws EntityNotFoundException {
        return ResponseEntity.ok(productService.findById(id));
    }
}
