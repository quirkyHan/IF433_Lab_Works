package oop_00000144521_AbrahamNieveroNathanael.week04

open class Vehicle(val brand: String){
    var speed: Int = 0

    open fun accelerate() {
        speed+=10

        println("$brand melaju, kecepatan $speed km/jam")
    }

    open fun honk(){
        println("BEERPPP")
    }
}
