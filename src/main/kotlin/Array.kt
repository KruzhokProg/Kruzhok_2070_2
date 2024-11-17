package org.example

import kotlin.math.abs
import kotlin.math.sqrt

fun main() {
//    val numbers = arrayOf(10, 400, -8, 9, 45, -56)
//    val size = numbers.size
//    val lastIndex = size - 1
//    println(numbers[0])
//    println(numbers[lastIndex])
//    for (i in 0..lastIndex){
//        if (i % 2 == 0) {
//            print("${numbers[i]} ")
//        }
//    }
//    println()
//    numbers.forEach { number ->
//        print("$number ")
//    }
//    println()
//    numbers.forEachIndexed { index, number ->
//        if (index % 2 == 0 ) {
//            print("$number ")
//        }
//    }
//    println()
//    numbers.forEachIndexed { index, number ->
//        if (index % 2 == 0 ) {
//            numbers[index] = number * 2
//        } else {
//            numbers[index] = number * 3
//        }
//    }
//    numbers.forEach { print("$it ") }
//    println()
//    val res = numbers.mapIndexed { index, number ->
//        if (index % 2 == 0 ) {
//            number * 2
//        } else {
//            number * 3
//        }
//    }
//    println(res.toString())
//    numbers.filter { it > 0 }.mapIndexed { index, number ->
//        if (index % 2 == 0 ) {
//            number * 2
//        } else {
//            number * 3
//        }
//    }.forEach { print("$it ") }
    // Исходный массив, заполненный произвольными числами
    // привести к виду согласно следующему алгоритму:
    // если число чётное и стоит на чётном месте,
    // то возвести его в квадрат
    // если число нечётное и стоит на нечётном месте, то возвести его
    // в куб
    // иначе взять корень из модуля этого числа
//    val numbers = arrayOf(10, 400, -8, 9, 45, -56)
//    numbers.mapIndexed { index, number ->
//        if (index % 2 == 0 && number % 2 == 0) {
//            number * number
//        } else if (index % 2 != 0 && number % 2 != 0) {
//            number * number * number
//        } else {
//            sqrt(abs(number*1.0))
//        }
//    }.forEach { print("$it ") }
    // Исходный массив, заполненный произвольными числами
    // привести к виду согласно следующему алгоритму:
    // оставить в массиве только числа, которые являются квадратом числа
    // и вывести их корень
//    val numbers = arrayOf(10, 400, -8, 9, 16, -56)
//    numbers
//        .filter { sqrt(abs(it*1.0)) == sqrt(abs(it*1.0)).toInt()*1.0 }
//        .map { sqrt(abs(it*1.0)).toInt() }
//        .forEach { print("$it ") }
    // Поменять местами максимальный и минимальный элементы
//    val numbers = arrayOf(10, 400, -8, 9, 16, -56)
//    val lastIndex = numbers.size - 1
//    var min: Int = numbers[0]
//    var max: Int = numbers[0]
//    var iMax: Int = 0
//    var iMin: Int = 0
//    for (i in 0..lastIndex) {
//        if (numbers[i] > max) {
//            max = numbers[i]
//            iMax = i
//        } else if (numbers[i] < min) {
//            min = numbers[i]
//            iMin = i
//        }
//    }
//    println("$max - $iMax")
//    println("$min - $iMin")

    // 2 версия - оптимизация
//    val numbers = arrayOf(1000, 400, -8, 9, 16, -56)
//    val lastIndex = numbers.size - 1
//    var iMax: Int = 0
//    var iMin: Int = 0
//    for (i in 0..lastIndex) {
//        if (numbers[i] > numbers[iMax]) {
//            iMax = i
//        } else if (numbers[i] < numbers[iMin]) {
//            iMin = i
//        }
//    }
//    println("${numbers[iMax]} - $iMax")
//    println("${numbers[iMin]} - $iMin")
//    val tmp = numbers[iMax]
//    numbers[iMax] = numbers[iMin]
//    numbers[iMin] = tmp
//    numbers.forEach { print("$it ") }

//    3 версия оптимизации
//    val numbers = arrayOf(1000, 400, -8, 9, -160, -56)
//    val iMax = numbers.indexOf(numbers.max())
//    val iMin = numbers.indexOf(numbers.min())
//    val tmp = numbers[iMax]
//    numbers[iMax] = numbers[iMin]
//    numbers[iMin] = tmp
//    numbers.forEach { print("$it ") }
    // посчитать сумму между минимальным и максимальными элементами
    val numbers = arrayOf(1000, 400, -8, 9, -160, -56)
    var iMax = numbers.indexOf(numbers.max())
    var iMin = numbers.indexOf(numbers.min())
    if (iMin > iMax) {
        val tmp = iMax
        iMax = iMin
        iMin = tmp
    }
    val res = numbers.filterIndexed { index, number ->
        index in (iMin + 1)..<iMax
    }.sum()
    println(res)
//    ДЗ:
//    1. Есть ли в массиве одинаковые числа
//    2. Удалить повторяющиеся элементы из массива
//    3. Найти два максимальных элемента массива
}