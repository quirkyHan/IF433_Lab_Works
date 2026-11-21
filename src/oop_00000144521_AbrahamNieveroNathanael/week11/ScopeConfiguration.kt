package oop_00000144521_AbrahamNieveroNathanael.week11

data class User(var name: String = "", var age: Int = 0)

fun main(){
    println("=== Test Apply ===")
    val user = User().apply{
        name = "Alex"
        age = 25
    }
    println(user)
}