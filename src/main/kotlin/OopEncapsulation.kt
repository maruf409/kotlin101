package org.home

class OopEncapsulation(var accountHolder: String, initialBalance: Double) {

    private var balance: Double = initialBalance

    val currentBalance: Double
        get() = balance

    fun deposit(amount: Double) {
        balance += amount
        println("Deposited $amount")
    }

    fun withdraw(amount: Double) {
        if (amount > 0 && amount <= balance) {
            balance -= amount
            println("Withdrawed $amount")
        } else {
            println("Withdraw failed")
        }
    }
}