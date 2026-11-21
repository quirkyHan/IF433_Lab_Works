package oop_00000144521_AbrahamNieveroNathanael.week11

fun main(){
    println("=== Test Extension Functions ===")
    println("Alex".addGreeting())
    println("Hi".repeatTimes(3))

    val text: String? = null
    println("Apakah null/empty, ${text.isNullOrEmptyCustom()}")
}