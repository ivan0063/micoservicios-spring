package com.ivan.test.microservicios.item.model;

import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

@Data
public class Product implements Serializable {
    private Integer id;
    private String nombre;
    private Double precio;
    private Timestamp createdAt;
}
