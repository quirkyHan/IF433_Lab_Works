package oop_00000144521_AbrahamNieveroNathanael.week09

fun main(){
    println("=== test list ===")
    val frameworks: List<String> = listOf("Kotlin", "Java", "C++")
    println("Immutable list: $frameworks")

    val scores: MutableList<Int> = mutableListOf(85, 90)
    scores.add(95)
    scores[0] = 88
    println("Mutable list: $scores")
}