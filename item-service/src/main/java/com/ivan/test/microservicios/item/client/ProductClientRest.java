package com.ivan.test.microservicios.item.client;

import com.ivan.test.microservicios.item.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "product-service", url = "localhost:8001")
public interface ProductClientRest {
    @GetMapping("product/findAll")
    List<Product> findAll();

    @GetMapping("product/find/{id}")
    Product findById(@PathVariable Integer id);
}
