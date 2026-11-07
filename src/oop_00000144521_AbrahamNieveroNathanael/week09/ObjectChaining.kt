package oop_00000144521_AbrahamNieveroNathanael.week09

data class Student(val name: String, val gpa: Double)

fun main(){
    val students = listOf(
        Student("Andi", 3.2),
        Student("Budi", 3.9),
        Student("Citra", 2.8),
        Student("Dewi", 3.7)
    )
}