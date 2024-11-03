package org.example

import kotlin.math.abs

fun max2(x: Double, y: Double): Double {
    val max: Double
    if (x > y) {
        max = x
    } else {
        max = y
    }
    return max
}

fun max3(x: Double, y: Double, z: Double): Double {
    var max: Double
    if (x > y) {
        max = x
    } else {
        max = y
    }
    if (z > max) {
        max = z
    }
    return max
}

fun distance(x1: Double, y1: Double, x2: Double, y2: Double): Double {
    return Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1))
}

fun checkBelongPointToCircle(x: Double, y: Double, r: Double = 1.0, shiftY: Double = 0.0, shiftX: Double = 0.0): Boolean {
    return distance(shiftX, shiftY, x, y) <= r
}

fun checkBelongPointToRhomb(x: Double, y: Double): Boolean {
//    return (y <= -x + 1 && x >= 0 && y >= 0) &&
//            (y <= x + 1 && x <=0 && y >= 0) &&
//            (y >= -x - 1 && x <= 0 && y <= 0) &&
//            (y >= x - 1 && x >= 0 && y >= 0)
    return abs(x) + abs(y) <= 1
}

fun checkBelongPointToArea2(x: Double, y: Double): Boolean {
    return checkBelongPointToCircle(x, y) && !checkBelongPointToRhomb(x, y)
}

fun checkBelongPointToArea3(x: Double, y: Double): Boolean {
    return (checkBelongPointToCircle(x, y) && y >= 0) ||
            (checkBelongPointToRhomb(x, y) && y <= 0)
}

fun checkBelongPointToArea4(x: Double, y: Double): Boolean {
//    return (x >= 0 && y >= 0 && checkBelongPointToCircle(x, y) && !checkBelongPointToRhomb(x, y))
//            || ( x < 0 && y < 0 && checkBelongPointToCircle(x, y) && !checkBelongPointToRhomb(x, y))
//    return checkBelongPointToCircle(x, y) && !checkBelongPointToRhomb(x, y)
//            && (x >= 0 && y >= 0 || x < 0 && y < 0)
    return checkBelongPointToCircle(x, y) && !checkBelongPointToRhomb(x, y) && x*y >= 0
}

fun checkBelongPointToArea5(x: Double, y: Double): Boolean {
//    return (x <=0 && y >= 0 && checkBelongPointToCircle(x, y, shiftY = 0.5) && checkBelongPointToRhomb(x, y) ||
//            x >= 0 && y < 0 && !checkBelongPointToCircle(x, y, shiftY = 0.5) && checkBelongPointToRhomb(x, y) )
    return checkBelongPointToRhomb(x, y) && (x <=0 && y >= 0 && checkBelongPointToCircle(x, y, shiftY = 0.5) ||
            x >= 0 && y < 0 && !checkBelongPointToCircle(x, y, shiftY = 0.5) )
}

fun checkBelongPointToArea6(x: Double, y: Double): Boolean {
    return ( x <= 0 && y >= 0 && checkBelongPointToCircle(x, y, shiftY = 0.5, shiftX = 0.5)
            && !checkBelongPointToRhomb(x, y) )
            || (x >= 0 && y <= 0 &&
            (!checkBelongPointToCircle(x, y, shiftY = 0.5, shiftX = 0.5) && checkBelongPointToRhomb(x, y)
            || checkBelongPointToCircle(x, y, shiftY = 0.5, shiftX = 0.5) && !checkBelongPointToRhomb(x, y)) )
}

fun main() {
//    println(max2(123.5, 85.0))
//    println(max3(123.5, 85.0, 859.0))
//    println(max2(max2(123.5, 85.0), 859.0))
//    println(distance(1.0, 2.0, 4.0, 6.0))
//    println(checkBelongPointToCircle(1.0, 3.0, 2.0))
//    println(checkBelongToArea(0.1, 1.1))
}