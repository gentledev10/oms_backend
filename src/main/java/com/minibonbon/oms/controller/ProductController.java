package com.minibonbon.oms.controller;

import com.minibonbon.oms.entity.Product;
import com.minibonbon.oms.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.validation.Valid;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @PostMapping
    public Mono<Product> create(@Valid @RequestBody Product product) {
        return productRepository.save(product);
    }

    @GetMapping
    public Flux<Product> getAll() {
        return productRepository.findAll();
    }
}
