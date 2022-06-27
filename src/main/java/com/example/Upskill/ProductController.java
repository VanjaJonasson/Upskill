package com.example.Upskill;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductRepository repository;

    @GetMapping("/products")
    public List<Product> products() {
        return (List<Product>) repository.findAll();
    }

}
