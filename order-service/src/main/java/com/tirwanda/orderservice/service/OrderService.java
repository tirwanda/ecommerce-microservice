package com.tirwanda.orderservice.service;

import com.tirwanda.orderservice.dto.OrderDto;
import com.tirwanda.orderservice.dto.OrderRequest;

import java.util.List;

public interface OrderService {
    void placeOrder(OrderRequest orderRequest);
    List<OrderDto> getOrders();
}
