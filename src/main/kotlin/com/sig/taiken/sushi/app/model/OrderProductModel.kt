package com.sig.taiken.sushi.app.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.Table

@Entity
@Table(name = "order_product")
data class OrderProductModel (
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @ManyToOne
    @JoinColumn(name = "order_id")
    val order: CustomerOrderModel,

    @ManyToOne
    @JoinColumn(name = "product_id")
    val product: ProductModel,

    val amount: Int
)