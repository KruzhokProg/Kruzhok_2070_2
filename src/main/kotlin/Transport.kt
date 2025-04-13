package org.example

import kotlin.random.Random

abstract class Transport {
    abstract val capacity: Int
    abstract fun move()
    abstract fun getSeatScheme()
}

abstract class Aircraft : Transport() {
    abstract val model: String
    abstract val engineCount: Int
    abstract val altitude: Int

    /** Количество проходов */
    abstract val numberOfPasses: Int

    /** Количество рядов */
    abstract val rows: Int

    /** Количество мест в ряду */
    abstract val seatsInRow: Int

    val seatScheme = List(rows) {
        MutableList<String>(seatsInRow) {
            "_"
        }
    }

    fun takeRandomSeats() {
        repeat(capacity) {
            seatScheme[Random.nextInt(0, rows)][Random.nextInt(0, seatsInRow)] = "X"
        }
    }

    override fun move() {
        println("Летит")
    }

    override val capacity: Int
        get() = rows * seatsInRow

    override fun getSeatScheme() {
        seatScheme.forEachIndexed { row, seats ->
            print("${row + 1} ")
            seats.forEach { seat ->
                print(seat)
            }
            println()
        }
    }
}

class Boeing737: Aircraft() {
    override val model: String
        get() = "Boeing"
    override val engineCount: Int
        get() = 2
    override val altitude: Int
        get() = 12_000
    override val numberOfPasses: Int
        get() = 1
    override val rows: Int
        get() = 10
    override val seatsInRow: Int
        get() = 4
}

fun main() {
    val boeing = Boeing737()
    boeing.takeRandomSeats()
    boeing.getSeatScheme()
}