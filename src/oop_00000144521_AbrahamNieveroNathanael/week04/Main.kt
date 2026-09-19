package oop_00000144521_AbrahamNieveroNathanael.week04

fun main(){
    println("---Testing Vehicle---")
    val generableVehicle = Vehicle(brand = "Sepeda Onthel")
    generableVehicle.honk()
    generableVehicle.accelerate()

    println("\n ---Testing Car---")
    val myCar = Car(brand = "Toyota", 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()
}