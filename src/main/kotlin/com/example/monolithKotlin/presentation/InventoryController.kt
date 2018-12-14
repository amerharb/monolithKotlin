package com.example.monolithKotlin.presentation

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

import com.example.monolithKotlin.domain.entity.Product
import com.example.monolithKotlin.service.InventoryService

@RequestMapping("/api/inventory-service")
@RestController
class InventoryController(@Autowired private val inventoryService: InventoryService) {

    @PostMapping("/products")
    fun addProduct(@RequestBody product: Product) {
        inventoryService.addProduct(product)
    }

    @GetMapping("/products")
    fun listProducts(): List<Product> {
        return inventoryService.listProducts()
    }
}
