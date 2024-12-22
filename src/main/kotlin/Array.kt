package org.example

import kotlin.math.abs
import kotlin.math.max
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
//    val numbers = arrayOf(1000, 400, -8, 9, -160, -56)
//    var iMax = numbers.indexOf(numbers.max())
//    var iMin = numbers.indexOf(numbers.min())
//    if (iMin > iMax) {
//        val tmp = iMax
//        iMax = iMin
//        iMin = tmp
//    }
//    val res = numbers.filterIndexed { index, number ->
//        index in (iMin + 1)..<iMax
//    }.sum()
//    println(res)
//    ДЗ:
//    1. Есть ли в массиве одинаковые числа
//    2. Удалить повторяющиеся элементы из массива
//    3. Найти два максимальных элемента массива

    // Перебор(примитивный подход)
//    val numbers = arrayOf(1000, 400, -8, 9, 400, -56)
//    val lastIndex = numbers.size - 1
//    for (i in 0..lastIndex) {
//        val elementToCheck = numbers[i]
//        for (j in i+1..lastIndex) {
//            if (elementToCheck == numbers[j]) {
//                println("Есть дубликат: $elementToCheck")
//                return
//            }
//        }
//    }
//    println("Нет дубликатов")
//    1 n-1
//    2 n-2
//    3 n-3
//    ...
//    n-1 1
//    (n-1) + (n-2) + (n-3) + ... + 1
//    1 + 2 + 3 + ... + (n-1) = (1 + n - 1)/2*(n-1) = n*(n-1) / 2 -> n*n/2 -> n*n -> n^2
//    1 + 2 + 3 + ... + 10 = (a1 + an)/2*n = (1 + 10) / 2 * 10 = 55
//    1 + 2 + 3 + ... + 115 = (a1 + an)/2*n = (1 + 115) / 2 * 115 = 6670
    // Оптимизация
//    val numbers = arrayOf(1000, 400, -8, 9, 40, -56)
//    val lastIndex = numbers.size - 1
//    numbers.sort() // in-place n * log2(n)
    //    n^2  >>  n * log2(n) + n
//  100   100^2    100*7
//  1000  1000^2   1000*10
//    println(numbers.joinToString(separator = " "))
//    for (i in 0..<lastIndex) {
//        if (numbers[i] == numbers[i+1]) {
//            println("Есть дубликат ${numbers[i]}")
//            return
//        }
//    }
//    println("Нет дубликатов")

//    2. Удалить повторяющиеся элементы из массива
//    val numbers = arrayOf(1000, 400, 8, 9, 400, 8)
//    val lastIndex = numbers.size - 1
//    for (i in 0..lastIndex) {
//        val elementToCheck = numbers[i]
//        for (j in i+1..lastIndex) {
//            if (elementToCheck == numbers[j]) {
//                numbers[i] = -1
//                numbers[j] = -1
//            }
//        }
//    }
//    println(numbers.joinToString(separator = " "))
//    val res = numbers.filter { it != -1}
//    println(res.joinToString(separator = " "))

    //    2. Удалить повторяющиеся элементы из массива
//    val numbers = arrayOf(1000, 400, 8, 9, 400, 8)
//    val dublicates = Array(numbers.size){ "-" }
//    var freeIndex = 0
//    val lastIndex = numbers.size - 1
//    for (i in 0..lastIndex) {
//        val elementToCheck = numbers[i]
//        for (j in i+1..lastIndex) {
//            if (elementToCheck == numbers[j]) {
//                dublicates[freeIndex] = elementToCheck.toString()
//                freeIndex++
//            }
//        }
//    }
//    println(dublicates.joinToString(separator = " "))
//    val res = numbers.filter { it.toString() !in dublicates }
//    println(res.joinToString(separator = " "))
//    val res2 = res + dublicates.filter { it != "-" }.map { it.toInt() }
//    println(res2.joinToString(separator = " "))

//    2. Удалить повторяющиеся элементы из массива (Отимизация)
//    val numbers = arrayOf(1000, 400, 8, 9, 400, 8)
//    val unique = numbers.toSet()
//    println(unique)

//    3. Найти два максимальных элемента массива
//    val numbers = arrayOf(1000, 400, 1000, 9, 40, 8)
//    val unique = numbers.toSet()
//    val lastIndex = unique.size - 1
//    val sortedUnique = unique.sorted()
//    val max = sortedUnique[lastIndex]
//    val predmax = sortedUnique[lastIndex - 1]
//    println("$max $predmax")

    // 1. Найти в массиве самую длинную неубывающую подпоследовательность
