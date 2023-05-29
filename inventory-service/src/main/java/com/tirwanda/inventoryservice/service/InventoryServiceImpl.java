package com.tirwanda.inventoryservice.service;

import com.tirwanda.inventoryservice.dto.InventoryRequest;
import com.tirwanda.inventoryservice.dto.InventoryResponse;
import com.tirwanda.inventoryservice.model.Inventory;
import com.tirwanda.inventoryservice.repository.InventoryRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
@RequiredArgsConstructor
@Transactional
public class InventoryServiceImpl implements InventoryService{

    private final InventoryRepository inventoryRepository;

    @Override
    @Transactional(readOnly = true)
    public Boolean isInStock(String skuCode) {
        log.info("Checking Sku-Code: {} Is In Stock", skuCode);
        return inventoryRepository.findBySkuCode(skuCode).isPresent();
    }

    @Override
    public void addInventory(InventoryRequest inventoryRequest) {
        log.info("Add inventory with SKU-CODE : {}", inventoryRequest.getSkuCode());
        Inventory inventory = Inventory.builder()
                .quantity(inventoryRequest.getQuantity())
                .skuCode(inventoryRequest.getSkuCode())
                .build();

        inventoryRepository.save(inventory);
    }
}
