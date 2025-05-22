package com.sig.taiken.sushi.app.model

import jakarta.persistence.Id
import org.springframework.data.mongodb.core.mapping.Document

    @Document("recipe")
data class RecipeModel (

    @Id val id: String? = null,
    val name: String,
    val ingredients: List<Ingredient>,
    val modePreparation: String
)

data class Ingredient(
    val name: String,
    val amount: String
)