package com.tirwanda.inventoryservice.controller;

import com.tirwanda.inventoryservice.dto.InventoryRequest;
import com.tirwanda.inventoryservice.service.InventoryServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class InventoryController {

    private final InventoryServiceImpl inventoryService;

    @GetMapping("/inventory/{skuCode}")
    @ResponseStatus(HttpStatus.OK)
    public Boolean isInStock(@PathVariable("skuCode") String skuCode) {
        return inventoryService.isInStock(skuCode);
    }

    @PostMapping("/inventory")
    @ResponseStatus(HttpStatus.CREATED)
    public void addInventory(@RequestBody InventoryRequest inventoryRequest) {
        inventoryService.addInventory(inventoryRequest);
    }
}
