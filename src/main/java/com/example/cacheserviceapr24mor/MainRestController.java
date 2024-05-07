package com.example.cacheserviceapr24mor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class MainRestController {

    ProductRepository productRepository;

    MainRestController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("get/all/products")
    public ResponseEntity<List<Product>> getAllProducts()
    {
        return ResponseEntity.ok(productRepository.findAll());
    }
}
