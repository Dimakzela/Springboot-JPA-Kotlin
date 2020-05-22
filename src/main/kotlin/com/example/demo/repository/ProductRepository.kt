package com.example.demo.repository

import com.example.demo.domain.Product
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface ProductRepository: CrudRepository<Product, Long> {
    fun findProductsByName(name: String): List<Product>
}
