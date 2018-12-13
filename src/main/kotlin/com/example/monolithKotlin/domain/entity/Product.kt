package com.example.monolithKotlin.domain.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.validation.constraints.NotNull

@Entity
open class Product {
    @Id
    @GeneratedValue
    private val id: Long? = null
    @NotNull
    private val name: String? = null
}
