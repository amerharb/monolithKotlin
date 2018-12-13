package com.example.monolithKotlin.data

import com.example.monolithKotlin.domain.entity.Product
import org.springframework.data.repository.CrudRepository

interface ProductRepository : CrudRepository<Product, Long> {

    override fun findAll(): List<Product>

}
