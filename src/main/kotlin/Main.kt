package org.example

//class Computer {
//    var formFactor1: String? = null
//    var color1: String? = null
//    var ssd1: Int? = null
//    var processor1: String? = null
//    var isRemotable: Boolean? = null
//}



fun main() {

//    val formFactor1: String = "Monoblock"
//    val color1: String = "Black"
//    val ssd1 = 1024
//    val processor1 = "Intel core i5"
//
//    val formFactor2: String = "Monoblock"
//    val color2: String = "Black"
//    val ssd2 = 1024
//    val processor2 = "Intel core i5"
//
//    val computer1: Array<Any> = arrayOf(formFactor1, color1, ssd1, processor1)
//    val computer2: Array<Any> = arrayOf(formFactor2, color2, ssd2, processor2)

//    for (i in 0..<computer1.size) {
//        computer1[i] =
//    }

//    val computer1: Computer = Computer()
//    computer1.color1 = "Black"
//    computer1.processor1 = "Intel core i5"
//    computer1.ssd1 = 1024
//    computer1.formFactor1 = "Monoblock"
//    computer1.isRemotable = false
//
//    val computer2: Computer = Computer()
//    computer1.color1 = "White"
//    computer1.processor1 = "Intel core i5"
//    computer1.ssd1 = 1024
//    computer1.formFactor1 = "Monoblock"
//    computer1.isRemotable = false

    val computer1: Computer = Computer(
        isRemotable = false,
        formFactor = "Monoblock",
        color = "Black",
        ssd = 1024,
        processor = "Intel core i5",
    )
    computer1.power()
    computer1.scenario1()
//    computer1.testDelay()
//    computer1.show()
//    computer1.downloadFile(50)
//    computer1.show()
//    computer1.changeSsd(2048)
//    computer1.show()
//    computer1.displayState()
//    computer1.power()
//    computer1.displayState()


//    val computers = arrayOf(computer1, computer2)
}