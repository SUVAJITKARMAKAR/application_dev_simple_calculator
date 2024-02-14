package com.example.calculatorapplicaition

sealed class CalculatorActions {
    data class Number (val number: Int) : CalculatorActions()
    data object Clear: CalculatorActions()
    data object Delete: CalculatorActions()
    data object Calculate: CalculatorActions()
    data object Decimal: CalculatorActions()
    data class Operation(val operations: CalculatorOperation): CalculatorActions()
}