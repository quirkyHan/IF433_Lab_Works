package oop_00000144521_AbrahamNieveroNathanael.week09

fun main(){
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8)
    println("Original data: $numbers")
    println("\n=== HOF Filter ===")
    val evens = numbers.filter { it % 2 == 0 }
    println("Events only : $evens")

    println("\n === HOF Map")
    val multiplied = evens.map{it * 10}
    val asStrings = multiplied.map{"Rp ${it}k"}
    println("Multiplied $multiplied")
    println("As strings $asStrings")
}