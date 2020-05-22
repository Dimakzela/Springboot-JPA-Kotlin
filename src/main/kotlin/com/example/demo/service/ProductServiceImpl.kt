package com.example.demo.service

import com.example.demo.domain.Product
import com.example.demo.repository.ProductRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ProductServiceImpl(@Autowired val productRepository: ProductRepository): ProductService {
    override fun createProduct(product: Product) {
        productRepository.save(product)
    }

    override fun findProductsByName(name: String): List<Product> {
        return productRepository.findProductsByName(name)
    }
}
