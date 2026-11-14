package oop_00000144521_AbrahamNieveroNathanael.week10

fun main(){
    println("=== Tes Generic Class ===")
    val intBox = Box(100)
    val stringBox = Box("Generics in Kotlin")

    println("Isi intBox: ${intBox.value}")
    println("Isi stringBox: ${stringBox.value}")

    println("\n=== Test Multiple Parameters ===")
    val itemPrice = PairBox("Bitcoin", 65000)
    println("Aset: ${itemPrice.key}, Harga: ${itemPrice.value} USD")

    println("\n=== Test Generic Functions ===")
    printData(3.14)
    val result = processData("Stable Coin")
    println("Hasil proses: $result")

    println("\n=== Test Constraints ===")
    val math = MathBox(10.5, 20)
    println("Total: ${math.sum()}")
    println("Terbesar: ${getMax(45, 90)}")
}