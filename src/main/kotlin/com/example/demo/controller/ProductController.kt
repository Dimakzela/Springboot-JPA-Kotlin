package com.example.demo.controller

import com.example.demo.domain.Product
import com.example.demo.service.ProductService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("api/v1/products")
class ProductController(@Autowired val productService: ProductService) {

    @PostMapping
    fun createProduct(@RequestBody product: Product) {
        productService.createProduct(product)
    }

    @GetMapping("{name}")
    fun getProductsByName(@PathVariable("name") name: String): List<Product> {
        return productService.findProductsByName(name)
    }
}
