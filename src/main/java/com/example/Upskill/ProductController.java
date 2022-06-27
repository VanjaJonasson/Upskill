package com.example.Upskill;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {

    @Autowired
    private ProductRepository repository;

    @GetMapping("/products")
    public List<Product> products() {
        return (List<Product>) repository.findAll();
    }

    @GetMapping("/product/{id}")
    public Product books(@PathVariable Long id) {
        return repository.findById(id).get();
    }
}


