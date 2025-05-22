package com.sig.taiken.sushi.app.model

import com.sig.taiken.sushi.app.enums.OrderStatus
import com.sig.taiken.sushi.app.enums.OrderType
import jakarta.persistence.CascadeType
import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.OneToMany
import jakarta.persistence.Table
import java.time.LocalDateTime

@Entity
@Table(name = "customer_order")
data class CustomerOrderModel(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @ManyToOne
    @JoinColumn(name = "client_id")
    val client: ClientModel,

    @Enumerated(EnumType.STRING)
    val type: OrderType,

    @Enumerated(EnumType.STRING)
    val status: OrderStatus,

    val dateTime: LocalDateTime = LocalDateTime.now(),

    @OneToMany(mappedBy = "order", cascade = [CascadeType.ALL], orphanRemoval = true)
    val items: List<OrderProductModel> = emptyList(),

    @ManyToOne
    @JoinColumn(name = "employee_id")
    val employee: EmployeeModel,
)