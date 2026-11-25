package com.example.triviaapprico.model

data class Question(
    val id: Int,
    val category: String,
    val text: String,
    val options: List<String>,
    val correctAnswerIndex: Int
)