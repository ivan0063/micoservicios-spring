package com.ivan.test.microservicios.item.service;

import com.ivan.test.microservicios.item.client.ProductClientRest;
import com.ivan.test.microservicios.item.model.Item;
import com.ivan.test.microservicios.item.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ItemService {
    @Autowired
    private ProductClientRest productClientRest;

    public List<Item> findAll() {
        return productClientRest.findAll()
                .stream()
                .map(productOfTheList -> {
                    Item newItem = new Item();
                    newItem.setAmount(1);
                    newItem.setProduct(productOfTheList);

                    return newItem;
                })
                .collect(Collectors.toList());
    }

    public Item findById(Integer id, Integer amount) {
        Product product = productClientRest.findById(id);

        Item newItem = new Item();
        newItem.setProduct(product);
        newItem.setAmount(amount);

        return newItem;
    }
}
