package oop_00000144521_AbrahamNieveroNathanael.week04

open class Car(brand: String, val numberOfDoors: Int): Vehicle(brand){
    fun openTrunk(){
        println("Bagasi mobil $brand dengan $numberOfDoors pintu dibuka")
    }

    override fun honk(){
        println("Minggir lu miskin, mobil $brand mau lewat!")
    }
}