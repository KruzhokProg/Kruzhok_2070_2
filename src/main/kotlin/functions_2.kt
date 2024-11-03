package org.example

//fun printStrings(vararg strings: String){
//    for(str in strings)
//        println(str)
//}
//fun main() {
//
//    printStrings("Tom", "Bob", "Sam")
//    printStrings("Kotlin", "JavaScript", "Java", "C#", "C++")
//}
// ------------------------------------------------
//fun sum(vararg numbers: Int){
//    var result=0
//    for(n in numbers)
//        result += n
//    println("Сумма чисел равна $result")
//}
//fun main() {
//
//    sum(1, 2, 3, 4, 5)
//    sum(1, 2, 3, 4, 5, 6, 7, 8, 9)
////    do {
////        val a = readln()
////        println(a)
////    } while (a.isNotEmpty())
//}
// ------------------------------------------------
//Если функция принимает несколько параметров, то обычно vararg-параметр является последним.
//fun printUserGroup(count:Int, vararg users: String){
//    println("Count: $count")
//    for(user in users)
//        println(user)
//}
////
//fun main() {
//
//    printUserGroup(3, "Tom", "Bob", "Alice")
//}
// ------------------------------------------------
//Оператор * (spread operator) (не стоит путать со знаком умножения) позволяет передать параметру в качестве значения элементы из массива:
//fun changeNumbers(vararg numbers: Int, koef: Int){
//    for(number in numbers)
//        println(number * koef)
//}
//fun main() {
//
//    val nums = intArrayOf(1, 2, 3, 4)
//    changeNumbers(*nums, koef=2)
//}
// ------------------------------------------------
////Перегрузка функций
//fun sum(a: Int, b: Int) : Int{
//    return a + b
//}
//fun sum(a: Double, b: Double) : Double{
//    return a + b
//}
//fun sum(a: Int, b: Int, c: Int) : Int{
//    return a + b + c
//}
//fun sum(a: Int, b: Double) : Double{
//    return a + b
//}
//fun sum(a: Double, b: Int) : Double{
//    return a + b
//}
//fun main() {
//
//    val a = sum(1, 2)
//    val b = sum(1.5, 2.5)
//    val c = sum(1, 2, 3)
//    val d = sum(2, 1.5)
//    val e = sum(1.5, 2)
//}
// ------------------------------------------------
//Функция как параметр функции
//fun main() {
//    displayMessage(::morning)
//    displayMessage(::evening)
//}
//fun displayMessage(mes: () -> Unit){
//    println("Common")
//    mes()
//}
//
//fun morning(){
//    println("Good Morning")
//}
//fun evening(){
//    println("Good Evening")
//}

fun main() {

    action(5.0, 3.0, ::sum)         // 8
    action(5.0, 3.0, ::multiply)    // 15
    action(5.0, 3.0, ::subtract)    // 2
    action(5.0, 3.0, ::devide)    // 2
}

fun action (n1: Double, n2: Double, op: (Double, Double)-> Double){
    val result = op(n1, n2)
    println(result)
}
fun sum(a: Double, b: Double): Double{
    return a + b
}
fun subtract(a: Double, b: Double): Double{
    return a - b
}
fun multiply(a: Double, b: Double): Double{
    return a * b
}

fun devide(a: Double, b: Double): Double{
    return a/b
}