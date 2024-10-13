package org.example

// 17
//fun main() {
////    17 -> 2..16/2
////    10329864387241 -> 2..10329864387241/2 -> 2*sqrt(10329864387241)
////    16 -> (2,8), (4,4)
////    25 -> (5,5)
////    125 -> (5, 25)
////    17 -> 2..5
//    var x = readln().toLong() // 8 байт = 64 бит -> 2^64/2-1
//    val bound: Int = Math.sqrt(x.toDouble()).toInt() + 1
//    var count = 0
//    for (i in 2..bound) {
//        if (x % i == 0L) {
//            println("Число составное")
//            println("Первый делитель $i")
//            return // Мгновенное завершение программы
//        }
//        count++
//    }
//    println("Число простое")
//    println("Число проверок $count")
//}

// 5 * 7 = 35
//10^100 * 10^100

//fun main() {
////    if (условие){
////
////    } else {
////
////    }
////
////    if (условие1){
////
////    } else if (условие2) {
////
////    } else if (условие3) {
////
////    }
////        ...
////    else {
////
////    }
//
//    // a, b, max
//    var a = readln().toInt()
//    var b = readln().toInt()
//    var c = readln().toInt()
//    var max: Int
//    var predmax: Int
//    if (a > b) {
//        max = a
//        predmax = b
//    } else {
//        max = b
//        predmax = a
//    }
//    if (c > max) {
//        predmax = max
//        max = c
//    } else if (c > predmax) {
//        predmax = c
//    }
//
//    println(predmax)
//}

//НОК, НОД
// 12/36
// 5/24 + 7/36 = (5*36 + 7*24)/(24*36) = (5*3 + 7*2)/72
// 24 = 2*2*2*3 -> *3 = 72
// 36 = 2*2*3*3
// a * b = НОД(a,b) * НОК(a, b)
// 24 * 36 = 12 * 72 = 864
//Алгоритм Эвклида
//a, b
//fun main() {
//    var a = readln().toInt()
//    var b = readln().toInt()
//    val ab = a * b
//    val nod: Int
//    val nok: Int
//    while (a != b) {
//        if (a > b) {
//            a -= b
//        } else{
//            b -= a
//        }
//    }
//    nod = a
//    nok = ab / nod
//    println(nod)
//    println(nok)
//
//
//}

// a/b + c/d = (a*nok/b + c*nok/d) / nok
//fun main() {
//    var a = readln().toInt()
//    var b = readln().toInt()
//    var c = readln().toInt()
//    var d = readln().toInt()
//
//    val b1 = b
//    val d1 = d
//    val nod: Int
//    val nok: Int
//    while (b != d) {
//        if (b > d) {
//            b -= d
//        } else {
//            d -= b
//        }
//    }
//    nod = d
//    nok = b1 * d1 / nod
//    val chislitel = a * nok / b1 + c * nok / d1
//    val znamenatel = nok
//    println("$chislitel / $znamenatel")
//}

//ДЗ
//1. postmin
//2. a/b + c/d + e/f -> нок(a,b,c) = нок(a,нок(b,c))
// a/b + c/d + e/f = (a*b/нок + с*d/нок + e*f/нок) / нок(b, d, f)
//3. выведет все делители числа 18 ->(2, 9), (3,6)

//fun main() {
//    var a = readln().toInt()
//    var b = readln().toInt()
//    var c = readln().toInt()
//    var d = readln().toInt()
//    var e = readln().toInt()
//    var f = readln().toInt()
//
//    val b1 = b
//    val d1 = d
//    val nod_bd: Int
//    while (b != d) {
//        if (b > d) {
//            b -= d
//        } else {
//            d -= b
//        }
//    }
//    nod_bd = d
//    var nod_bd_f: Int
//
//    var nod_bd1 = nod_bd
//    var f1 = f
//    while (nod_bd1 != f1) {
//        if (nod_bd1 > f1) {
//            nod_bd1 -= f1
//        } else {
//            f1 -= nod_bd1
//        }
//    }
//    nod_bd_f = f1
//    val nok = (b1*d1*f)/nod_bd_f
//    // a/b + c/d + e/f = (a*нок/b + с*нок/d + e*нок/f) / нок(b, d, f)
//    // (a*d*f + c*b*f + e*d*b)/nod / (b*d*f) / nod
////    val chislitel = a * nok / b1 + c * nok / d1 + e*nok / f
//    val chislitel = (a*d1*f + c*b1*f + e*d1*b1)
//    val znamenatel = b1*d1*f
//    println("$chislitel / $znamenatel")
//}


//fun main() {
//
//    var x = readln().toLong()
//    val bound: Int = Math.sqrt(x.toDouble()).toInt() + 1
//    var count = 0
//    for (i in 1..bound) {
//        if (x % i == 0L) {
//            println("$i ${x/i}")
//        }
//    }
//}

// Вложенные циклы

//fun main() {
//    for (i in 10 downTo 1) {
//        for (j in 10 downTo 1) {
//            val res = i*j
//            if (res < 10) {
//                print(" $res ")
//            } else {
//                print("$res ")
//            }
//        }
//        println()
//    }
//}

//height = 8
//       *
//      ***
//     *****
//    *******
//   *********
//  ***********
// *************
//***************
//8 -> 15
//7 -> 13
//6 -> 11

//fun main() {
//    val h = readln().toInt()
//    val base = 2 * h - 1
//    val whiteSpaces = h
//    for (l in 1..h) {
//        for (i in 1..whiteSpaces - l) {
//            print(" ")
//        }
//        for (j in 1..2*l-1) {
//            print("*")
//        }
//        println()
//    }
//}

//fun main() {
//    val h = readln().toInt()
//    val base = 2 * h - 1
//    val whiteSpaces = h
//    for (l in 1..h) {
//        for (i in 1..whiteSpaces - l) {
//            print(" ")
//        }
//        for (j in 1..2 * l - 1) {
//            print("*")
//        }
//        println()
//    }
//    for (l in 1..h) {
//        for (i in 1..l) {
//            print(" ")
//        }
//        for (j in 1..base - 2*l) {
//            print("*")
//        }
//        println()
//    }
//}

//53 -> 159 + 1 = 160
//160 / 2 = 80
//80 * 3 + 1 =
fun main() {
    var x = readln().toInt()
    var count = 0
    while (x != 1) {
        if (x % 2 == 0) {
            x = x / 2
        } else {
            x = 3 * x + 1
        }
        count++
    }
    println(count)
}

// совершенные числа: 26 -> 1, 2, 13
// Найти все совершенные числа до 1000