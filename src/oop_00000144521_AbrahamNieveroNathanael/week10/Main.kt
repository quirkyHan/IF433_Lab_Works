package oop_00000144521_AbrahamNieveroNathanael.week10

fun main(){
    println("=== Tes Generic Class ===")
    val intBox = Box(100)
    val stringBox = Box("Generics in Kotlin")

    println("Isi intBox: ${intBox.value}")
    println("Isi stringBox: ${stringBox.value}")
}