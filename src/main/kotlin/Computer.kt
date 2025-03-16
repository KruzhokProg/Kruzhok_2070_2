package org.example

/**
 * @param formFactor форм фактор компьютера
 * @param color
 * @param ssd
 * @param processor
 * @param isRemotable
 *
 * @author Иванов Иван
 */
class Computer(
    private var formFactor: String,
    private var color: String,
    private var ssd: Int,
    private var processor: String,
    private var isRemotable: Boolean
) {
    private var isTurnedOn = false
    private var currentFreeSpace = ssd

    /**
     * Функция включения компьютера
     */
    fun power() {
        isTurnedOn = !isTurnedOn
    }

    fun changeSsd(newSize: Int) {
        currentFreeSpace = newSize - (ssd - currentFreeSpace)
        ssd = newSize
    }

    fun downloadFile(size: Int) {
        if (!isTurnedOn) {
            power()
        }
        for (i in 1..size) {
            Thread.sleep(200)
            if (i % 10 == 0) {
                print("${i}гб")
            } else {
                print(".")
            }
        }
        currentFreeSpace -= size
        println("\nФайл скачан")
    }

    fun scenario1() {
        println("Компьютер включён")
        power()
        downloadFile(100)
        power()
        println("Компьютер выключен")
    }

    fun show() {
        println("\nКомпьютер\nпроцессор: $processor\nформ-фактор:$formFactor\nцвет: $color\nssd: $ssd\nмобильный: $isRemotable\nсвободное место: $currentFreeSpace\n")
    }

    fun displayState() {
        println("Состояние компьютера: ${if (isTurnedOn) "Включен" else "Выключен"}")
    }
}