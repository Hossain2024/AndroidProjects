package edu.tacoma.uw.bankaccountprogram

fun main(){
    val denisesBankAccount = BankAccount("Denis panjuta", 13570.90 )
    denisesBankAccount.deposit(200.00)
    denisesBankAccount.withdraw(1200.00)
    denisesBankAccount.deposit(3000.00)
    denisesBankAccount.deposit(2000.00)
    denisesBankAccount.withdraw(3333.15)

    println(denisesBankAccount.displayTransactionHistory())
    println("current balance ${denisesBankAccount.balance}")
}