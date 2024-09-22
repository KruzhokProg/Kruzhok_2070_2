package org.example

//fun main() {
//    // факториал
////    5! = 5*4*3*2*1 = 120 = 1*2*3*4*5
////    0! = 1
////    2^0 = 1
////    3/2^0 = 1
//    print("Введите число m: ")
//    var m = readln().toInt()
//    print("Введите число n: ")
//    var n = readln().toInt()
//    var fn = 1
//    for (i in 1..n) {
//        fn = fn * i
//    }
//
//    var fm = 1
//    for (i in 1..m) {
//        fm = fm * i
//    }
//
//    var fnm = 1
//    for (i in 1..(n-m)) {
//        fnm = fnm * i
//    }
//
//    var cnm = fn / (fm * fnm)
//    println(cnm)
//}

//3
//3 0
//2 1
//1 2
//0 3
//fun main() {
//    var a = readln().toInt() // 3
//    for (i in 0..a) { // 0, 1, 2
//        println("${a - i} $i") // 3 0, 2 1, 1 2
//    }
//}

//последовательность Фиббоначи
//1 1 2 3 5 8 13 ...
fun main() {
    var v1 = 1
    var v2 = 1
    var next = 2
    var n =readln().toInt()
    for (i in 1..n) {
        print("${v2*1.0/v1} ")
        v1 = v2
        v2 = next
        next = v1 + v2
    }
}
// 1 1 1 3 5 9 ...