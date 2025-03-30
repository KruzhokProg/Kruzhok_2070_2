package org.example

import java.util.StringTokenizer

interface EatCollectable {
    fun collect()
}

/**
 * @param name название
 * @param limbsNumber количество конечностей
 * @param supplyType тип питания
 * @param среда обитания
 */
open class Animal(
    val name: String?,
    val limbsNumber: Int,
    val supplyType: SupplyType, // плотоядное, травоядное, всеядное
    val habitat: Habitat, // водное, почвенное, наземно-воздушное, организменное,
    val type: Type
) {
    open fun move() {
        println("$name двигается")
    }
}

open class CarnivorousFish(
    name: String,
    limbsNumber: Int
): Animal(name, limbsNumber, SupplyType.CARNIVOROUS, Habitat.AQUATIC, Type.FISH), EatCollectable {
    override fun move() {
        super.move()
        println("$name плывёт")
    }

    override fun collect() {
        println("$name охотиться")
    }
}

open class HerbivoreFish(
    name: String,
    limbsNumber: Int
): Animal(name, limbsNumber, SupplyType.HERBIVORE, Habitat.AQUATIC, Type.FISH), EatCollectable {
    override fun move() {
        super.move()
        println("$name плывёт")
    }

    override fun collect() {
        println("$name собирает")
    }

//    fun collect() {
//        println("$name ищет еду")
//    }
}

class Shark(name: String): CarnivorousFish(name, 4)

class Perch(name: String): HerbivoreFish(name, 4)

class Dolphin(name: String): Animal(name, 4, SupplyType.CARNIVOROUS, Habitat.AQUATIC, Type.MAMMAL)

enum class Type {
    MAMMAL,
    FISH,
    BIRDS
}

/**
 * Тип питания
 */
enum class SupplyType {
    /**
     * Плотоядное
     */
    CARNIVOROUS,

    /**
     * Травоядное
     */
    HERBIVORE,

    /**
     * Всеядное
     */
    OMNIVOROUS
}

/**
 * Среда обитания
 */
enum class Habitat {
    /**
     * Водная
     */
    AQUATIC,

    /**
     * Почвенная
     */
    SOIL,

    /**
     * наземно-воздушная
     */
    TERRESTRIAL_AERIAL,

    /**
     * организменная
     */
    ORGANISMAL
}

fun main() {
    val animal1 = Animal(
        "Тигр",
        4,
        SupplyType.CARNIVOROUS,
        Habitat.TERRESTRIAL_AERIAL,
        Type.MAMMAL
    )
    val shark1 = Shark("Акулёнок Лулу")
    val perch1 = Perch("Окунь обыкновенный")
    val animals:List<EatCollectable> = listOf(shark1, perch1)
    animals.forEach {
        it.collect()
    }
//    shark1.move()
//    animal1.move()
}