package oop_00000144521_AbrahamNieveroNathanael.week11

data class User(var name: String = "", var age: Int = 0)

fun main(){
    println("=== Test Apply ===")
    val user = User().apply{
        name = "Alex"
        age = 25
    }
    println(user)

    println("\n=== Test Also ===")
    val numbers = mutableListOf(1,2,3)
    numbers.also{
        println("Log sebelum ditambahkan: $it")
    }.add(4)
    println("Log setelah ditambahkan: $numbers")

    println("\n=== Test With ===")
    with(user){
        println("User Detail -> Nama: $name, Umur: $age")
    }
}