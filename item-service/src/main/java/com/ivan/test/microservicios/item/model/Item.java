package com.ivan.test.microservicios.item.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Item implements Serializable {
    private Product product;
    private Integer amount;

    public Double getTotal() {
        return this.product.getPrecio() * this.amount.doubleValue();
    }
}
