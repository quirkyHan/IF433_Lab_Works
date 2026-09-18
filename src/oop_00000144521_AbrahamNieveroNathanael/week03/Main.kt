package oop_00000144521_AbrahamNieveroNathanael.week03

fun main(){
    val e = Employee("Budi")
    e.salary = -1000
    e.salary = 50000000
    println("Gaji: ${e.salary}")

    e.increasePerformance()

    println("Pajak yang harus dibayar: ${e.tax}")
}