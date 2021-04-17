package com.ivan.test.microservicios.item.controller;

import com.ivan.test.microservicios.item.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("item")
public class ItemController {
    @Autowired
    private ItemService itemService;

    @GetMapping("/findAll")
    public ResponseEntity findAll() {
        return ResponseEntity.ok(itemService.findAll());
    }

    @GetMapping("/find/{id}/amount/{amount}")
    public ResponseEntity findById(@PathVariable Integer id, @PathVariable Integer amount) {
        return ResponseEntity.ok(itemService.findById(id, amount));
    }
}
