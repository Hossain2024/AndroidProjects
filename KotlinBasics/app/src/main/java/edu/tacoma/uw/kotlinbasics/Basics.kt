package edu.tacoma.uw.kotlinbasics



fun main(){
    //Immutable List - cant  add items after this initialization
//    val shopppingList =listOf("processor", "RAM", "Graphics Card", "SSD" )

    // mutable - we can add item,s after thisd
    val shoppingList = mutableListOf("processor", "RAM", "Graphics Card", "SSD" )
    shoppingList.add("cooling System")
    shoppingList.remove("Graphics  Card RTX 3060")
    shoppingList.add("Graphhics Card RTX 4090")
//    println(shoppingList)

//    for(item in shoppingList){
//        println(item)
//
//    }

    for (index in 0 until shoppingList.size){
        println("item ${shoppingList[index]} is at index $index")
    }
}






//data class CofeeDetails(val sugarCount: Int,
//                        val name:String,
//                        val size: String,
//                        val creamAmount:Int)
//fun main() {
//    val coffeForDenis = CofeeDetails(0, "denis", "XXL", 0 )
//
//
//}
//
//
//
////    println("Enter Number 1")
////    val num1Str = readln()
////    val num1Int = num1Str.toInt()
////
////    val num2Str = readln()
////    val num2Int = num2Str.toInt()
////    val myResult = add(num1Int, num2Int)
////    println(myResult)
//
//
//
//
//
//fun makeCoffee(cofeeDetails: CofeeDetails){
//    if (cofeeDetails.sugarCount == 1){
//        println("coffe with ${cofeeDetails.sugarCount} " + "spoons of sugar for ${cofeeDetails.name}")
//    }else if (cofeeDetails.sugarCount == 0){
//        println("cofee with no sugar for ${cofeeDetails.name}"+ "spoons of sugar for ${cofeeDetails.name}")
//    }else{
//        println("Coffee with ${cofeeDetails.sugarCount}"+ "spoons of sugar for ${cofeeDetails.name}")
//    }
//}
//
//fun add(num1:Int, num2:Int):Int{
//    val result = num1+num2
//    return result
//}
//
//fun divide(num1:Int, num2:Int):Double{
//    val result = num1/num2.toDouble()
//    return result
//}
