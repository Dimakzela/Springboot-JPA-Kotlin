package com.example.demo.service

import com.example.demo.domain.Product

interface ProductService {
    fun createProduct(product: Product)
    fun findProductsByName(name: String): List<Product>
}
