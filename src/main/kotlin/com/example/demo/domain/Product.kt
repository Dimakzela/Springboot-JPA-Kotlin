package com.example.demo.domain

import javax.persistence.*

@Entity
@Table(name = "product")
class Product(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Long,
        @Column
        var name: String,
        @Column
        var price: Float) {

    override fun toString(): String {
        return "Product(name='$name', price=$price)"
    }
}
