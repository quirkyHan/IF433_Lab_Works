package oop_00000144521_AbrahamNieveroNathanael.week03

fun main() {
    val e = Employee("Budi")
    e.salary = -1000
    e.salary = 5000000
    println("gaji: ${e.salary}")

    e.increasePerformace()

    println("Pajak yang harus dibayar: ${e.tax}")
}