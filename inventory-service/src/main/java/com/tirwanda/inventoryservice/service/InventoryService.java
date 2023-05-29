package com.tirwanda.inventoryservice.service;

import com.tirwanda.inventoryservice.dto.InventoryRequest;
import com.tirwanda.inventoryservice.dto.InventoryResponse;

public interface InventoryService {
    Boolean isInStock(String skuCode);
    void addInventory(InventoryRequest inventoryRequest);
}
