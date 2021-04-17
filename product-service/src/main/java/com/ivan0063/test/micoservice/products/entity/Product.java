package com.ivan0063.test.micoservice.products.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Data
public class Product implements Serializable {
    @Id
    @GeneratedValue
    private Integer id;
    private String nombre;
    private Double precio;
    @Column(name = "created_at")
    private Timestamp createdAt;
}