//    val numbers = arrayOf(1000, 400, 1000, 1000, 1500, 9, 40, 8)
//    val lastIndex = numbers.size - 1
//    var count = 1
//    var maxCount = 0
//    for (i in 0..<lastIndex) {
//        if (numbers[i+1] >= numbers[i]) {
//            count += 1
//        } else {
//            maxCount = max(maxCount, count)
//            count = 1
//        }
//    }
//    println(maxCount)

//    Найти индексы двух элементов, которые дают нужную сумму
//    [1, 40, 3, -5, 0, 6, 12]
//    target = 3
//    ответ: [2, 4]
//    val numbers = arrayOf(1000, 400, 100, 1, 1500, 9, 40, 8)
//    val target = 10
//    val sortedNumbers = numbers.sorted()
//    println(sortedNumbers.joinToString(separator = " "))
//    var l = 0
//    var r = sortedNumbers.size - 1
//    while (l < r) {
//        if (sortedNumbers[l] + sortedNumbers[r] < target) {
//            l++
//        } else if (sortedNumbers[l] + sortedNumbers[r] > target) {
//            r--
//        } else {
//            val firstIndex = numbers.indexOf(sortedNumbers[l])
//            val secondIndex = numbers.indexOf(sortedNumbers[r])
//            println("$firstIndex $secondIndex")
//            return
//        }
//    }
//    println("Нет такой пары чисел")
//}

// ДЗ
// 1. Найти индексы трёх элементов, которые дают нужную сумму
// 2. Найти самую длинную подпоследовательность возрастания-убывания чисел и вывести количество элементов в ней
//[1, 2, 3, 4, 5, 3, 2, 1]

//    ДЗ Найти три числа в массиве = target

//    1. Plus One
//    You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer.
//    The digits are ordered from most significant to least significant in left-to-right order.
//    The large integer does not contain any leading 0's.
//    Increment the large integer by one and return the resulting array of digits.
//        16 байт -> 10^38
//        38*4 = 152 бит -> 19 байт
//        value = 1..10^38
//        n = 1000
//        1000*16 = 16000 байт
//        500*19 + 500*1 = 10000 байт
//        500*10 + 500*1 = 5000
//    Input: digits = [1,2,3]
//    Output: [1,2,4]
//    Explanation: The array represents the integer 123.
//    Incrementing by one gives 123 + 1 = 124.
//    Thus, the result should be [1,2,4].

//    Input: digits = [9]
//    Output: [1,0]
//    Explanation: The array represents the integer 9.
//    Incrementing by one gives 9 + 1 = 10.
//    Thus, the result should be [1,0].

//        val input1 = arrayOf(9, 9)
//        val input2 = arrayOf(9, 9, 9)
//        val number = 8
//        val output = Array(input.size + 1) { 0 }
//        val lastIndex = input.size - 1
//        var carry = 0
//        var sum = number
//        var i = lastIndex
//        while (i >= 0) {
//            sum += input[i] + carry
//            output[i + 1] = sum % 10
//            carry = sum / 10
//            sum = 0
//            i--
//        }
//        output[i + 1] = carry
//        println(output.joinToString(separator = " "))

    // Версия Артемия
        val input = arrayOf(9, 9)
        var number = 0
        var number2 = 0
        val number1 = arrayOf(9, 9, 1)
        for (q in 0..number1.size - 1) {
            for (w in number1.size - 1 - q downTo 0) {
                if (number2 == 0) {
                    number2 = number1[q]
                } else {
                    number2 = number2 * 10
                }
            }
            number = number2 + number
            number2 = 0
        }
        val output = Array(input.size + 1) { 0 }
        val lastIndex = input.size - 1
        var carry = 0
        var sum = number
        var i = lastIndex
        while (i >= 0) {
            sum += input[i] + carry
            output[i + 1] = sum % 10
            carry = sum / 10
            sum = 0
            i--
        }
        output[i + 1] = carry
        println(output.joinToString(separator = " "))


    }

//ДЗ: [1, 9, 9] + [9, 9, 8] -> [1,1,9,7]

//    2. Search Insert Position
//    Given a sorted array of distinct integers and a target value, return the index if the target is found.
//    If not, return the index where it would be if it were inserted in order.
//    You must write an algorithm with O(log n) runtime complexity.
//    Example 1:
//
//    Input: nums = [1,3,5,6], target = 5
//    Output: 2
//    Example 2:
//
//    Input: nums = [1,3,5,6], target = 2
//    Output: 1
//    Example 3:
//
//    Input: nums = [1,3,5,6], target = 7
//    Output: 4
// Бинарный поиск*
//[1, 3, 5, 6, 9, 10, 15]
//  target =  13