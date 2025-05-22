package com.sig.taiken.sushi.app.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.OneToOne
import jakarta.persistence.Table
import java.time.LocalDateTime

@Entity
@Table(name = "delivery")
data class DeliveryModel (

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @OneToOne
    @JoinColumn(name = "order_id")
    val order: CustomerOrderModel,

    val deliveryPersonName: String? = null,

    val deliveryDate: LocalDateTime? = null
)