package com.sig.taiken.sushi.app.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime

@Document("feedback")
data class FeedbackModel(

    @Id val id: String? = null,
    val orderId: Long,
    val clientId: Long,
    val note: Int,
    val comment: String? = null,
    val dateTime: LocalDateTime = LocalDateTime.now()
)
