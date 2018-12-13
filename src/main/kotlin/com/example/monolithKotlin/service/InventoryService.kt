package com.example.monolithKotlin.service

import com.example.monolithKotlin.domain.entity.Product

interface InventoryService {

    fun addProduct(product: Product)
    fun listProducts(): List<Product>
}
