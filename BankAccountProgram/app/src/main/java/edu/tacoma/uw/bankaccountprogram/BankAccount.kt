package edu.tacoma.uw.bankaccountprogram

class BankAccount(var accountHolder:String, var balance: Double) {
    private val transactionHistroy = mutableListOf<String>()


    fun deposit(amount:Double){
        balance+=amount
        transactionHistroy.add("$accountHolder deposited $$amount")

    }
    fun withdraw(amount:Double){
        if (amount <= balance){
            //we cant withdraw
            balance-=amount
            transactionHistroy.add("$accountHolder withdrew $$amount")
        }else{
            // we cannot withdraw amount
            println("you dont have enough balance to withdraw")
        }

    }
    fun displayTransactionHistory(){
        println("transaction histroy for $accountHolder")
        for (transaction in transactionHistroy){
            println(transaction)
        }

    }
}