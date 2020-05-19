package com.minibonbon.oms.controller;

import com.minibonbon.oms.entity.Order;
import com.minibonbon.oms.repository.OrderRepository;
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
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    @PostMapping
    public Mono<Order> create(@Valid @RequestBody Order order) {
        return orderRepository.save(order);
    }

    @GetMapping
    public Flux<Order> getAll() {
        return orderRepository.findAll();
    }
}
