package com.example.monolithKotlin.domain.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Product(@Id @GeneratedValue val id: Long, val name: String)