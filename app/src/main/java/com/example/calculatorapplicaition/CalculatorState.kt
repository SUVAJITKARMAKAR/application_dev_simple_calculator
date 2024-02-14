package com.example.calculatorapplicaition

data class CalculatorState(
    val number1: String ="",
    val number2: String="",
    val operation: CalculatorOperation ? = null
)
