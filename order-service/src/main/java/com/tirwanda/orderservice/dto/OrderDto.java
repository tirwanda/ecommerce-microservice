package com.tirwanda.orderservice.dto;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDto {

    private Long id;

    private String orderNumber;

    private List<OrderLineItemsDto> orderLineItemsList;
}
