package oop_00000144521_AbrahamNieveroNathanael.week04

fun main() {
    val manager = Manager("Aramarmamsam", 99999)
    val developer = Developer("samasm", 100000, "Kontlin")

    manager.work()
    println(manager.calculateBonus())

    developer.work()
    println(developer.calculateBonus())
}