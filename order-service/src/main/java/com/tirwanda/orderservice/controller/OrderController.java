package com.tirwanda.orderservice.controller;

import com.tirwanda.orderservice.dto.OrderDto;
import com.tirwanda.orderservice.dto.OrderRequest;
import com.tirwanda.orderservice.service.OrderServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class OrderController {

    private final OrderServiceImpl orderService;

    @PostMapping("/order")
    @ResponseStatus(HttpStatus.CREATED)
    public String placeOrder(@RequestBody OrderRequest orderRequest) {
        orderService.placeOrder(orderRequest);
        return "Order Placed Successfully";
    }

    @GetMapping("/orders")
    @ResponseStatus(HttpStatus.FOUND)
    public List<OrderDto> getAllOrder() {
        return orderService.getOrders();
    }
}
