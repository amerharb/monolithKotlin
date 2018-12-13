package com.example.monolithKotlin.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

import com.example.monolithKotlin.data .ProductRepository
import com.example.monolithKotlin.domain.entity.Product

@Service
open class InventoryServiceImpl
@Autowired
constructor(private val productRepository: ProductRepository) : InventoryService {

    override fun addProduct(product: Product) {
        productRepository.save(product)
    }

    override fun listProducts(): List<Product> {
        return productRepository.findAll()
    }
}
